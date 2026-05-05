

public class Participante extends Pessoa{
    
    private String email;
    private double valorPalestra;
    private boolean presenca;
    
    public Participante(String cpf, String nome, String email){
        super(cpf, nome);
        this.email = email;
    }
    
    public void setValorPalestra(double valorPalestra){
        this.valorPalestra = valorPalestra;
    }
    
    public void setPresenca(boolean presenca){
        this.presenca = presenca;
    }
    
    public String getEmail(){
        return this.email;
    }

    public double getValorPalestra() {
        return this.valorPalestra;
    }
}