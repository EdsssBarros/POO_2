
package fatec.poo.model;

/**
 *
 * @author Fatec
 */
public class Palestrante extends Pessoa{
    private String empresa;
    private double taxaCobranca; //porcentagem 
    private Palestra[] palestras; //multiplicidade 1..*
    private int numPalestra; //índice da matriz de objetos

    public Palestrante(String cpf, String nome, String empresa) {
        super(cpf, nome);        
        this.empresa = empresa;
        palestras = new Palestra[5];
    }

    public String getEmpresa() {
        return empresa;
    }

    public double getTaxaCobranca() {
        return taxaCobranca;
    }

    public void setTaxaCobranca(double taxaCobranca) {
        this.taxaCobranca = taxaCobranca;
    }
    
    public void addPalestra(Palestra p) {
        palestras[numPalestra] = p;
        numPalestra++;
    }


    public double calcTotalReceberPalestras() {
        
        double totalReceber = 0;
        
        
        for (int x = 0; x < numPalestra; x++){
           totalReceber += palestras[x].calcTotalFaturado();
        }
        totalReceber = taxaCobranca/100 * totalReceber;
        
        return (totalReceber);
    }
}

