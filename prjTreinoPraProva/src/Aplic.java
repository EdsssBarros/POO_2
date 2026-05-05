import java.text.DecimalFormat;
import java.util.Scanner;

public class Aplic{
    public static void main(String[] args){
        
        DecimalFormat df = new DecimalFormat("#,##0.00");
        Scanner entrada = new Scanner(System.in);
        
        
        Palestrante objPalest1 = new Palestrante("12345678912", "Carlos Felicio", "Programação");
        
        Participante objPartic1 = new Participante("98765432132", "Lucas Peres", "Programação");
        Participante objPartic2 = new Participante("15926378415", "Pablo Telis", "Programação");
        
        System.out.println("Digite o valor da taxa da cobrança: ");
        double taxa = entrada.nextDouble();
        
        objPalest1.setTaxaCobranca(taxa);
        
        System.out.println("Digite o valor da palestra do Participante 1: ");
        double valpal1 = entrada.nextDouble();
        
        System.out.println("Digite o valor da palestra do Participante 2: ");
        double valpal2 = entrada.nextDouble();
        
        objPartic1.setValorPalestra(valpal1);
        objPartic2.setValorPalestra(valpal2);
        
        objPalest1.addValorReceber(objPartic1.getValorPalestra());
        objPalest1.addValorReceber(objPartic2.getValorPalestra());
        
        System.out.println("Cpf Palestrante: " + objPalest1.getCpf());
        System.out.println("Nome Palestrante: " + objPalest1.getNome());
        
        System.out.println("\n\nTotal Faturado Palestra: " + df.format(objPartic1.getValorPalestra() + objPartic2.getValorPalestra()));
        System.out.println("Taxa de Cobrança: " + objPalest1.getTaxaCobranca());
        System.out.println("Valor Total Recebido: " + objPalest1.getTotalReceber());
    }
}