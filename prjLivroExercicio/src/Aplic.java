/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import fatec.poo.model.Livro;
import java.util.Scanner;

/**
 *
 * @author edson.barros
 */
public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite a identificacao do livro");
        int id = entrada.nextInt();
        entrada.nextLine();
        
        System.out.println("---Digite o nome do livro---");
        String tit = entrada.nextLine();
        entrada.nextLine();
        
        System.out.println("Digite o valor da multa diária");
        double multa = entrada.nextDouble();
        entrada.nextLine();
        
        Livro objLivro = new Livro(id, tit);
        
        int opcao = 0;
        
        do
        {
            System.out.println("---Menu de Opções---");
            System.out.println("---1 - Consultar Livro---");
            System.out.println("---2 - Emprestar Livro---");
            System.out.println("---3 - Devovler Livro---");
            System.out.println("---4 - Sair");
            System.out.println("Escolha uma das opções acima: ");
            opcao = entrada.nextInt();
            entrada.nextLine();
            
            switch(opcao)
            {
                case 1:
                    System.out.println("\nID: " + objLivro.getIdentificacao());
                    System.out.println("Título: " + objLivro.getTitulo());
                    String status = objLivro.getSituacao() ? "Emprestado" : "Disponível";
                    System.out.println("Situação: " + status);        
                    break;
                    
                case 2:
                    if (objLivro.getSituacao() == true){
                        System.out.println("O livro está emprestado");                        
                    }
                    else{
                        System.out.println("O livro está disponível, empréstimo realizado!!!");
                    }
                    break;
                    
                case 3: // Devolver
                if (!objLivro.getSituacao()) {
                    System.out.println("Alerta: O livro já está disponível.");
                } else {
                    System.out.print("Quantos dias de atraso? ");
                    int dias = entrada.nextInt();
                    double valorPago = objLivro.devolver(dias);
                        
                    System.out.println("Operação de devolução realizada com sucesso.");
                    if (valorPago > 0) {
                        System.out.printf("Valor da multa a pagar: R$ %.2f\n", valorPago);
                    } else {
                        System.out.println("Sem multa a pagar.");
                    }
                }
                break;

                case 4:
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            } 
        } while (opcao != 4);            
            entrada.close();
    }
}