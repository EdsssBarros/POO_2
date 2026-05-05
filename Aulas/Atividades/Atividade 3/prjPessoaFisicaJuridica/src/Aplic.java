import fatec.poo.model.PessoaFisica;
import fatec.poo.model.PessoaJuridica;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Dimas
 */

public class Aplic {
    public static void main(String[] args) {       
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,##0.00");
        PessoaFisica pf; 
        PessoaJuridica pj;        
        
        int nPed, opcao, anoInsc;
        String cpf_cgc, nome, dtPed;
        double valComp, valBase, txIncentivo;
        
        System.out.print("Digite o cpf: ");
        cpf_cgc = entrada.next();
        System.out.print("Digite o nome da pessoa: ");
        nome = entrada.next();
        System.out.print("Digite a data de inscrição (aaaa): ");
        anoInsc = entrada.nextInt();
        
        //Instanciação do objeto da classe PessoaFisica
        pf = new PessoaFisica(cpf_cgc, nome ,anoInsc);
        
        System.out.print("Digite o valor base (R$): ");
        valBase = entrada.nextDouble();
        pf.setBase(valBase); 
        
        System.out.print("Digite o valor da compra: ");
        valComp = entrada.nextDouble();    
        while(valComp > 0){
            pf.addCompras(valComp);        
            System.out.print("Digite o valor da compra: ");
            valComp = entrada.nextDouble();            
        }  
        
        System.out.print("\n\nDigite o cgc: ");
        cpf_cgc = entrada.next();
        System.out.print("Digite o nome da empresa: ");
        nome = entrada.next();
        System.out.print("Digite a data de inscrição (aaaa): ");
        anoInsc = entrada.nextInt();
        
        //Instanciação do objeto da classe PessoaJuridica
        pj = new PessoaJuridica(cpf_cgc, nome ,anoInsc);
        
        System.out.print("Digite a taxa de incentivo(%): ");
        txIncentivo = entrada.nextDouble();              
        pj.setTaxaIncentivo(txIncentivo); 
           
        System.out.print("Digite o valor da compra: ");
            valComp = entrada.nextDouble();        
        while(valComp > 0){
            pj.addCompras(valComp);        
            System.out.print("Digite o valor da compra: ");
            valComp = entrada.nextDouble();            
        }   
        
        System.out.println("Ano Atual: " + 2026);
        System.out.println("\nPessoa Física");        
        System.out.println("CPF: " + pf.getCPF());
        System.out.println("Nome: " + pf.getNome());   
        System.out.println("Valor Base: " + df.format(pf.getBase()));
        System.out.println("Total Compras: " + df.format(pf.getTotalCompras()));
        System.out.println("Bonus: " + df.format(pf.calcBonus(2026)));        
        System.out.println("\n\nPessoa Jurídica");
        System.out.println("CGC: " + pj.getCGC());
        System.out.println("Nome: " + pj.getNome());  
        System.out.println("Taxa Incentivo: " + pj.getTaxaIncentivo());
        System.out.println("Total Compras: " + df.format(pj.getTotalCompras()));
        System.out.println("Bonus: " + df.format(pj.calcBonus(2026)));
    }
}
