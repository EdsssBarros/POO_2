import fatec.poo.model.FuncionarioHorista;



/**
 *
 * @author edson.barros
 */
public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FuncionarioHorista funcHor = new FuncionarioHorista(1010, "Pedro Silveira", "14/05/78", 15.80);
        
        funcHor.setQtdeHorTrab(90);
        
        System.out.println("Salário Bruto: " + funcHor.calcSalBruto());
        System.out.println("Desconto: " + funcHor.calcDesconto());
        System.out.println("Salário Líquido: " + funcHor.calcSalLiquido());
    }
    
}
