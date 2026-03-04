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
        System.out.println("Medida do perímetro do retângulo: " + objRet.Perimetro());
    }
}