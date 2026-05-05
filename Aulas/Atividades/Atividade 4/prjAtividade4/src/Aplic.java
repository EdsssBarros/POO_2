
import fatec.poo.model.Palestra;
import fatec.poo.model.Palestrante;
import fatec.poo.model.Participante;
import java.text.DecimalFormat;

/**
 *
 * @author Fatec
 */
public class Aplic {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        
        Palestrante objPales = new Palestrante("123.456.789-00", "Nicolas Silva", "Apple");
        
        Participante objPart1 = new Participante ("144.780.778-27", "Pedro Silveira", 'C');
        Participante objPart2 = new Participante ("945.454.676-88", "Carlos Pimentel", 'I');
        Participante objPart3 = new Participante ("655.657.589-90", "Ana Beatriz", 'E');
        Participante objPart4 = new Participante ("544.543.545-43", "Beatriz Dias", 'I');
        Participante objPart5 = new Participante ("344.787.657-65", "Marcos Gonçalves", 'C');
        
       Palestra objPalestra1 = new Palestra ("Redes de Computadores", 1000);
       Palestra objPalestra2 = new Palestra ("POO", 2000);
 
       objPales.setTaxaCobranca(60);//60%
       
       objPalestra1.setData("01/06/2006");
       objPalestra2.setData("20/04/2026");
       
       objPalestra1.addParticipante(objPart1);
       objPalestra1.addParticipante(objPart2);
       objPalestra1.addParticipante(objPart3);
       objPalestra2.addParticipante(objPart4);
       objPalestra2.addParticipante(objPart5);
       
             
       objPales.addPalestra(objPalestra1);
       objPales.addPalestra(objPalestra2);
       
       objPalestra1.setPalestrante(objPales);
       objPalestra2.setPalestrante(objPales);
       
        System.out.println("CPF Palestrante: " + objPales.getCpf());
        System.out.println("Nome: " + objPales.getNome());
        System.out.println("Taxa de Cobrança: " + df.format(objPales.getTaxaCobranca()) + "%");
        System.out.println("Valor total a receber pelas palestras: " + df.format(objPales.calcTotalReceberPalestras()));
    }
}
