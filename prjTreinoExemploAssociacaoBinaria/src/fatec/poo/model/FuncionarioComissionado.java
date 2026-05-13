/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

/**
 *
 * @author edson
 */
public class FuncionarioComissionado extends Funcionario {
    
    private double salBase;
    private double taxaComissao;
    private double totalVendas;
    
    public FuncionarioComissionado(int registro, String nome, String dtAdmissao, double taxaComissao){
        super(registro, nome, dtAdmissao);
        this.taxaComissao = taxaComissao;
    }
    
    public void setSalBase(double salBase){
        this.salBase = salBase;
    }
    
    public double getSalBase(){
        return salBase;
    }
    
    public double getTotalVendas(){
        return totalVendas;
    }
    
    public double getTaxaComissao(){
        return taxaComissao;
    }
    
    public void addVendas(double vendas){
        totalVendas += vendas;
    }
    
    public double calcSalBruto(){
        return salBase + taxaComissao / (double)100.0F * totalVendas;
    }
    
    public double calcGratificacao(){
        if (this.totalVendas <= (double)5000.0F) {
         return (double)0.0F;
      } else {
         return this.totalVendas > (double)5000.0F && this.totalVendas <= (double)10000.0F ? this.calcSalBruto() * 0.03 : this.calcSalBruto() * 0.05;
      }
    }
    
    public double calcSalLiquido(){
        return super.calcSalLiquido() + this.calcGratificacao();
    }
    
    
}
