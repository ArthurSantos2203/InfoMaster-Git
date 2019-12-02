/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import controller.ControllerClienteCidadeEstado;
import controller.ControllerEmpresaCidadeEstado;
import controller.ControllerProdutos;
import controller.ControllerVendas;
import controller.ControllerVendasProdutos;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.ModelClienteCidadeEstado;
import model.ModelEmpresaCidadeEstado;
import model.ModelVendas;
import model.ModelVendasProdutos;

/**
 *
 * @author leand
 */
public class GerarCupom {

    ControllerVendasProdutos controllerVendasProdutos = new ControllerVendasProdutos();
    ControllerProdutos controllerProdutos = new ControllerProdutos();
    ControllerVendas controllerVendas = new ControllerVendas();
    ControllerEmpresaCidadeEstado controllerEmpresaCidadeEstado = new ControllerEmpresaCidadeEstado();
    ArrayList<ModelVendasProdutos> listaModelVendasProdutoses = new ArrayList<>();
    ModelVendas modelVendas = new ModelVendas();
    ModelEmpresaCidadeEstado modelEmpresaCidadeEstado = new ModelEmpresaCidadeEstado();
    BLMascaras bLMascaras = new BLMascaras();
    ModelClienteCidadeEstado modelClienteCidadeEstado = new ModelClienteCidadeEstado();
    ControllerClienteCidadeEstado controllerClienteCidadeEstado = new ControllerClienteCidadeEstado();

    public String geraCupomCozinha(int pCodigo) throws IOException {
        String textoParaImprimir = "";
        try {

            modelVendas = controllerVendas.getVendasController(pCodigo);
            listaModelVendasProdutoses = controllerVendasProdutos.getListaVendasProdutosController(pCodigo);
            modelEmpresaCidadeEstado = controllerEmpresaCidadeEstado.getEmpresaCidadeEstadoController(1);

            //data e hora do sistema
            String data = "dd/MM/yyyy";
            String hora = "h:mm - a";
            String data1, hora1;
            java.util.Date agora = new java.util.Date();
            SimpleDateFormat formata = new SimpleDateFormat(data);
            data1 = formata.format(agora);
            formata = new SimpleDateFormat(hora);
            hora1 = formata.format(agora);
            //fim data e hora do sistema

            String conteudoFor = "";
            for (int i = 0; i < listaModelVendasProdutoses.size(); i++) {
                conteudoFor += listaModelVendasProdutoses.get(i).getQuantidade() + " x " + controllerProdutos.getProdutosController(listaModelVendasProdutoses.get(i).getCodigo_produto()).getNome() + " - " + listaModelVendasProdutoses.get(i).getCodigo_venda() + "\n\r";
            }
            //armazenar em uma string o texto(cupom) para imprimir
            textoParaImprimir = (modelEmpresaCidadeEstado.getModelEmpresa().getNomeFantasia() + "\n\r"
                    + modelEmpresaCidadeEstado.getModelEmpresa().getEndereco() + "\n\r"
                    + modelEmpresaCidadeEstado.getModelCidade().getNome() + "-" + modelEmpresaCidadeEstado.getModelEstado().getUf() + "\n\r"
                    + modelEmpresaCidadeEstado.getModelEmpresa().getCnpj() + "\n\r"
                    + "Data venda: " + modelVendas.getDataVenda() + "\n\r" + "Impressao:" + data1 + "-" + hora1 + "\n\r"
                    + "--------------------------------\n\r"
                    + "        CUPOM COZINHA        \n\r"
                    + "--------------------------------\n\r"
                    + "QT   DESCRICAO   OBS.\n\r"
                    + conteudoFor + ""
                    + "--------------------------------\n\r"
                    + "Valor bruto: " + bLMascaras.arredondamentoComPontoDuasCasasString(modelVendas.getValorTotal()) + "\n\r"
                    + "   Desconto: " + bLMascaras.arredondamentoComPontoDuasCasasString(modelVendas.getDesconto()) + "\n\r"
                    + "Valor total: " + bLMascaras.arredondamentoComPontoDuasCasasString(modelVendas.getValorTotal() - modelVendas.getDesconto()) + "\n\r"
                    + "\n\r\n\r\n\r\n\r\f");
            //chamar metodo para imprimir
            // /n/r para novas linhas e /f para fim da pagina  
        } catch (Exception e) {
            textoParaImprimir = "erro";
            JOptionPane.showMessageDialog(null, "Erro ao imprimir");
        }
        return textoParaImprimir;

    }

