/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edson
 */
public class Servico {
    
    private String data;
    private String descricao;
    private double valor;
    
    public Servico(String data, String descricao){
        this.data = data;
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public double calcValorPagar(Cliente cliente){
        if(cliente.getFidelidade() == true) {
            valor += valor * 0.15;
        }
        
        else{
            valor += valor;
        }
        
       return this.valor;
    }
}