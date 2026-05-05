package fatec.poo.model;

/**
 *
 * @author Fatec
 */
public class FuncionarioHorista extends Funcionario{
    private double valHorTrab;
    private int qtdeHorTrab;
    
    public FuncionarioHorista(int r, String n, String dta, double vht){
        super(r,n,dta); //chamada do método construtor da superclasse
        valHorTrab = vht;
    }
    
    public void setQtdeHorTrab(int qht){
        qtdeHorTrab = qht;
    }
    
    //aplicando o polimorfismo
    //sobreposição(override) do método 
    public double calcSalBruto(){
        return(valHorTrab * qtdeHorTrab);
    }
    
    public double calcGratificacao(){
        return(0.075 * calcSalBruto());
    }
    
    //aplicando o polimorfismo
    //sobreposição(override) do método
    public double calcSalLiquido(){
        return (super.calcSalLiquido() + calcGratificacao());
    }
}
