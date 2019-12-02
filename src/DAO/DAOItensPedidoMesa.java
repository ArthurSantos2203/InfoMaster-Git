package DAO;

import model.ModelItensPedidoMesa;
import conexoes.ConexaoMySql;
import java.util.ArrayList;

/**
 *
 * @author BLSoft
 */
public class DAOItensPedidoMesa extends ConexaoMySql {

    /**
     * grava ItensPedidoMesa
     *
     * @param pModelItensPedidoMesa return int
     */
    public int salvarItensPedidoMesaDAO(ModelItensPedidoMesa pModelItensPedidoMesa) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO itens_pedido_mesa ("
                    + "codigo,"
                    + "codigo_mesa,"
                    + "codigo_produto,"
                    + "status_pedido,"
                    + "observacao,"
                    + "quantidade "
                    + ") VALUES ("
                    + "'" + pModelItensPedidoMesa.getCodigo() + "',"
                    + "'" + pModelItensPedidoMesa.getCodigoMesa() + "',"
                    + "'" + pModelItensPedidoMesa.getCodigoProduto() + "',"
                    + "'" + pModelItensPedidoMesa.getStatusPedido() + "',"
                    + "'" + pModelItensPedidoMesa.getObservacao() + "',"
                    + "'" + pModelItensPedidoMesa.getQuantidade() + "'"
                    + ");"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * recupera ItensPedidoMesa
     *
     * @param pCodigo return ModelItensPedidoMesa
     */
    public ModelItensPedidoMesa getItensPedidoMesaDAO(int pCodigo) {
        ModelItensPedidoMesa modelItensPedidoMesa = new ModelItensPedidoMesa();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "codigo,"
                    + "codigo_mesa,"
                    + "codigo_produto,"
                    + "status_pedido,"
                    + "observacao,"
                    + "quantidade"
                    + " FROM"
                    + " itens_pedido_mesa"
                    + " WHERE"
                    + " codigo = '" + pCodigo + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelItensPedidoMesa.setCodigo(this.getResultSet().getInt(1));
                modelItensPedidoMesa.setCodigoMesa(this.getResultSet().getInt(2));
                modelItensPedidoMesa.setCodigoProduto(this.getResultSet().getInt(3));
                modelItensPedidoMesa.setStatusPedido(this.getResultSet().getString(4));
                modelItensPedidoMesa.setObservacao(this.getResultSet().getString(5));
                modelItensPedidoMesa.setQuantidade(this.getResultSet().getFloat(6));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelItensPedidoMesa;
    }

    /**
     * recupera uma lista de ItensPedidoMesa return ArrayList
     */
    public ArrayList<ModelItensPedidoMesa> getListaItensPedidoMesaDAO() {
        ArrayList<ModelItensPedidoMesa> listamodelItensPedidoMesa = new ArrayList();
        ModelItensPedidoMesa modelItensPedidoMesa = new ModelItensPedidoMesa();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "codigo,"
                    + "codigo_mesa,"
                    + "codigo_produto,"
                    + "status_pedido,"
                    + "observacao,"
                    + "quantidade "
                    + " FROM"
                    + " itens_pedido_mesa"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelItensPedidoMesa = new ModelItensPedidoMesa();
                modelItensPedidoMesa.setCodigo(this.getResultSet().getInt(1));
                modelItensPedidoMesa.setCodigoMesa(this.getResultSet().getInt(2));
                modelItensPedidoMesa.setCodigoProduto(this.getResultSet().getInt(3));
                modelItensPedidoMesa.setStatusPedido(this.getResultSet().getString(4));
                modelItensPedidoMesa.setObservacao(this.getResultSet().getString(5));
                modelItensPedidoMesa.setQuantidade(this.getResultSet().getFloat(6));
                listamodelItensPedidoMesa.add(modelItensPedidoMesa);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelItensPedidoMesa;
    }

    /**
     * retorna uma lista de mesas ocupadas sem repetir
     */
    public ArrayList<Integer> getListaMesasOcupadasDAO() {
        ArrayList<Integer> listaNumeroMesas = new ArrayList<>();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT DISTINCT "
                    + "codigo_mesa "
                    + " FROM"
                    + " itens_pedido_mesa"
                    + ";"
            );

            while (this.getResultSet().next()) {
                listaNumeroMesas.add(this.getResultSet().getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listaNumeroMesas;
    }

    /**
     * recupera uma lista de ItensPedidoMesa return ArrayList
     */
    public ArrayList<ModelItensPedidoMesa> getListaItensPedidoMesaCozinhaDAO() {
        ArrayList<ModelItensPedidoMesa> listamodelItensPedidoMesa = new ArrayList();
        ModelItensPedidoMesa modelItensPedidoMesa = new ModelItensPedidoMesa();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "codigo,"
                    + "codigo_mesa,"
                    + "codigo_produto,"
                    + "status_pedido,"
                    + "observacao,"
                    + "quantidade "
                    + " FROM"
                    + " itens_pedido_mesa "
                    + "WHERE status_pedido != 'Entregue'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelItensPedidoMesa = new ModelItensPedidoMesa();
                modelItensPedidoMesa.setCodigo(this.getResultSet().getInt(1));
                modelItensPedidoMesa.setCodigoMesa(this.getResultSet().getInt(2));
                modelItensPedidoMesa.setCodigoProduto(this.getResultSet().getInt(3));
                modelItensPedidoMesa.setStatusPedido(this.getResultSet().getString(4));
                modelItensPedidoMesa.setObservacao(this.getResultSet().getString(5));
                modelItensPedidoMesa.setQuantidade(this.getResultSet().getFloat(6));
                listamodelItensPedidoMesa.add(modelItensPedidoMesa);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelItensPedidoMesa;
    }

    /**
     * recupera uma lista de ItensPedidoMesa return ArrayList
     */
    public ArrayList<ModelItensPedidoMesa> getListaItensPedidoMesaDAO(int pCodigo) {
        ArrayList<ModelItensPedidoMesa> listamodelItensPedidoMesa = new ArrayList();
        ModelItensPedidoMesa modelItensPedidoMesa = new ModelItensPedidoMesa();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT itens_pedido_mesa.codigo, "
                    + "codigo_mesa, "
                    + "codigo_produto, "
                    + "status_pedido, "
                    + "observacao, "
                    + "quantidade "
                    + "FROM itens_pedido_mesa "
                    + "where codigo_mesa = '" + pCodigo + "'"
            );

            while (this.getResultSet().next()) {
                modelItensPedidoMesa = new ModelItensPedidoMesa();
                modelItensPedidoMesa.setCodigo(this.getResultSet().getInt(1));
                modelItensPedidoMesa.setCodigoMesa(this.getResultSet().getInt(2));
                modelItensPedidoMesa.setCodigoProduto(this.getResultSet().getInt(3));
                modelItensPedidoMesa.setStatusPedido(this.getResultSet().getString(4));
                modelItensPedidoMesa.setObservacao(this.getResultSet().getString(5));
                modelItensPedidoMesa.setQuantidade(this.getResultSet().getFloat(6));
                listamodelItensPedidoMesa.add(modelItensPedidoMesa);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelItensPedidoMesa;
    }

    /**
     * atualiza ItensPedidoMesa
     *
     * @param pModelItensPedidoMesa return boolean
     */
    public boolean atualizarItensPedidoMesaDAO(ModelItensPedidoMesa pModelItensPedidoMesa) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE itens_pedido_mesa SET "
                    + "codigo = '" + pModelItensPedidoMesa.getCodigo() + "',"
                    + "codigo_mesa = '" + pModelItensPedidoMesa.getCodigoMesa() + "',"
                    + "codigo_produto = '" + pModelItensPedidoMesa.getCodigoProduto() + "',"
                    + "status_pedido = '" + pModelItensPedidoMesa.getStatusPedido() + "',"
                    + "observacao = '" + pModelItensPedidoMesa.getObservacao() + "',"
                    + "quantidade = '" + pModelItensPedidoMesa.getQuantidade() + "'"
                    + " WHERE "
                    + "codigo = '" + pModelItensPedidoMesa.getCodigo() + "'"
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
     * atualiza status itens
     *
     * @param pModelItensPedidoMesa return boolean
     */
    public boolean atualizarStatusItemDAO(ModelItensPedidoMesa pModelItensPedidoMesa) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE itens_pedido_mesa SET "
                    + "status_pedido = '" + pModelItensPedidoMesa.getStatusPedido() + "'"
                    + " WHERE "
                    + "codigo = '" + pModelItensPedidoMesa.getCodigo() + "'"
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
     * exclui ItensPedidoMesa
     *
     * @param pCodigo return boolean
     */
    public boolean excluirItensPedidoMesaDAO(int pCodigo) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM itens_pedido_mesa "
                    + " WHERE "
                    + "codigo_mesa = '" + pCodigo + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    public boolean salvarItensPedidoMesaDAO(ArrayList<ModelItensPedidoMesa> pListaModelItensPedidoMesas) {
        try {
            this.conectar();
            int sizeLista = pListaModelItensPedidoMesas.size();
            for (int i = 0; i < sizeLista; i++) {
                this.insertSQL(
                        "INSERT INTO itens_pedido_mesa ("
                        + "codigo_mesa,"
                        + "codigo_produto,"
                        + "quantidade, "
                        + "observacao, "
                        + "horario "
                        + ") VALUES ("
                        + "'" + pListaModelItensPedidoMesas.get(i).getCodigoMesa() + "',"
                        + "'" + pListaModelItensPedidoMesas.get(i).getCodigoProduto() + "',"
                        + "'" + pListaModelItensPedidoMesas.get(i).getQuantidade() + "',"
                        + "'" + pListaModelItensPedidoMesas.get(i).getObservacao() + "',"
                        + "'" + pListaModelItensPedidoMesas.get(i).getHora() + "'"
                        + ");"
                );
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
}
