/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edson
 */
public class Cabeleireira extends Pessoa {
    
    private String chavePix;
    private double taxaComissao;
    private double valorComissao;
    
    public Cabeleireira(String cpf, String nome, double taxaComissao){
        super(cpf, nome);
        this.taxaComissao = taxaComissao;
    }
    
    public String getChavePix(){
        return chavePix;
    }
    
    public double getTaxaComissao(){
        return taxaComissao;
    }
    
    public void setValorComissao(double valorComissao){
        this.valorComissao = valorComissao;
    }
    
    public void setChavePix(String chavePix){
        this.chavePix = chavePix;
    }
    
    public double calcTotalComissaoServicos(){
        return valorComissao += valorComissao * taxaComissao/100;
    }
}
