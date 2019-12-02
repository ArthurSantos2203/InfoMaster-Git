package DAO;

import model.ModelCaixa;
import conexoes.ConexaoMySql;
import java.util.ArrayList;

/**
 *
 * @author contato@blsoft.com.br
 */
public class DAOCaixa extends ConexaoMySql {

    /**
     * grava Caixa
     *
     * @param pModelCaixa return int
     */
    public int salvarCaixaDAO(ModelCaixa pModelCaixa) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO caixa ("
                    + "caixa_numero,"
                    + "dinheiro,"
                    + "cheque,"
                    + "cartao,"
                    + "vale,"
                    + "codigo_usuario,"
                    + "status,"
                    + "data_abertura"
                    + ") VALUES ("
                    + "'" + pModelCaixa.getCaixaNumero() + "',"
                    + "'" + pModelCaixa.getDinheiro() + "',"
                    + "'" + pModelCaixa.getCheque() + "',"
                    + "'" + pModelCaixa.getCartao() + "',"
                    + "'" + pModelCaixa.getConvenio() + "',"
                    + "'" + pModelCaixa.getCodigoUsuario() + "',"
                    + "'" + pModelCaixa.getStatus() + "',"
                    + "'" + pModelCaixa.getDataAbertura() + "'"
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
     * recupera Caixa
     *
     * @param pCodigo return ModelCaixa
     */
    public ModelCaixa getCaixaDAO(int pCodigo) {
        ModelCaixa modelCaixa = new ModelCaixa();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "codigo,"
                    + "caixa_numero,"
                    + "dinheiro,"
                    + "cheque,"
                    + "cartao,"
                    + "vale,"
                    + "codigo_usuario,"
                    + "status,"
                    + "data_abertura,"
                    + "data_fechamento "
                    + "FROM caixa "
                    + " WHERE"
                    + " caixa_numero = '" + pCodigo + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelCaixa.setCodigo(this.getResultSet().getInt(1));
                modelCaixa.setCaixaNumero(this.getResultSet().getInt(2));
                modelCaixa.setDinheiro(this.getResultSet().getFloat(3));
                modelCaixa.setCheque(this.getResultSet().getFloat(4));
                modelCaixa.setCartao(this.getResultSet().getFloat(5));
                modelCaixa.setConvenio(this.getResultSet().getFloat(6));
                modelCaixa.setCodigoUsuario(this.getResultSet().getInt(7));
                modelCaixa.setStatus(this.getResultSet().getInt(8));
                modelCaixa.setDataAbertura(this.getResultSet().getDate(9));
                modelCaixa.setDataFechamento(this.getResultSet().getDate(10));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelCaixa;
    }

    /**
     * recupera uma lista de Caixa return ArrayList
     */
    public ArrayList<ModelCaixa> getListaCaixaDAO() {
        ArrayList<ModelCaixa> listamodelCaixa = new ArrayList();
        ModelCaixa modelCaixa = new ModelCaixa();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "codigo,"
                    + "caixa_numero,"
                    + "dinheiro,"
                    + "cheque,"
                    + "cartao,"
                    + "vale,"
                    + "codigo_usuario,"
                    + "status,"
                    + "data_abertura,"
                    + "data_fechamento "
                    + " FROM"
                    + " caixa"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelCaixa = new ModelCaixa();
                modelCaixa.setCodigo(this.getResultSet().getInt(1));
                modelCaixa.setCaixaNumero(this.getResultSet().getInt(2));
                modelCaixa.setDinheiro(this.getResultSet().getFloat(3));
                modelCaixa.setCheque(this.getResultSet().getFloat(4));
                modelCaixa.setCartao(this.getResultSet().getFloat(5));
                modelCaixa.setConvenio(this.getResultSet().getFloat(6));
                modelCaixa.setCodigoUsuario(this.getResultSet().getInt(7));
                modelCaixa.setStatus(this.getResultSet().getInt(8));
                modelCaixa.setDataAbertura(this.getResultSet().getDate(9));
                modelCaixa.setDataFechamento(this.getResultSet().getDate(10));
                listamodelCaixa.add(modelCaixa);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelCaixa;
    }

    /**
     * atualiza Caixa
     *
     * @param pModelCaixa return boolean
     */
    public boolean atualizarCaixaDAO(ModelCaixa pModelCaixa) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE caixa SET "
                    + "caixa_numero = '" + pModelCaixa.getCaixaNumero() + "',"
                    + "dinheiro = '" + pModelCaixa.getDinheiro() + "',"
                    + "cheque = '" + pModelCaixa.getCheque() + "',"
                    + "cartao = '" + pModelCaixa.getCartao() + "',"
                    + "vale = '" + pModelCaixa.getConvenio() + "',"
                    + "status = '" + pModelCaixa.getStatus() + "',"
                    + "data_abertura = '" + pModelCaixa.getDataAbertura() + "',"
                    + "data_fechamento = '" + pModelCaixa.getDataFechamento() + "'"
                    + " WHERE "
                    + "codigo = '" + pModelCaixa.getCodigo() + "'"
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
     * atualiza Caixa
     *
     * @param pModelCaixa return boolean
     */
    public boolean atualizarCaixaPDVDAO(ModelCaixa pModelCaixa) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE caixa SET "
                    + "dinheiro = '" + pModelCaixa.getDinheiro() + "',"
                    + "cheque = '" + pModelCaixa.getCheque() + "',"
                    + "cartao = '" + pModelCaixa.getCartao() + "',"
                    + "vale = '" + pModelCaixa.getConvenio() + "'"
                    + " WHERE "
                    + "codigo = '" + pModelCaixa.getCodigo() + "'"
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
     * exclui Caixa
     *
     * @param pCodigo return boolean
     */
    public boolean excluirCaixaDAO(int pCodigo) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM caixa "
                    + " WHERE "
                    + "codigo = '" + pCodigo + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    public ModelCaixa verificarRetorarCaixaDAO(int numeroCaixa) {
        ModelCaixa modelCaixa = new ModelCaixa();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "codigo,"
                    + "caixa_numero,"
                    + "dinheiro,"
                    + "cheque,"
                    + "cartao,"
                    + "vale,"
                    + "codigo_usuario,"
                    + "status,"
                    + "data_abertura,"
                    + "data_fechamento "
                    + "FROM caixa "
                    + " WHERE"
                    + " caixa_numero = '" + numeroCaixa + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelCaixa.setCodigo(this.getResultSet().getInt(1));
                modelCaixa.setCaixaNumero(this.getResultSet().getInt(2));
                modelCaixa.setDinheiro(this.getResultSet().getFloat(3));
                modelCaixa.setCheque(this.getResultSet().getFloat(4));
                modelCaixa.setCartao(this.getResultSet().getFloat(5));
                modelCaixa.setConvenio(this.getResultSet().getFloat(6));
                modelCaixa.setCodigoUsuario(this.getResultSet().getInt(7));
                modelCaixa.setStatus(this.getResultSet().getInt(8));
                modelCaixa.setDataAbertura(this.getResultSet().getDate(9));
                modelCaixa.setDataFechamento(this.getResultSet().getDate(10));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelCaixa;
    }

    public ModelCaixa retorarCaixaDAO(int numeroCaixa) {
        ModelCaixa modelCaixa = new ModelCaixa();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "codigo,"
                    + "caixa_numero,"
                    + "dinheiro,"
                    + "cheque,"
                    + "cartao,"
                    + "vale,"
                    + "codigo_usuario,"
                    + "status,"
                    + "data_abertura,"
                    + "data_fechamento "
                    + "FROM caixa "
                    + " WHERE"
                    + " caixa_numero = '" + numeroCaixa + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelCaixa.setCodigo(this.getResultSet().getInt(1));
                modelCaixa.setCaixaNumero(this.getResultSet().getInt(2));
                modelCaixa.setDinheiro(this.getResultSet().getFloat(3));
                modelCaixa.setCheque(this.getResultSet().getFloat(4));
                modelCaixa.setCartao(this.getResultSet().getFloat(5));
                modelCaixa.setConvenio(this.getResultSet().getFloat(6));
                modelCaixa.setCodigoUsuario(this.getResultSet().getInt(7));
                modelCaixa.setStatus(this.getResultSet().getInt(8));
                modelCaixa.setDataAbertura(this.getResultSet().getDate(9));
                modelCaixa.setDataFechamento(this.getResultSet().getDate(10));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelCaixa;
    }
}
