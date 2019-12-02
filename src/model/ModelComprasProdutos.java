package model;

import java.util.ArrayList;

/**
*
* @author BLSoft
*/
public class ModelComprasProdutos {

    private int codigo;
    private int codCompras;
    private int codProduto;
    private double valorCusto;
    private double valorVenda;
    private int quantidade;
    private ModelProdutos modelProdutos;
    private ArrayList<ModelComprasProdutos> listaModelComprasProdutos;

    /**
    * Construtor
    */
    public ModelComprasProdutos(){}

    /**
    * seta o valor de codigo
    * @param pCodigo
    */
    public void setCodigo(int pCodigo){
        this.codigo = pCodigo;
    }
    /**
    * return codigo
    */
    public int getCodigo(){
        return this.codigo;
    }

    /**
    * seta o valor de codCompras
    * @param pCodCompras
    */
    public void setCodCompras(int pCodCompras){
        this.codCompras = pCodCompras;
    }
    /**
    * return codCompras
    */
    public int getCodCompras(){
        return this.codCompras;
    }

    /**
    * seta o valor de codProduto
    * @param pCodProduto
    */
    public void setCodProduto(int pCodProduto){
        this.codProduto = pCodProduto;
    }
    /**
    * return codProduto
    */
    public int getCodProduto(){
        return this.codProduto;
    }

    /**
    * seta o valor de valorCusto
    * @param pValorCusto
    */
    public void setValorCusto(double pValorCusto){
        this.valorCusto = pValorCusto;
    }
    /**
    * return valorCusto
    */
    public double getValorCusto(){
        return this.valorCusto;
    }

    /**
    * seta o valor de valorVenda
    * @param pValorVenda
    */
    public void setValorVenda(double pValorVenda){
        this.valorVenda = pValorVenda;
    }
    /**
    * return valorVenda
    */
    public double getValorVenda(){
        return this.valorVenda;
    }

    /**
    * seta o valor de quantidade
    * @param pQuantidade
    */
    public void setQuantidade(int pQuantidade){
        this.quantidade = pQuantidade;
    }
    /**
    * return quantidade
    */
    public int getQuantidade(){
        return this.quantidade;
    }

    @Override
    public String toString(){
        return "Modelcompras_produtos {" + "::codigo = " + this.codigo + "::codCompras = " + this.codCompras + "::codProduto = " + this.codProduto + "::valorCusto = " + this.valorCusto + "::valorVenda = " + this.valorVenda + "::quantidade = " + this.quantidade +  "}";
    }
    /**
     * @return the listaModelComprasProdutos
     */
    public ArrayList<ModelComprasProdutos> getListaModelComprasProdutos() {
        return listaModelComprasProdutos;
    }

    /**
     * @param listaModelComprasProdutos the listaModelComprasProdutos to set
     */
    public void setListaModelComprasProdutos(ArrayList<ModelComprasProdutos> listaModelComprasProdutos) {
        this.listaModelComprasProdutos = listaModelComprasProdutos;
    }

    /**
     * @return the modelProdutos
     */
    public ModelProdutos getModelProdutos() {
        return modelProdutos;
    }

    /**
     * @param modelProdutos the modelProdutos to set
     */
    public void setModelProdutos(ModelProdutos modelProdutos) {
        this.modelProdutos = modelProdutos;
    }
}