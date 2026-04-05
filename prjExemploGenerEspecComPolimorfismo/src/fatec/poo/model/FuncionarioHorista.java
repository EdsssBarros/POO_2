package fatec.poo.model;

/**
 *
 * @author edson.barros
 */
public class FuncionarioHorista extends Funcionario {
    
    private double valHorTrab;
    private int qtdeHorTrab;
    
    public FuncionarioHorista(int registro, String nome, String dtAdmissao, double valHorTrab){
        super(registro, nome, dtAdmissao);
        this.valHorTrab = valHorTrab;
    }
    
    public double calcSalBruto(){
        return(valHorTrab * qtdeHorTrab);
    }

    public void setQtdeHorTrab(int qtdeHorTrab) {
        this.qtdeHorTrab = qtdeHorTrab;
    }
    
    public double calcGrafificacao(){
        return (calcSalBruto() * 0.075);
    }
    
    public double calcSalLiquido(){
        return (calcSalBruto() - calcGrafificacao());
    }
}
