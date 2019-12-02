package DAO;

import conexoes.ConexaoMySql;
import model.ModelProdutos;
import java.util.ArrayList;
import model.ModelComprasProdutos;

/**
 *
 * @author BLSoft www.Blsoft.com.br Venda de software e código fonte
 */
public class DAOProdutos extends ConexaoMySql {

    /**
     * grava Produtos
     *
     * @param pModelProdutos return int
     */
    public int salvarProdutosDAO(ModelProdutos pModelProdutos) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO produtos ("
                    + "fornecedores_codigo,"
                    + "nome,"
                    + "descricao_produto,"
                    + "valor,"
                    + "valor_custo,"
                    + "codigo_barras_ean,"
                    + "estoque,"
                    + "imagem_produto,"
                    + "ativo,"
                    + "marca,"
                    + "dias_garantia,"
                    + "unidade_medida,"
                    + "origem,"
                    + "peso,"
                    + "ncm,"
                    + "tipo_ncm,"
                    + "trib_st_perc,"
                    + "icms_cst,"
                    + "icms,"
                    + "icms_red,"
                    + "ipi_cst,"
                    + "ipi,"
                    + "pis_cst,"
                    + "pis,"
                    + "cofins_cst,"
                    + "cofins"
                    + ") VALUES ("
                    + "'" + pModelProdutos.getFornecedoresCodigo() + "',"
                    + "'" + pModelProdutos.getNome() + "',"
                    + "'" + pModelProdutos.getDescricaoProduto() + "',"
                    + "'" + pModelProdutos.getValor() + "',"
                    + "'" + pModelProdutos.getValorCusto() + "',"
                    + "'" + pModelProdutos.getCodigoBarrasEan() + "',"
                    + "'" + pModelProdutos.getEstoque() + "',"
                    + "'" + pModelProdutos.getImagemProduto() + "',"
                    + "'" + pModelProdutos.getAtivo() + "',"
                    + "'" + pModelProdutos.getMarca() + "',"
                    + "'" + pModelProdutos.getDiasGarantia() + "',"
                    + "'" + pModelProdutos.getUnidadeMedida() + "',"
                    + "'" + pModelProdutos.getOrigem() + "',"
                    + "'" + pModelProdutos.getPeso() + "',"
                    + "'" + pModelProdutos.getNcm() + "',"
                    + "'" + pModelProdutos.getTipoNcm() + "',"
                    + "'" + pModelProdutos.getSubTribut() + "',"
                    + "'" + pModelProdutos.getIcmsCst() + "',"
                    + "'" + pModelProdutos.getIcms() + "',"
                    + "'" + pModelProdutos.getIcmsRed() + "',"
                    + "'" + pModelProdutos.getIpiCst() + "',"
                    + "'" + pModelProdutos.getIpi() + "',"
                    + "'" + pModelProdutos.getPisCst() + "',"
                    + "'" + pModelProdutos.getPis() + "',"
                    + "'" + pModelProdutos.getPisCst() + "',"
                    + "'" + pModelProdutos.getCofins() + "'"
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
     * recupera Produtos
     *
     * @param pCodigo return ModelProdutos
     */
    public ModelProdutos getProdutosDAO(int pCodigo) {
        ModelProdutos modelProdutos = new ModelProdutos();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "codigo,"
                    + "fornecedores_codigo,"
                    + "nome,"
                    + "descricao_produto,"
                    + "valor,"
                    + "valor_custo,"
                    + "codigo_barras_ean,"
                    + "estoque,"
                    + "imagem_produto,"
                    + "ativo,"
                    + "marca,"
                    + "dias_garantia,"
                    + "unidade_medida,"
                    + "origem,"
                    + "peso,"
                    + "ncm,"
                    + "tipo_ncm,"
                    + "trib_st_perc,"
                    + "icms_cst,"
                    + "icms,"
                    + "icms_red,"
                    + "ipi_cst,"
                    + "ipi,"
                    + "pis_cst,"
                    + "pis,"
                    + "cofins_cst,"
                    + "cofins"
                    + " FROM"
                    + " produtos"
                    + " WHERE"
                    + " codigo = '" + pCodigo + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelProdutos.setCodigo(this.getResultSet().getInt(1));
                modelProdutos.setFornecedoresCodigo(this.getResultSet().getInt(2));
                modelProdutos.setNome(this.getResultSet().getString(3));
                modelProdutos.setDescricaoProduto(this.getResultSet().getString(4));
                modelProdutos.setValor(this.getResultSet().getDouble(5));
                modelProdutos.setValorCusto(this.getResultSet().getDouble(6));
                modelProdutos.setCodigoBarrasEan(this.getResultSet().getString(7));
                modelProdutos.setEstoque(this.getResultSet().getFloat(8));
                modelProdutos.setImagemProduto(this.getResultSet().getString(9));
                modelProdutos.setAtivo(this.getResultSet().getInt(10));
                modelProdutos.setMarca(this.getResultSet().getString(11));
                modelProdutos.setDiasGarantia(this.getResultSet().getInt(12));
                modelProdutos.setUnidadeMedida(this.getResultSet().getInt(13));
                modelProdutos.setOrigem(this.getResultSet().getInt(14));
                modelProdutos.setPeso(this.getResultSet().getDouble(15));
                modelProdutos.setNcm(this.getResultSet().getString(16));
                modelProdutos.setTipoNcm(this.getResultSet().getString(17));
                modelProdutos.setSubTribut(this.getResultSet().getDouble(18));
                modelProdutos.setIcmsCst(this.getResultSet().getDouble(19));
                modelProdutos.setIcms(this.getResultSet().getDouble(20));
                modelProdutos.setIcmsRed(this.getResultSet().getDouble(21));
                modelProdutos.setIpiCst(this.getResultSet().getString(22));
                modelProdutos.setIpi(this.getResultSet().getDouble(23));
                modelProdutos.setPisCst(this.getResultSet().getString(24));
                modelProdutos.setPis(this.getResultSet().getDouble(25));
                modelProdutos.setCofinsCst(this.getResultSet().getString(26));
                modelProdutos.setCofins(this.getResultSet().getDouble(27));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelProdutos;
    }

    /**
     * recupera Produtos
     *
     * @param pNome return ModelProdutos
     */
    public ModelProdutos getProdutosDAO(String pNome) {
        ModelProdutos modelProdutos = new ModelProdutos();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "codigo,"
                    + "fornecedores_codigo,"
                    + "nome,"
                    + "descricao_produto,"
                    + "valor,"
                    + "valor_custo,"
                    + "codigo_barras_ean,"
                    + "estoque,"
                    + "imagem_produto,"
                    + "ativo,"
                    + "marca,"
                    + "dias_garantia,"
                    + "unidade_medida,"
                    + "origem,"
                    + "peso,"
                    + "ncm,"
                    + "tipo_ncm,"
                    + "trib_st_perc,"
                    + "icms_cst,"
                    + "icms,"
                    + "icms_red,"
                    + "ipi_cst,"
                    + "ipi,"
                    + "pis_cst,"
                    + "pis,"
                    + "cofins_cst,"
                    + "cofins"
                    + " FROM"
                    + " produtos"
                    + " WHERE"
                    + " nome = '" + pNome + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelProdutos.setCodigo(this.getResultSet().getInt(1));
                modelProdutos.setFornecedoresCodigo(this.getResultSet().getInt(2));
                modelProdutos.setNome(this.getResultSet().getString(3));
                modelProdutos.setDescricaoProduto(this.getResultSet().getString(4));
                modelProdutos.setValor(this.getResultSet().getDouble(5));
                modelProdutos.setValorCusto(this.getResultSet().getDouble(6));
                modelProdutos.setCodigoBarrasEan(this.getResultSet().getString(7));
                modelProdutos.setEstoque(this.getResultSet().getFloat(8));
                modelProdutos.setImagemProduto(this.getResultSet().getString(9));
                modelProdutos.setAtivo(this.getResultSet().getInt(10));
                modelProdutos.setMarca(this.getResultSet().getString(11));
                modelProdutos.setDiasGarantia(this.getResultSet().getInt(12));
                modelProdutos.setUnidadeMedida(this.getResultSet().getInt(13));
                modelProdutos.setOrigem(this.getResultSet().getInt(14));
                modelProdutos.setPeso(this.getResultSet().getDouble(15));
                modelProdutos.setNcm(this.getResultSet().getString(16));
                modelProdutos.setTipoNcm(this.getResultSet().getString(17));
                modelProdutos.setSubTribut(this.getResultSet().getDouble(18));
                modelProdutos.setIcmsCst(this.getResultSet().getDouble(19));
                modelProdutos.setIcms(this.getResultSet().getDouble(20));
                modelProdutos.setIcmsRed(this.getResultSet().getDouble(21));
                modelProdutos.setIpiCst(this.getResultSet().getString(22));
                modelProdutos.setIpi(this.getResultSet().getDouble(23));
                modelProdutos.setPisCst(this.getResultSet().getString(24));
                modelProdutos.setPis(this.getResultSet().getDouble(25));
                modelProdutos.setCofinsCst(this.getResultSet().getString(26));
                modelProdutos.setCofins(this.getResultSet().getDouble(27));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelProdutos;
    }

    /**
     * recupera uma lista de Produtos return ArrayList
     */
    public ArrayList<ModelProdutos> getListaProdutosDAO() {
        ArrayList<ModelProdutos> listamodelProdutos = new ArrayList();
        ModelProdutos modelProdutos = new ModelProdutos();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "codigo,"
                    + "fornecedores_codigo,"
                    + "nome,"
                    + "descricao_produto,"
                    + "valor,"
                    + "valor_custo,"
                    + "codigo_barras_ean,"
                    + "estoque,"
                    + "imagem_produto,"
                    + "ativo,"
                    + "marca,"
                    + "dias_garantia,"
                    + "unidade_medida,"
                    + "origem,"
                    + "peso,"
                    + "ncm,"
                    + "tipo_ncm,"
                    + "trib_st_perc,"
                    + "icms_cst,"
                    + "icms,"
                    + "icms_red,"
                    + "ipi_cst,"
                    + "ipi,"
                    + "pis_cst,"
                    + "pis,"
                    + "cofins_cst,"
                    + "cofins"
                    + " FROM"
                    + " produtos"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelProdutos = new ModelProdutos();
                modelProdutos.setCodigo(this.getResultSet().getInt(1));
                modelProdutos.setFornecedoresCodigo(this.getResultSet().getInt(2));
                modelProdutos.setNome(this.getResultSet().getString(3));
                modelProdutos.setDescricaoProduto(this.getResultSet().getString(4));
                modelProdutos.setValor(this.getResultSet().getDouble(5));
                modelProdutos.setValorCusto(this.getResultSet().getDouble(6));
                modelProdutos.setCodigoBarrasEan(this.getResultSet().getString(7));
                modelProdutos.setEstoque(this.getResultSet().getFloat(8));
                modelProdutos.setImagemProduto(this.getResultSet().getString(9));
                modelProdutos.setAtivo(this.getResultSet().getInt(10));
                modelProdutos.setMarca(this.getResultSet().getString(11));
                modelProdutos.setDiasGarantia(this.getResultSet().getInt(12));
                modelProdutos.setUnidadeMedida(this.getResultSet().getInt(13));
                modelProdutos.setOrigem(this.getResultSet().getInt(14));
                modelProdutos.setPeso(this.getResultSet().getDouble(15));
                modelProdutos.setNcm(this.getResultSet().getString(16));
                modelProdutos.setTipoNcm(this.getResultSet().getString(17));
                modelProdutos.setSubTribut(this.getResultSet().getDouble(18));
                modelProdutos.setIcmsCst(this.getResultSet().getDouble(19));
                modelProdutos.setIcms(this.getResultSet().getDouble(20));
                modelProdutos.setIcmsRed(this.getResultSet().getDouble(21));
                modelProdutos.setIpiCst(this.getResultSet().getString(22));
                modelProdutos.setIpi(this.getResultSet().getDouble(23));
                modelProdutos.setPisCst(this.getResultSet().getString(24));
                modelProdutos.setPis(this.getResultSet().getDouble(25));
                modelProdutos.setCofinsCst(this.getResultSet().getString(26));
                modelProdutos.setCofins(this.getResultSet().getDouble(27));
                listamodelProdutos.add(modelProdutos);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelProdutos;
    }

    /**
     * recupera uma lista de Produtos return ArrayList
     */
    public ArrayList<ModelProdutos> getListaProdutosAtivosDAO() {
        ArrayList<ModelProdutos> listamodelProdutos = new ArrayList();
        ModelProdutos modelProdutos = new ModelProdutos();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "codigo,"
                    + "fornecedores_codigo,"
                    + "nome,"
                    + "descricao_produto,"
                    + "valor,"
                    + "valor_custo,"
                    + "codigo_barras_ean,"
                    + "estoque,"
                    + "imagem_produto,"
                    + "ativo,"
                    + "marca,"
                    + "dias_garantia,"
                    + "unidade_medida,"
                    + "origem,"
                    + "peso,"
                    + "ncm,"
                    + "tipo_ncm,"
                    + "trib_st_perc,"
                    + "icms_cst,"
                    + "icms,"
                    + "icms_red,"
                    + "ipi_cst,"
                    + "ipi,"
                    + "pis_cst,"
                    + "pis,"
                    + "cofins_cst,"
                    + "cofins"
                    + " FROM"
                    + " produtos "
                    + "WHERE ativo = 1;"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelProdutos = new ModelProdutos();
                modelProdutos.setCodigo(this.getResultSet().getInt(1));
                modelProdutos.setFornecedoresCodigo(this.getResultSet().getInt(2));
                modelProdutos.setNome(this.getResultSet().getString(3));
                modelProdutos.setDescricaoProduto(this.getResultSet().getString(4));
                modelProdutos.setValor(this.getResultSet().getDouble(5));
                modelProdutos.setValorCusto(this.getResultSet().getDouble(6));
                modelProdutos.setCodigoBarrasEan(this.getResultSet().getString(7));
                modelProdutos.setEstoque(this.getResultSet().getFloat(8));
                modelProdutos.setImagemProduto(this.getResultSet().getString(9));
                modelProdutos.setAtivo(this.getResultSet().getInt(10));
                modelProdutos.setMarca(this.getResultSet().getString(11));
                modelProdutos.setDiasGarantia(this.getResultSet().getInt(12));
                modelProdutos.setUnidadeMedida(this.getResultSet().getInt(13));
                modelProdutos.setOrigem(this.getResultSet().getInt(14));
                modelProdutos.setPeso(this.getResultSet().getDouble(15));
                modelProdutos.setNcm(this.getResultSet().getString(16));
                modelProdutos.setTipoNcm(this.getResultSet().getString(17));
                modelProdutos.setSubTribut(this.getResultSet().getDouble(18));
                modelProdutos.setIcmsCst(this.getResultSet().getDouble(19));
                modelProdutos.setIcms(this.getResultSet().getDouble(20));
                modelProdutos.setIcmsRed(this.getResultSet().getDouble(21));
                modelProdutos.setIpiCst(this.getResultSet().getString(22));
                modelProdutos.setIpi(this.getResultSet().getDouble(23));
                modelProdutos.setPisCst(this.getResultSet().getString(24));
                modelProdutos.setPis(this.getResultSet().getDouble(25));
                modelProdutos.setCofinsCst(this.getResultSet().getString(26));
                modelProdutos.setCofins(this.getResultSet().getDouble(27));
                listamodelProdutos.add(modelProdutos);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return listamodelProdutos;
    }

    /**
     * atualiza Produtos
     *
     * @param pModelProdutos return boolean
     */
    public boolean atualizarProdutosDAO(ModelProdutos pModelProdutos) {
        try {
            this.conectar();
            this.executarUpdateDeleteSQL(
                    "UPDATE produtos SET "
                    + "fornecedores_codigo = '" + pModelProdutos.getFornecedoresCodigo() + "',"
                    + "nome = '" + pModelProdutos.getNome() + "',"
                    + "descricao_produto = '" + pModelProdutos.getDescricaoProduto()+ "',"
                    + "codigo_barras_ean = '" + pModelProdutos.getCodigoBarrasEan() + "',"
                    + "unidade_medida = '" + pModelProdutos.getUnidadeMedida() + "',"
                    + "ativo = '" + pModelProdutos.getAtivo() + "',"
                    + "dias_garantia = '" + pModelProdutos.getDiasGarantia() + "',"
                    + "origem = '" + pModelProdutos.getOrigem() + "',"
                    + "peso = '" + pModelProdutos.getPeso() + "',"
                    + "imagem_produto = '" + pModelProdutos.getImagemProduto() + "'"
                    + " WHERE "
                    + "codigo = '" + pModelProdutos.getCodigo() + "'"
                    + ";"
            );
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * exclui Produtos
     *
     * @param pCodigo return boolean
     */
    public boolean excluirProdutosDAO(int pCodigo) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM produtos "
                    + " WHERE "
                    + "codigo = '" + pCodigo + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Tentativa de violar uma chave");
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * atualiza Produtos
     *
     * @param pModelProdutos return boolean
     */
    public boolean atualizarProdutosQuantidadeDAO(ModelProdutos pModelProdutos) {
        try {
            this.conectar();
            int sizeLista = pModelProdutos.getListaModelProdutoses().size();
            for (int i = 0; i < sizeLista; i++) {
                this.executarUpdateDeleteSQL(
                        "UPDATE produtos SET "
                        + "estoque = '" + pModelProdutos.getListaModelProdutoses().get(i).getEstoque() + "'"
                        + " WHERE "
                        + "codigo = '" + pModelProdutos.getListaModelProdutoses().get(i).getCodigo() + "'"
                        + ";"
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

    /**
     * atualiza Produtos
     *
     * @param pModelProdutos return boolean
     */
    public boolean atualizarProdutosQuantidadeValorDAO(ArrayList<ModelComprasProdutos> pListaComprasProdutos) {
        try {
            this.conectar();
            int sizeLista = pListaComprasProdutos.size();
            for (int i = 0; i < sizeLista; i++) {
                this.executarUpdateDeleteSQL(
                        "UPDATE produtos SET "
                        + "estoque = '" + pListaComprasProdutos.get(i).getModelProdutos().getAddEstoque() + "',"
                        + "valor_custo = '" + pListaComprasProdutos.get(i).getModelProdutos().getValorCusto() + "',"
                        + "valor = '" + pListaComprasProdutos.get(i).getModelProdutos().getValor() + "',"
                        + "ncm = '" + pListaComprasProdutos.get(i).getModelProdutos().getNcm() + "',"
                        + "tipo_ncm = '" + pListaComprasProdutos.get(i).getModelProdutos().getTipoNcm() + "',"
                        + "trib_st_perc = '" + pListaComprasProdutos.get(i).getModelProdutos().getSubTribut() + "',"
                        + "icms_cst = '" + pListaComprasProdutos.get(i).getModelProdutos().getIcmsCst() + "',"
                        + "icms = '" + pListaComprasProdutos.get(i).getModelProdutos().getIcms() + "',"
                        + "icms_red = '" + pListaComprasProdutos.get(i).getModelProdutos().getIcmsRed() + "',"
                        + "ipi_cst = '" + pListaComprasProdutos.get(i).getModelProdutos().getIpiCst() + "',"
                        + "ipi = '" + pListaComprasProdutos.get(i).getModelProdutos().getIpi() + "',"
                        + "pis_cst = '" + pListaComprasProdutos.get(i).getModelProdutos().getPisCst() + "',"
                        + "pis = '" + pListaComprasProdutos.get(i).getModelProdutos().getPis() + "',"
                        + "cofins_cst = '" + pListaComprasProdutos.get(i).getModelProdutos().getCofinsCst() + "',"
                        + "cofins = '" + pListaComprasProdutos.get(i).getModelProdutos().getCofins() + "'"
                        + " WHERE "
                        + "codigo = '" + pListaComprasProdutos.get(i).getModelProdutos().getCodigo() + "'"
                        + ";"
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

    /**
     * atualiza Produtos
     *
     * @param pModelProdutos return boolean
     */
    public boolean atualizarPrecoEstoqueProdutosDAO(ModelProdutos pModelProdutos) {
        try {
            this.conectar();
            this.executarUpdateDeleteSQL(
                    "UPDATE produtos SET "
                    + "estoque = '" + pModelProdutos.getEstoque() + "',"
                    + "valor_custo = '" + pModelProdutos.getValorCusto() + "',"
                    + "valor = '" + pModelProdutos.getValor() + "',"
                    + "ncm = '" + pModelProdutos.getNcm() + "',"
                    + "tipo_ncm = '" + pModelProdutos.getTipoNcm() + "',"
                    + "trib_st_perc = '" + pModelProdutos.getSubTribut() + "',"
                    + "icms_cst = '" + pModelProdutos.getIcmsCst() + "',"
                    + "icms = '" + pModelProdutos.getIcms() + "',"
                    + "icms_red = '" + pModelProdutos.getIcmsRed() + "',"
                    + "ipi_cst = '" + pModelProdutos.getIpiCst() + "',"
                    + "ipi = '" + pModelProdutos.getIpi() + "',"
                    + "pis_cst = '" + pModelProdutos.getPisCst() + "',"
                    + "pis = '" + pModelProdutos.getPis() + "',"
                    + "cofins_cst = '" + pModelProdutos.getCofinsCst() + "',"
                    + "cofins = '" + pModelProdutos.getCofins() + "'"
                    + " WHERE "
                    + "codigo = '" + pModelProdutos.getCodigo() + "'"
                    + ";"
            );
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * atualiza Produtos
     *
     * @param pModelProdutos return boolean
     */
    public boolean atualizarProdutosEstoqueDAO(ModelProdutos pModelProdutos) {
        try {
            this.conectar();
            int sizeLista = pModelProdutos.getListaModelProdutoses().size();
            for (int i = 0; i < sizeLista; i++) {
                this.executarUpdateDeleteSQL(
                        "UPDATE produtos SET "
                        + "estoque = '" + pModelProdutos.getListaModelProdutoses().get(i).getEstoque() + "'"
                        + " WHERE "
                        + "codigo = '" + pModelProdutos.getListaModelProdutoses().get(i).getCodigo() + "'"
                        + ";"
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

    /**
     * atualiza Produtos
     *
     * @param pModelProdutos return boolean
     */
    public boolean atualizarProdutosQuantidadeUmDAO(int pCodigo, float pQuantidade) {
        try {
            this.conectar();
            this.executarUpdateDeleteSQL(
                    "UPDATE produtos SET "
                    + "estoque = '" + pQuantidade + "'"
                    + " WHERE "
                    + "codigo = '" + pCodigo + "'"
                    + ";"
            );
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    public ModelProdutos getProdutosCodigoBarrasDAO(String pCodigoBarras) {
        ModelProdutos modelProdutos = new ModelProdutos();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "codigo,"
                    + "fornecedores_codigo,"
                    + "nome,"
                    + "descricao_produto,"
                    + "valor,"
                    + "valor_custo,"
                    + "codigo_barras_ean,"
                    + "estoque,"
                    + "imagem_produto,"
                    + "ativo,"
                    + "marca,"
                    + "dias_garantia,"
                    + "unidade_medida,"
                    + "origem,"
                    + "peso,"
                    + "ncm,"
                    + "tipo_ncm,"
                    + "trib_st_perc,"
                    + "icms_cst,"
                    + "icms,"
                    + "icms_red,"
                    + "ipi_cst,"
                    + "ipi,"
                    + "pis_cst,"
                    + "pis,"
                    + "cofins_cst,"
                    + "cofins"
                    + " FROM"
                    + " produtos"
                    + " WHERE"
                    + " codigo_barras_ean = '" + pCodigoBarras + "'"
                    + ";"
            );

            while (this.getResultSet().next()) {
                modelProdutos.setCodigo(this.getResultSet().getInt(1));
                modelProdutos.setFornecedoresCodigo(this.getResultSet().getInt(2));
                modelProdutos.setNome(this.getResultSet().getString(3));
                modelProdutos.setDescricaoProduto(this.getResultSet().getString(4));
                modelProdutos.setValor(this.getResultSet().getDouble(5));
                modelProdutos.setValorCusto(this.getResultSet().getDouble(6));
                modelProdutos.setCodigoBarrasEan(this.getResultSet().getString(7));
                modelProdutos.setEstoque(this.getResultSet().getFloat(8));
                modelProdutos.setImagemProduto(this.getResultSet().getString(9));
                modelProdutos.setAtivo(this.getResultSet().getInt(10));
                modelProdutos.setMarca(this.getResultSet().getString(11));
                modelProdutos.setDiasGarantia(this.getResultSet().getInt(12));
                modelProdutos.setUnidadeMedida(this.getResultSet().getInt(13));
                modelProdutos.setOrigem(this.getResultSet().getInt(14));
                modelProdutos.setPeso(this.getResultSet().getDouble(15));
                modelProdutos.setNcm(this.getResultSet().getString(16));
                modelProdutos.setTipoNcm(this.getResultSet().getString(17));
                modelProdutos.setSubTribut(this.getResultSet().getDouble(18));
                modelProdutos.setIcmsCst(this.getResultSet().getDouble(19));
                modelProdutos.setIcms(this.getResultSet().getDouble(20));
                modelProdutos.setIcmsRed(this.getResultSet().getDouble(21));
                modelProdutos.setIpiCst(this.getResultSet().getString(22));
                modelProdutos.setIpi(this.getResultSet().getDouble(23));
                modelProdutos.setPisCst(this.getResultSet().getString(24));
                modelProdutos.setPis(this.getResultSet().getDouble(25));
                modelProdutos.setCofinsCst(this.getResultSet().getString(26));
                modelProdutos.setCofins(this.getResultSet().getDouble(27));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return modelProdutos;
    }
}
