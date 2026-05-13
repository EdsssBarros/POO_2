package fatec.poo.model;

/**
 *
 * @author Edson Barros
 */
public class Passagem {
    private int numero;
    private double preco;
    private int poltrona; // de 1 a 45
    private char tipo; //C-Comum  E-Estudante I-Idoso
    private boolean comSeguro; //Sim-true   Não-false
    
    public Passagem(int num){
        numero = num;
    }
    
    public void setTipo(char t){
        tipo = t;
    }
    
    public void setPoltrona(int p){
        poltrona = p;
    }
    
    public void setPreco(double pr){
        preco = pr;
    }

    public void setComSeguro(boolean comSeguro) {
        this.comSeguro = comSeguro;
    }

    public int getNumero() {
        return numero;
    }

    public int getPoltrona() {
        return poltrona;
    }

    public char getTipo() {
        return tipo;
    }

    public double getPreco() {
        return preco;
    }

    public boolean isComSeguro() {
        return comSeguro;
    }
    
    public double calcValPagar(){
        double desconto, valPag;
            
        if (tipo == 'C' || tipo == 'c'){
            desconto = 0;            
        }else
           if (tipo == 'E' || tipo == 'e'){
               desconto = 0.15 * preco;
           }else{
               desconto = 0.25 * preco;
           }
        valPag = preco - desconto;
        if (comSeguro){
            valPag = valPag + preco * 0.08; //acrescentar 8% sobre o preço
                                            //da passagem
        }
        return(valPag);
    }
}
