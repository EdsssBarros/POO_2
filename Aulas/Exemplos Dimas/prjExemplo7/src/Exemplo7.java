
/**
 *
 * @author Fatec
 */
public class Exemplo7 {
    public static void main(String[] args) {
        int[] tabNum; //Declaração 
        int cont;

        tabNum = new int[3]; //Criação 

        tabNum[0] = 34;
        tabNum[1] = 18;
        tabNum[2] = 27;

        for (cont = 0; cont < 3; cont++) {
            System.out.print("Conteudo de TabNum[" + cont + "]= ");
            System.out.println(tabNum[cont]);
        }

    }
}
