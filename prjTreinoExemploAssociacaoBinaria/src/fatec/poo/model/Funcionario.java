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
public abstract class Funcionario {
    
    private int registro;
    private String nome;
    private String dtAdmissao;
    private String cargo;
    private Departamento departamento;
    
    public Funcionario(int registro, String nome, String dtAdmissao){
        this.registro = registro;
        this.nome = nome;
        this.dtAdmissao = dtAdmissao;
    }
    
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    
    public String getCargo(){
        return cargo;
    }
    
    abstract public double calcSalBruto();
    
    public double calcDesconto(){
        return 0.10 * calcSalBruto();
    }
    
    public double calcSalLiquido(){
        return calcSalBruto() - calcDesconto();
    }
    
    public void setDepartamento(Departamento departamento){
        this.departamento = departamento;        
    }
    
    public Departamento getDepartamento(){
        return departamento;
    }
    
}