package fatec.poo.model;

/**
 *
 * @author edson.barros
 */
public class FuncionarioMensalista extends Funcionario {
    
    private double valSalMin;
    private double numSalMin;
    
    public FuncionarioMensalista(int registro, String nome, String dtAdmissao, double ){
        
    }

    public void setValSalMin(double valSalMin) {
        this.valSalMin = valSalMin;
    }

    public void setNumSalMin(double numSalMin) {
        this.numSalMin = numSalMin;
    }
    
    public double calcSalBruto(){
        return(valSalMin * );
    }
    
}
