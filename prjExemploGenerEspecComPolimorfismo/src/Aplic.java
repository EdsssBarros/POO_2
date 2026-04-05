import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import fatec.poo.model.FuncionarioComissionado;
import java.text.DecimalFormat;



/**
 *
 * @author edson.barros
 */
public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DecimalFormat df = new DecimalFormat("#,##0,00");
        
        FuncionarioHorista funcHor = new FuncionarioHorista(1010, "Pedro Silveira", "14/05/78", 15.80);
        FuncionarioMensalista funcMen = new FuncionarioMensalista(2020, "Ariadne Alves", "15/06/89", 2300.5);
        
        funcHor.setQtdeHorTrab(90);
        funcMen.setNumSalMin(2.5);
        
        System.out.println("Funcionário Hosrista: ");
        System.out.println("Salário Bruto: " + funcHor.calcSalBruto());
        System.out.println("Desconto: " + funcHor.calcDesconto());
        System.out.println("Salário Líquido: " + funcHor.calcSalLiquido());
       
        
        System.out.println("Funcionário Mensalista: ");
        System.out.println("Saládrio Bruto: " + funcMen.calcSalBruto());
        System.out.println("");
        System.out.println("");
        
    }
    
    
    
    
    
}