    public String geraCupomDelivery(int pCodigo) throws IOException {
        String textoParaImprimir = "";
        modelVendas = controllerVendas.getVendasController(pCodigo);
        listaModelVendasProdutoses = controllerVendasProdutos.getListaVendasProdutosController(pCodigo);
        modelEmpresaCidadeEstado = controllerEmpresaCidadeEstado.getEmpresaCidadeEstadoController(1);
        modelClienteCidadeEstado = controllerClienteCidadeEstado.getClienteCidadeEstadoController(modelVendas.getClientesCodigo());

        //data e hora do sistema
        String data = "dd/MM/yyyy";
        String hora = "h:mm - a";
        String data1, hora1;
        java.util.Date agora = new java.util.Date();
        SimpleDateFormat formata = new SimpleDateFormat(data);
        data1 = formata.format(agora);
        formata = new SimpleDateFormat(hora);
        hora1 = formata.format(agora);
        //fim data e hora do sistema

        try {

            String conteudoFor = "";
            for (int i = 0; i < listaModelVendasProdutoses.size(); i++) {
                conteudoFor += listaModelVendasProdutoses.get(i).getQuantidade() + " x " + controllerProdutos.getProdutosController(listaModelVendasProdutoses.get(i).getCodigo_produto()).getNome() + " - " + listaModelVendasProdutoses.get(i).getCodigo_venda() + "\n\r";
            }
            //armazenar em uma string o texto(cupom) para imprimir
            textoParaImprimir = (modelEmpresaCidadeEstado.getModelEmpresa().getNomeFantasia() + "\n\r"
                    + modelEmpresaCidadeEstado.getModelEmpresa().getEndereco() + "\n\r"
                    + modelEmpresaCidadeEstado.getModelCidade().getNome() + "-" + modelEmpresaCidadeEstado.getModelEstado().getUf() + "\n\r"
                    + modelEmpresaCidadeEstado.getModelEmpresa().getCnpj() + "\n\r"
                    + "Data venda: " + modelVendas.getDataVenda() + "\n\r" + "Impressao:" + data1 + "-" + hora1 + "\n\r"
                    + "--------------------------------\n\r"
                    + "         CUPOM DELIVERY         \n\r"
                    + "--------------------------------\n\r"
                    + "             CLIENTE            \n\r"
                    + "--------------------------------\n\r"
                    + modelClienteCidadeEstado.getModelCliente().getNome() + "\n\r"
                    + modelClienteCidadeEstado.getModelCliente().getTelefone() + "\n\r"
                    + modelClienteCidadeEstado.getModelCliente().getEndereco() + "\n\r"
                    + modelClienteCidadeEstado.getModelCliente().getBairro() + "\n\r"
                    + "--------------------------------\n\r"
                    + "QT   DESCRICAO   OBS.\n\r"
                    + conteudoFor + ""
                    + "--------------------------------\n\r"
                    + "Valor bruto: " + bLMascaras.arredondamentoComPontoDuasCasasString(modelVendas.getValorTotal()) + "\n\r"
                    + "   Desconto: " + bLMascaras.arredondamentoComPontoDuasCasasString(modelVendas.getDesconto()) + "\n\r"
                    + "Valor total: " + bLMascaras.arredondamentoComPontoDuasCasasString(modelVendas.getValorTotal() - modelVendas.getDesconto()) + "\n\r"
                    + "OBS: " + modelVendas.getObservacao() + "\n\r"
                    + "\n\r\n\r\n\r\n\r\f");
            //chamar metodo para imprimir
            // /n/r para novas linhas e /f para fim da pagina  
        } catch (Exception e) {
            textoParaImprimir = "erro";
            JOptionPane.showMessageDialog(null, "Erro ao imprimir");
        }
        return textoParaImprimir;

    }

    public String gerarCupomPDV(int pCodigo) throws IOException {
        modelVendas = controllerVendas.getVendasController(pCodigo);
        listaModelVendasProdutoses = controllerVendasProdutos.getListaVendasProdutosController(pCodigo);
        modelEmpresaCidadeEstado = controllerEmpresaCidadeEstado.getEmpresaCidadeEstadoController(1);

        String textoParaImprimir = "";
        //data e hora do sistema
        String data = "dd/MM/yyyy";
        String hora = "h:mm - a";
        String data1, hora1;
        java.util.Date agora = new java.util.Date();
        SimpleDateFormat formata = new SimpleDateFormat(data);
        data1 = formata.format(agora);
        formata = new SimpleDateFormat(hora);
        hora1 = formata.format(agora);
        //fim data e hora do sistema

        try {

            String conteudoFor = "";
            for (int i = 0; i < listaModelVendasProdutoses.size(); i++) {
                conteudoFor += listaModelVendasProdutoses.get(i).getQuantidade() + " x " + bLMascaras.arredondamentoDoubleComPontoDuasCasasString(controllerProdutos.getProdutosController(listaModelVendasProdutoses.get(i).getCodigo_produto()).getValor()) + " - " + controllerProdutos.getProdutosController(listaModelVendasProdutoses.get(i).getCodigo_produto()).getNome() + "\n\r";
            }
            textoParaImprimir = (modelEmpresaCidadeEstado.getModelEmpresa().getNomeFantasia() + "\n\r"
                    + modelEmpresaCidadeEstado.getModelEmpresa().getEndereco() + "\n\r"
                    + modelEmpresaCidadeEstado.getModelCidade().getNome() + "-" + modelEmpresaCidadeEstado.getModelEstado().getUf() + "\n\r"
                    + modelEmpresaCidadeEstado.getModelEmpresa().getCnpj() + "\n\r"
                    + "Data venda: " + modelVendas.getDataVenda() + "\n\r" + "Impressao:" + data1 + "-" + hora1 + "\n\r"
                    + "--------------------------------\n\r"
                    + "        CUPOM NAO FISCAL        \n\r"
                    + "--------------------------------\n\r"
                    + "QT   PRECO   DESCRICAO\n\r"
                    + conteudoFor + ""
                    + "--------------------------------\n\r"
                    + "Valor bruto: " + bLMascaras.arredondamentoComPontoDuasCasasString(modelVendas.getValorTotal()) + "\n\r"
                    + "   Desconto: " + bLMascaras.arredondamentoComPontoDuasCasasString(modelVendas.getDesconto()) + "\n\r"
                    + "  Acrescimo: " + bLMascaras.arredondamentoComPontoDuasCasasString(modelVendas.getTaxaEntrega()) + "\n\r"
                    + "Valor total: " + bLMascaras.arredondamentoComPontoDuasCasasString(modelVendas.getValorTotal() - modelVendas.getDesconto()) + "\n\r"
                    + "\n\r\n\r\n\r\n\r\f");

        } catch (Exception e) {
            textoParaImprimir = "erro";
            JOptionPane.showMessageDialog(null, "Erro ao imprimir");
        }
        return textoParaImprimir;

    }

}
