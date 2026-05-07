
package fatec.poo.model;

/**
 *
 * @author Fatec
 */
public class Palestra {
    private String data;
    private String tema;
    private double valor;
    private Palestrante palestrante; //multiplicidade 1
    private Participante[] participantes; //multiplicidade 1..*
    private int numPart; //índice da matriz de objetos

    public Palestra(String tema, double valor) {
        this.tema = tema;
        this.valor = valor;
        participantes = new Participante[5];
    }

    public void setData(String data) {
        this.data = data;
    }

    public Palestrante getPalestrante() {
        return palestrante;
    }

    public void setPalestrante(Palestrante palestrante) {
        this.palestrante = palestrante;
    }
    
    public String getData() {
        return data;
    }

    public String getTema() {
        return tema;
    }


    public double getValor() {
        return valor;
    }
                                             
    public void addParticipante(Participante part){
        participantes[numPart] = part;
        numPart++;
    }
    
    public double calcTotalFaturado() {
        double total = 0;
        for (int x = 0; x < numPart; x++){
            if (participantes[x].getTipo() == 'C' ||
                participantes[x].getTipo() == 'c'){
                total += valor;
            }else if (participantes[x].getTipo() == 'E' ||
                      participantes[x].getTipo() == 'e'){
                    total += (valor * 0.85);}
                else{
                    total += (valor * 0.80);}
        }
        return(total);
    }
}

