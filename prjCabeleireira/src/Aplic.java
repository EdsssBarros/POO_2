import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.Math;


public class Aplic {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.00");

        // 1. Instanciar Cabelereira
        Cabeleireira cab = new Cabeleireira("9999", "Maria da Silva", 10.0);

        // 2. Instanciar Clientes (1 com fidelidade, 1 sem)
        Cliente cli1 = new Cliente("111", "Ana", true);
        Cliente cli2 = new Cliente("222", "Beatriz", false);

        // 3. Instanciar Serviços
        Servico serv1 = new Servico("07/04/2026", "Corte");
        serv1.setValor(100.0);
        serv1.setCliente(cli1); // Associa o cliente 1 ao serviço 1

        Servico serv2 = new Servico("07/04/2026", "Escova");
        serv2.setValor(50.0);
        serv2.setCliente(cli2); // Associa o cliente 2 ao serviço 2

        // --- Lógica de Execução ---
        // Calcula quanto cada um pagou e registra na comissão da cabelereira
        double valorPago1 = serv1.calcValorPagar();
        double valorPago2 = serv2.calcValorPagar();

        cab.registrarVenda(valorPago1);
        cab.registrarVenda(valorPago2);

        // --- Layout de Saída Esperado ---
        System.out.println("CPF cabelereira:  " + cab.getCpf());
        System.out.println("Nome: " + cab.getNome());
        System.out.println("Taxa de Comissão:  " + df.format(cab.getTaxaComissao()));
        System.out.println("Valor total comissão: " + df.format(cab.calcTotalComissaoServicos()));
