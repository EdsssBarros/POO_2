
import java.util.Scanner;

/**
 *
 * @author edson.barros
 */
public class Aplic {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        double medAlt, medBase;
        int opcao;
        
        System.out.println("Digite a medida da altura: ");
        medAlt = entrada.nextDouble();
        
        System.out.print("Digite a medida da base: ");
        medBase = entrada.nextDouble();
        
        Retangulo objRet = new Retangulo();
        objRet.setAltura(medAlt);
        objRet.setBase(medBase);
        
        
        do{
            
            System.out.print("\n1 - Consultar área");
            System.out.print("\n2 - Consultar perímetro");
            System.out.print("\n3 - Consultar diagonal");
            System.out.print("\n4 - sair");
            System.out.print("\nDigite sua opção: ");
            opcao = entrada.nextInt();
            
            if (opcao == 1){
                System.out.println("\n\nMedida da área do retângulo: " + objRet.calcArea());
            }
            
            if (opcao == 2){
                System.out.println("\n\nMedida da perímetro do retângulo: " + objRet.calcPerimetro());
            }
            
            if (opcao == 3){
                 System.out.println("\n\nMedida da diagonal do retângulo: " + objRet.calcDiagonal());
            }    
            
        }
        while (opcao < 4);
    }
}