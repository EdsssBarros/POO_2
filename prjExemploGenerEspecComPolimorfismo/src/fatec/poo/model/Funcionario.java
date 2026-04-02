package fatec.poo.model;

/**
 *
 * @author edson.barros
 */
public abstract class Funcionario {
    
    private int registro;
    private String nome;
    private String dtAdmissao
    private Departamento departamento;
    
    public Funcionario(int registro, String nome, String dtAdmissao){
        this.registro = registro;
        this.nome = nome;
        this.dtAdmissao = dtAdmissao;
    }
    
    public String getCargo(){
        return(cargo);
    }
    
    abstract public double calcSalBruto();
    
    public double calcDesconto(){
        return(0.1 * calcSalBruto());
    }
    
    public double calcSalLiquido(){
            return(calcSalBruto() - calcDesconto());
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    
    
    
}

