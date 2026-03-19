package fatec.poo.model;

/**
 *
 * @author edson.barros
 */
public class Aluno extends Pessoa{
    
    private int regEscolar;
    private double mensalidade;
    
    public Aluno(int regEscolar, String nome, String dataNascimento){
        super(nome, dataNascimento);
        this.regEscolar = regEscolar;
    }
    
    public void setMensalidade(double m){
        mensalidade = m;
    }
    
    public int getRegEscolar(){
        return(regEscolar);
    }
    
    public double getMensalidade(){
        return(mensalidade);
    }
}
