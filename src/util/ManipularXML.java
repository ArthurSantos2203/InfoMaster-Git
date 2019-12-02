/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import model.ModelConfig;
import nfe.model.ModelXmlNfe;

/**
 *
 * @author MacMini
 */
public class ManipularXML {

    /**
     * gera o arquivo config.xml
     *
     * @param pConfing
     * @return boolean
     * @throws IOException
     */
    public static void gravaXML(ModelConfig pModelConfig) {
        //Cria uma instância da classe XStream
        XStream xStream = new XStream(new DomDriver());
        //Escolher um nome para o xml
        xStream.alias("config", ModelConfig.class);
        //Grava no diretório padrão do projeto, fica na própria pasta do projeto.
        File arquivo = new File("C:\\InfoMaster\\config\\config.xml");
        FileOutputStream gravar;

        try {
            //grava o arquivo
            gravar = new FileOutputStream(arquivo);
            //insere os bytes no XML
            gravar.write(xStream.toXML(pModelConfig).getBytes());
            gravar.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static ModelConfig lerXmlConfig() {
        FileReader reader = null;
        try {
            //carrega o arquivo XML para um objeto reader
            reader = new FileReader("C:\\InfoMaster\\config\\config.xml");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //Cria o objeto xstream
        XStream xStream = new XStream(new DomDriver());
        //informamos as tags que serao lidas
        //como foi feito no metodo gerarXml002
        xStream.alias("config", ModelConfig.class);
        //cria um objeto Contato,
        //contendo os dados do xml
        ModelConfig model = (ModelConfig) xStream.fromXML(reader);
        //retornar arquivo
        return model;
    }

    public static ModelXmlNfe lerXmlNFe(String pCaminho, String pNomeArquivo) {
        FileReader reader = null;
        try {
            //carrega o arquivo XML para um objeto reader
            reader = new FileReader(pCaminho);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //Cria o objeto xstream
        XStream xStream = new XStream(new DomDriver());
        //informamos as tags que serao lidas
        //como foi feito no metodo gerarXml002
        xStream.alias(pNomeArquivo, ModelConfig.class);
        //cria um objeto Contato,
        //contendo os dados do xml
        ModelXmlNfe model = (ModelXmlNfe) xStream.fromXML(reader);
        //retornar arquivo
        return model;
    }
}
