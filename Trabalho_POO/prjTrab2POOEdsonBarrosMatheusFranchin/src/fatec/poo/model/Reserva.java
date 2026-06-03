/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

/**
 *
 * @author edson
 */
public class Reserva {
    
    private int codigo;
    private String nomeHosp;
    private Data dataEntrada;
    private Data dataSaida;
    private double valorHosped = 0.0;
    private Hotel hotel;

    public Reserva(int codigo, String nomeHosp, Data dataEntrada) {
        this.codigo = codigo;
        this.nomeHosp = nomeHosp;
        this.dataEntrada = dataEntrada;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNomeHosp() {
        return nomeHosp;
    }

    public Data getDataEntrada() {
        return dataEntrada;
    }

    public Data getDataSaida() {
        return dataSaida;
    }

    public double getValHosped() {
        return valorHosped;
    }
    
    public double encerrarReserva(Data dtSaida){
        
        this.dataSaida = dataSaida;
        
        // Calcula a diferença de dias entre a entrada e a saída
        int diasHospedados = dataSaida.subtrairDatas(this.dataEntrada);
        if (diasHospedados == 0) {
            diasHospedados = 1; // Garante que ao menos 1 diária seja cobrada se entrar e sair no mesmo dia
        }
        
        // Calcula o valor total da hospedagem baseado na diária do hotel
        this.valorHosped = diasHospedados * this.hotel.getValorDiaria();
        
        // Atualiza o faturamento acumulado do hotel associado
        this.hotel.addValorHospedagem(this.valorHosped);
        
        return this.valorHosped;
        
    }

    void setHotel(Hotel aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
