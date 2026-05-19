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
public class GameShop {
    
    private int codigo;
    private String nome;
    private int idade;
    private boolean tipoGamer;
    private int saldo;

    public GameShop(int codigo, String nome, boolean tipoGamer, int saldo) {
        this.codigo = codigo;
        this.nome = nome;
        this.tipoGamer = tipoGamer;
        this.saldo = saldo;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setTipoGamer(boolean tipoGamer) {
        this.tipoGamer = tipoGamer;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
    
    public boolean isTipoGamer(){
        return (true);
    }

    public int getSaldo() {
        return saldo;
    }
    
    
    public void jogarHoras(int jogarHoras){
        saldo -= jogarHoras;
    }
    
    public void comprarHoras(int comprarHoras){
        if (this.tipoGamer == true){
            this.saldo += comprarHoras + (comprarHoras/3);
        }
        
        else{
            this.saldo += comprarHoras;
        }
    }
    
    public void brinde(){
        this.saldo *= 2;
    }
}
