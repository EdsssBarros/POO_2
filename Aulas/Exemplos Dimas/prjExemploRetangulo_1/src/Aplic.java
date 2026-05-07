/**
 *
 * @author Fatec
 */
public class Aplic {
    public static void main(String[] args) {
        Retangulo objRet; //Definição do ponteiro
        
        objRet = new Retangulo(); //instanciação(alocação)
                                  //do objeto memória
                                
                               
        objRet.setAltura(5.0);
        objRet.setBase(8.0);
        
        System.out.println("Medida da altura do retângulo: " +
                           objRet.getAltura());
        System.out.println("Medida da base do retângulo: " + 
                           objRet.getBase());
        System.out.println("Medida da área do retângulo: " + 
                            objRet.calcArea());
        System.out.println("Medida do perímetro do retângulo: " +
                            objRet.calcPerimetro());
        System.out.println("Medida da diagonal do retângulo: " +
                            objRet.calcDiagonal());
        
        
        Retangulo objRet1 = new Retangulo();
        
        objRet1.setAltura(3);
        objRet1.setBase(4);
        
        System.out.println("\n\nMedida da altura do retângulo: " +
                           objRet1.getAltura());
        System.out.println("Medida da base do retângulo: " + 
                           objRet1.getBase());
        System.out.println("Medida da área do retângulo: " + 
                            objRet1.calcArea());
        System.out.println("Medida do perímetro do retângulo: " +
                            objRet1.calcPerimetro());
        System.out.println("Medida da diagonal do retângulo: " +
                            objRet1.calcDiagonal());
                                  
    }    
}
