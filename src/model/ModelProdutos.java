package model;

import java.util.ArrayList;

/**
 * @author  BLSoft
 * www.Blsoft.com.br
 * Venda de software e código fonte
*/
public class ModelProdutos {

    private int codigo;
    private int fornecedoresCodigo;
    private String nome;
    private String descricaoProduto;
    private Double valor;
    private Double valorCusto;
    private String codigoBarrasEan;
    private float estoque;
    private float addEstoque;
    private ArrayList<ModelProdutos> listaModelProdutoses;
    private String imagemProduto;
    private int ativo;
    private String marca;
    private int diasGarantia;
    private int unidadeMedida;
    private int origem;
    private double peso;
    private String ncm;
    private String tipoNcm;
    private double subTribut;
    private double icmsCst;
    private double icms;
    private double icmsRed;
    private String ipiCst;
    private double ipi;
    private String pisCst;
    private double pis;
    private String cofinsCst;
    private double cofins;
    private ModelProdutos modelProdutos;

    /**
    * Construtor
    */
    public ModelProdutos(){}

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
    * seta o valor de fornecedoresCodigo
    * @param pFornecedores_codigo
    */
    public void setFornecedoresCodigo(int pFornecedores_codigo){
        this.fornecedoresCodigo = pFornecedores_codigo;
    }
    /**
    * return fornecedoresCodigo
    */
    public int getFornecedoresCodigo(){
        return this.fornecedoresCodigo;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the valor
     */
    public Double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(Double valor) {
        this.valor = valor;
    }

    /**
     * @return the valorCusto
     */
    public Double getValorCusto() {
        return valorCusto;
    }

    /**
     * @param valorCusto the valorCusto to set
     */
    public void setValorCusto(Double valorCusto) {
        this.valorCusto = valorCusto;
    }

    /**
     * @return the codigoBarrasEan
     */
    public String getCodigoBarrasEan() {
        return codigoBarrasEan;
    }

    /**
     * @param codigoBarrasEan the codigoBarrasEan to set
     */
    public void setCodigoBarrasEan(String codigoBarrasEan) {
        this.codigoBarrasEan = codigoBarrasEan;
    }

    /**
     * @return the estoque
     */
    public float getEstoque() {
        return estoque;
    }

    /**
     * @param estoque the estoque to set
     */
    public void setEstoque(float estoque) {
        this.estoque = estoque;
    }

    /**
     * @return the addEstoque
     */
    public float getAddEstoque() {
        return addEstoque;
    }

    /**
     * @param addEstoque the addEstoque to set
     */
    public void setAddEstoque(float addEstoque) {
        this.addEstoque = addEstoque;
    }

    /**
     * @return the listaModelProdutoses
     */
    public ArrayList<ModelProdutos> getListaModelProdutoses() {
        return listaModelProdutoses;
    }

    /**
     * @param listaModelProdutoses the listaModelProdutoses to set
     */
    public void setListaModelProdutoses(ArrayList<ModelProdutos> listaModelProdutoses) {
        this.listaModelProdutoses = listaModelProdutoses;
    }

    /**
     * @return the imagemProduto
     */
    public String getImagemProduto() {
        return imagemProduto;
    }

    /**
     * @param imagemProduto the imagemProduto to set
     */
    public void setImagemProduto(String imagemProduto) {
        this.imagemProduto = imagemProduto;
    }

    /**
     * @return the ativo
     */
    public int getAtivo() {
        return ativo;
    }

    /**
     * @param ativo the ativo to set
     */
    public void setAtivo(int ativo) {
        this.ativo = ativo;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the diasGarantia
     */
    public int getDiasGarantia() {
        return diasGarantia;
    }

    /**
     * @param diasGarantia the diasGarantia to set
     */
    public void setDiasGarantia(int diasGarantia) {
        this.diasGarantia = diasGarantia;
    }

    /**
     * @return the unidadeMedida
     */
    public int getUnidadeMedida() {
        return unidadeMedida;
    }

    /**
     * @param unidadeMedida the unidadeMedida to set
     */
    public void setUnidadeMedida(int unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    /**
     * @return the origem
     */
    public int getOrigem() {
        return origem;
    }

    /**
     * @param origem the origem to set
     */
    public void setOrigem(int origem) {
        this.origem = origem;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }


    /**
     * @return the ncm
     */
    public String getNcm() {
        return ncm;
    }

    /**
     * @param ncm the ncm to set
     */
    public void setNcm(String ncm) {
        this.ncm = ncm;
    }

    /**
     * @return the tipoNcm
     */
    public String getTipoNcm() {
        return tipoNcm;
    }

    /**
     * @param tipoNcm the tipoNcm to set
     */
    public void setTipoNcm(String tipoNcm) {
        this.tipoNcm = tipoNcm;
    }

    /**
     * @return the subTribut
     */
    public double getSubTribut() {
        return subTribut;
    }

    /**
     * @param subTribut the subTribut to set
     */
    public void setSubTribut(double subTribut) {
        this.subTribut = subTribut;
    }

    /**
     * @return the icmsCst
     */
    public double getIcmsCst() {
        return icmsCst;
    }

    /**
     * @param icmsCst the icmsCst to set
     */
    public void setIcmsCst(double icmsCst) {
        this.icmsCst = icmsCst;
    }

    /**
     * @return the icms
     */
    public double getIcms() {
        return icms;
    }

    /**
     * @param icms the icms to set
     */
    public void setIcms(double icms) {
        this.icms = icms;
    }

    /**
     * @return the icmsRed
     */
    public double getIcmsRed() {
        return icmsRed;
    }

    /**
     * @param icmsRed the icmsRed to set
     */
    public void setIcmsRed(double icmsRed) {
        this.icmsRed = icmsRed;
    }

    /**
     * @return the ipiCst
     */
    public String getIpiCst() {
        return ipiCst;
    }

    /**
     * @param ipiCst the ipiCst to set
     */
    public void setIpiCst(String ipiCst) {
        this.ipiCst = ipiCst;
    }

    /**
     * @return the ipi
     */
    public double getIpi() {
        return ipi;
    }

    /**
     * @param ipi the ipi to set
     */
    public void setIpi(double ipi) {
        this.ipi = ipi;
    }

    /**
     * @return the pisCst
     */
    public String getPisCst() {
        return pisCst;
    }

    /**
     * @param pisCst the pisCst to set
     */
    public void setPisCst(String pisCst) {
        this.pisCst = pisCst;
    }

    /**
     * @return the pis
     */
    public double getPis() {
        return pis;
    }

    /**
     * @param pis the pis to set
     */
    public void setPis(double pis) {
        this.pis = pis;
    }

    /**
     * @return the cofinsCst
     */
    public String getCofinsCst() {
        return cofinsCst;
    }

    /**
     * @param cofinsCst the cofinsCst to set
     */
    public void setCofinsCst(String cofinsCst) {
        this.cofinsCst = cofinsCst;
    }

    /**
     * @return the cofins
     */
    public double getCofins() {
        return cofins;
    }

    /**
     * @param cofins the cofins to set
     */
    public void setCofins(double cofins) {
        this.cofins = cofins;
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

    /**
     * @return the descricaoProduto
     */
    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    /**
     * @param descricaoProduto the descricaoProduto to set
     */
    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    @Override
    public String toString() {
        return codigo + " - " + nome;
    }


}