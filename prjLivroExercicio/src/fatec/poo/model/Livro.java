/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

/**
 *
 * @author edson.barros
 */
public class Livro {
    
    private int identificacao;
    private String titulo;
    private boolean situacao;
    private double valMultaDiaria;
    
    public Livro (int identificacao, String titulo){
        this.identificacao = identificacao;
        this.titulo = titulo;
        this.situacao = false;
    }
    
    public void setValMultaDiaria(double valMultaDiaria){
        this.valMultaDiaria = valMultaDiaria;
    }
    
    public int getIdentificacao(){
        return(identificacao);
    }
    
    public String getTitulo(){
        return(titulo);
    }
    
    public boolean getSituacao(){
        return(situacao);
    }
    
    public void emprestar(){
        this.situacao = true;
    }           
    
    public double devolver(int diasAtraso){
        this.situacao = false;
        return(diasAtraso * this.valMultaDiaria);
    }   
}
