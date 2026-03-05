/**
 *
 * @author edson.barros
 */
public class Aplic {
    public static void main(String[] args) {
        //definição do ponteiro para um objeto, ou seja, criando a variável objRet que é um ponteiro
        Retangulo objRet;
        
        //instanciação (alocação dinâmica da memória) de um objeto da classe Retângulo
        objRet = new Retangulo();
        
        //passagem de mensagens
        
        objRet.setAltura(5.0);
        objRet.setBase(8.0);
        
        System.out.println("Medida da área do retângulo: " + objRet.calcArea());
        System.out.println("Medida do perímetro do retângulo: " + objRet.calcPerimetro());
        
        Retangulo objRet1 = new Retangulo();
        
        objRet1.setBase(4.0);
        objRet1.setAltura(2.0);
        
        System.out.println("\n\nMedida da altura do retângulo: " + objRet1.getAltura());
        System.out.println("\n\nMedida da base do retângulo: " + objRet1.getBase());
        System.out.println("\n\nMedida da perímetro do retângulo: " + objRet1.calcPerimetro());
        System.out.println("\n\nMedida da diagonal do retângulo: " + objRet1.calcDiagonal());
    }
}