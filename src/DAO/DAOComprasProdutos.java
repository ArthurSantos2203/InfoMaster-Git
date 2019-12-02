package DAO;

import model.ModelComprasProdutos;
import conexoes.ConexaoMySql;
import java.util.ArrayList;

/**
 *
 * @author BLSoft
 */
public class DAOComprasProdutos extends ConexaoMySql {

    /**
     * grava compras_produtos
     *
     * @param pModelcompras_produtos return int
     */
    public int salvarcompras_produtosDAO(ModelComprasProdutos pModelcompras_produtos) {
        try {
            this.conectar();
            int sizeLista = pModelcompras_produtos.getListaModelComprasProdutos().size();
            for (int i = 0; i < sizeLista; i++) {
                this.insertSQL(
                        "INSERT INTO compras_produtos ("
                        + "cod_compras,"
                        + "cod_produto,"
                        + "valor_custo,"
                        + "valor_venda,"
                        + "quantidade"
                        + ") VALUES ("
                        + "'" + pModelcompras_produtos.getCodCompras() + "',"
                        + "'" + pModelcompras_produtos.getListaModelComprasProdutos().get(i).getModelProdutos().getCodigo()+ "',"
                        + "'" + pModelcompras_produtos.getListaModelComprasProdutos().get(i).getModelProdutos().getValorCusto() + "',"
                        + "'" + pModelcompras_produtos.getListaModelComprasProdutos().get(i).getModelProdutos().getValor()+ "',"
                        + "'" + pModelcompras_produtos.getListaModelComprasProdutos().get(i).getModelProdutos().getEstoque()+ "'"
                        + ");"
                );
            }
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * recupera compras_produtos
     *
     * @param pCodigo return Modelcompras_produtos
     */
    public ModelComprasProdutos getcompras_produtosDAO(int pCodigo) {
        ModelComprasProdutos modelcompras_produtos = new ModelComprasProdutos();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "codigo,"
                    + "cod_compras,"
                    + "cod_produto,"
                    + "valor_custo,"
                    + "valor_venda,"
                    + "quantidade"
                    + " FROM"
                    + " compras_produtos"
                    + " WHERE"
                    + " codigo = '" + pCodigo + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelcompras_produtos.setCodigo(this.getResultSet().getInt(1));
                modelcompras_produtos.setCodCompras(this.getResultSet().getInt(2));
                modelcompras_produtos.setCodProduto(this.getResultSet().getInt(3));
                modelcompras_produtos.setValorCusto(this.getResultSet().getDouble(4));
                modelcompras_produtos.setValorVenda(this.getResultSet().getDouble(5));
                modelcompras_produtos.setQuantidade(this.getResultSet().getInt(6));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelcompras_produtos;
    }

    /**
     * recupera uma lista de compras_produtos return ArrayList
     */
    public ArrayList<ModelComprasProdutos> getListacompras_produtosDAO() {
        ArrayList<ModelComprasProdutos> listamodelcompras_produtos = new ArrayList();
        ModelComprasProdutos modelcompras_produtos = new ModelComprasProdutos();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "codigo,"
                    + "cod_compras,"
                    + "cod_produto,"
                    + "valor_custo,"
                    + "valor_venda,"
                    + "quantidade"
                    + " FROM"
                    + " compras_produtos"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelcompras_produtos = new ModelComprasProdutos();
                modelcompras_produtos.setCodigo(this.getResultSet().getInt(1));
                modelcompras_produtos.setCodCompras(this.getResultSet().getInt(2));
                modelcompras_produtos.setCodProduto(this.getResultSet().getInt(3));
                modelcompras_produtos.setValorCusto(this.getResultSet().getDouble(4));
                modelcompras_produtos.setValorVenda(this.getResultSet().getDouble(5));
                modelcompras_produtos.setQuantidade(this.getResultSet().getInt(6));
                listamodelcompras_produtos.add(modelcompras_produtos);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelcompras_produtos;
    }

    /**
     * recupera uma lista de compras_produtos return ArrayList
     */
    public ArrayList<ModelComprasProdutos> getListacompras_produtosDAO(int pCodigo) {
        ArrayList<ModelComprasProdutos> listamodelcompras_produtos = new ArrayList();
        ModelComprasProdutos modelcompras_produtos = new ModelComprasProdutos();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "codigo,"
                    + "cod_compras,"
                    + "cod_produto,"
                    + "valor_custo,"
                    + "valor_venda,"
                    + "quantidade"
                    + " FROM"
                    + " compras_produtos where cod_compras = '" + pCodigo + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelcompras_produtos = new ModelComprasProdutos();
                modelcompras_produtos.setCodigo(this.getResultSet().getInt(1));
                modelcompras_produtos.setCodCompras(this.getResultSet().getInt(2));
                modelcompras_produtos.setCodProduto(this.getResultSet().getInt(3));
                modelcompras_produtos.setValorCusto(this.getResultSet().getDouble(4));
                modelcompras_produtos.setValorVenda(this.getResultSet().getDouble(5));
                modelcompras_produtos.setQuantidade(this.getResultSet().getInt(6));
                listamodelcompras_produtos.add(modelcompras_produtos);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelcompras_produtos;
    }

    /**
     * atualiza compras_produtos
     *
     * @param pModelcompras_produtos return boolean
     */
    public boolean atualizarcompras_produtosDAO(ModelComprasProdutos pModelcompras_produtos) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE compras_produtos SET "
                    + "codigo = '" + pModelcompras_produtos.getCodigo() + "',"
                    + "cod_compras = '" + pModelcompras_produtos.getCodCompras() + "',"
                    + "cod_produto = '" + pModelcompras_produtos.getCodProduto() + "',"
                    + "valor_custo = '" + pModelcompras_produtos.getValorCusto() + "',"
                    + "valor_venda = '" + pModelcompras_produtos.getValorVenda() + "',"
                    + "quantidade = '" + pModelcompras_produtos.getQuantidade() + "'"
                    + " WHERE "
                    + "codigo = '" + pModelcompras_produtos.getCodigo() + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * exclui compras_produtos
     *
     * @param pCodigo return boolean
     */
    public boolean excluircompras_produtosDAO(int pCodigo) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM compras_produtos "
                    + " WHERE "
                    + "cod_compras = '" + pCodigo + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
}
