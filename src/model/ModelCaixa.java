package model;

import java.sql.Date;

/**
*
* @author contato@blsoft.com.br
*/
public class ModelCaixa {

    private int codigo;
    private double dinheiro;
    private double cheque;
    private double cartao;
    private double convenio;
    private int caixaNumero;
    private int codigoUsuario;
    private int status;
    private Date dataAbertura;
    private Date dataFechamento;
    
  
    /**
    * Construtor
    */
    public ModelCaixa(){}

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
    * seta o valor de dinheiro
    * @param pDinheiro
    */
    public void setDinheiro(double pDinheiro){
        this.dinheiro = pDinheiro;
    }
    /**
    * return dinheiro
    */
    public double getDinheiro(){
        return this.dinheiro;
    }

    /**
    * seta o valor de cheque
    * @param pCheque
    */
    public void setCheque(double pCheque){
        this.cheque = pCheque;
    }
    /**
    * return cheque
    */
    public double getCheque(){
        return this.cheque;
    }

    /**
    * seta o valor de cartao
    * @param pCartao
    */
    public void setCartao(double pCartao){
        this.cartao = pCartao;
    }
    /**
    * return cartao
    */
    public double getCartao(){
        return this.cartao;
    }

    /**
    * seta o valor de convenio
    * @param pVale
    */
    public void setConvenio(double pVale){
        this.convenio = pVale;
    }
    /**
    * return convenio
    */
    public double getConvenio(){
        return this.convenio;
    }

    @Override
    public String toString(){
        return "ModelCaixa {" + "::codigo = " + this.codigo + "::dinheiro = " + this.dinheiro + "::cheque = " + this.cheque + "::cartao = " + this.cartao + "::vale = " + this.convenio +  "}";
    }

    /**
     * @return the caixaNumero
     */
    public int getCaixaNumero() {
        return caixaNumero;
    }

    /**
     * @param caixaNumero the caixaNumero to set
     */
    public void setCaixaNumero(int caixaNumero) {
        this.caixaNumero = caixaNumero;
    }

    /**
     * @return the codigoUsuario
     */
    public int getCodigoUsuario() {
        return codigoUsuario;
    }

    /**
     * @param codigoUsuario the codigoUsuario to set
     */
    public void setCodigoUsuario(int codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    /**
     * @return the status
     */
    public int getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(int status) {
        this.status = status;
    }

    /**
     * @return the dataAbertura
     */
    public Date getDataAbertura() {
        return dataAbertura;
    }

    /**
     * @param dataAbertura the dataAbertura to set
     */
    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    /**
     * @return the dataFechamento
     */
    public Date getDataFechamento() {
        return dataFechamento;
    }

    /**
     * @param dataFechamento the dataFechamento to set
     */
    public void setDataFechamento(Date dataFechamento) {
        this.dataFechamento = dataFechamento;
    }
}