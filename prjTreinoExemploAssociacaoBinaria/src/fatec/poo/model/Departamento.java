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
public class Departamento {
    
    private String sigla;
    private String nome;
    private Funcionario[] funcionarios;
    private int numFunc;
    
    public Departamento(String sigla, String nome){
        this.sigla = sigla;
        this.nome = nome;
        funcionarios = new Funcionario[5];
        numFunc = 0;
    }
    
    public String getSigla(){
        return sigla;
    }
    
    public String nome(){
        return nome;
    }
    
    public void addFuncionario(Funcionario f){
        funcionarios[numFunc] = f;
        numFunc ++;
    }
    
    public void listarFuncionarios(){
        
        System.out.println("\n\nSigla: " + sigla);
        System.out.println("\n\nNome: " + nome);
        System.out.println("\n\nQtde. de Funcionários: " + numFunc);
        
        for(int x = 0; x < numFunc; x++){
            
            System.out.print(funcionarios[x].getRegistro() + "\t\t");
            System.out.print(funcionarios[x].getNome() + "\t\t");
            System.out.println(funcionarios[x].getCargo() + "\t\t");
            
        
        }        
    }
    
}
