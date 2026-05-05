package fatec.poo.model;

/**
 *
 * @author Fatec
 */
public class Professor extends Pessoa{
    private int regFuncional;
    private double salario;
    
    public Professor(int rf, String n, String dn){
        super(n, dn);//chamada do método construtor da superclasse
        regFuncional = rf;
    }
    
    public int getRegFuncional(){
        return(regFuncional);
    }
    
    public double getSalario(){
        return(salario);
    }
    
    public void setSalario(double s){
        salario = s;
    }
    
}
