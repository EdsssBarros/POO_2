

public class Palestrante extends Pessoa{
    
    private String temaPalestra;
    private double taxaCobranca;
    private double totalReceber;
    
    public Palestrante(String cpf, String nome, String temaPalestra){
        super(cpf, nome);
        this.temaPalestra = temaPalestra;
    }
    
    public void setTaxaCobranca(double taxaCobranca){
        this.taxaCobranca = taxaCobranca;
    }
    
    public double getTaxaCobranca(){
        return this.taxaCobranca;
    }
    
    public double getTotalReceber(){
        return this.totalReceber;
    }
    
    public void addValorReceber(double valorPalestra){
        this.totalReceber = (this.totalReceber) + (valorPalestra - this.taxaCobranca);
    }
    
}