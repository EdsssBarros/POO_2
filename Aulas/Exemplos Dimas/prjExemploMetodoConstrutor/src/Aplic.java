
import java.util.Scanner;

/**
 *
 * @author Fatec
 */
public class Aplic {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double medAlt, medBase;
        String unidade;
        int opcao;
        
        System.out.println("Digite a unidade de medida: ");
        unidade = entrada.next();        
        
        //intanciação(alocação) do objeto da classe Retangulo
        Retangulo objRet = new Retangulo(unidade);
        
        System.out.print("Digite a medida da altura: ");
        medAlt = entrada.nextDouble(); //scanf("%lf", &medAlt)
        System.out.print("Digite a medida da base: ");
        medBase = entrada.nextDouble(); //scanf("%lf", &medBase)
        
        //passagem de mensagens
        objRet.setAltura(medAlt);
        objRet.setBase(medBase);
        
        do{
            System.out.println("\n\n1 - Consultar Área");
            System.out.println("2 - Consultar Perímetro");
            System.out.println("3 - Consultar Diagonal");
            System.out.println("4 - Sair");
            System.out.print("\n\t\tDigite a opcão: ");
            opcao = entrada.nextInt();
            
            System.out.println("\n\nMedida da altura: " + objRet.getAltura() +
                               " " + objRet.getUnidadeMedida());
            System.out.println("Medida da base: " + objRet.getBase() +
                               " " + objRet.getUnidadeMedida());
            if (opcao == 1){
                System.out.println("\nMedida da área: " + objRet.calcArea()+
                                   " " + objRet.getUnidadeMedida() + "²");
            }else
               if (opcao == 2){
                  System.out.println("\nMedida do perímetro: " + objRet.calcPerimetro()+
                                     " " + objRet.getUnidadeMedida());
               }else
                  if (opcao == 3){
                     System.out.println("\nMedida da diagonal: " + objRet.calcDiagonal()+
                                        " " + objRet.getUnidadeMedida());
                  }
        }while(opcao < 4);
        
    }
    
}
