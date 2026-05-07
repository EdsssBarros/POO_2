package fatec.poo.model;

/**
 *
 * @author Fatec
 */
public class Aluno extends Pessoa{
    private int regEscolar;
    private double mensalidade;
    
    public Aluno(int re, String n, String dn){
        super(n,dn); //chamada do método construtor da superclasse
        regEscolar = re;
    }
    
    public int getRegEscolar(){
        return(regEscolar);
    }
    
    public double getMensalidade(){
        return(mensalidade);
    }
    
    public void setMensalidade(double m){
        mensalidade = m;
    }
}
