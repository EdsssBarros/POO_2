/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author edson
 */
public class Cliente extends Pessoa {
    
    private boolean fidelidade;
    
    public Cliente(String cpf, String nome, boolean fidelidade){
        super(cpf, nome);
        this.fidelidade = fidelidade;
    }
    
    public boolean getFidelidade(){
        return fidelidade;
    }
    
}
