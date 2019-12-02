package controller;

import model.ModelComprasProdutos;
import DAO.DAOComprasProdutos;
import java.util.ArrayList;

/**
*
* @author BLSoft
*/
public class ControllerComprasProdutos {

    private DAOComprasProdutos daocompras_produtos = new DAOComprasProdutos();

    /**
    * grava compras_produtos
    * @param pModelcompras_produtos
    * return int
    */
    public int salvarcompras_produtosController(ModelComprasProdutos pModelcompras_produtos){
        return this.daocompras_produtos.salvarcompras_produtosDAO(pModelcompras_produtos);
    }

    /**
    * recupera compras_produtos
    * @param pCodigo
    * return Modelcompras_produtos
    */
    public ModelComprasProdutos getcompras_produtosController(int pCodigo){
        return this.daocompras_produtos.getcompras_produtosDAO(pCodigo);
    }

    /**
    * recupera uma lista decompras_produtos
    * @param pCodigo
    * return ArrayList
    */
    public ArrayList<ModelComprasProdutos> getListacompras_produtosController(){
        return this.daocompras_produtos.getListacompras_produtosDAO();
    }
    
    /**
    * recupera uma lista decompras_produtos
    * @param pCodigo
    * return ArrayList
    */
    public ArrayList<ModelComprasProdutos> getListacompras_produtosController(int pCodigo){
        return this.daocompras_produtos.getListacompras_produtosDAO(pCodigo);
    }

    /**
    * atualiza compras_produtos
    * @param pModelcompras_produtos
    * return boolean
    */
    public boolean atualizarcompras_produtosController(ModelComprasProdutos pModelcompras_produtos){
        return this.daocompras_produtos.atualizarcompras_produtosDAO(pModelcompras_produtos);
    }

    /**
    * exclui compras_produtos
    * @param pCodigo
    * return boolean
    */
    public boolean excluircompras_produtosController(int pCodigo){
        return this.daocompras_produtos.excluircompras_produtosDAO(pCodigo);
    }
}