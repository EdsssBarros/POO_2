/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;
import java.util.ArrayList;

/**
 *
 * @author edson
 */

public class Hotel {
    private int codigo;
    private String nome;
    private String endereco;
    private String telefone;
    private double valorDiaria;
    private double totalFaturamento = 0.0;
    private ArrayList<Reserva> reservas = new ArrayList<>(); // Multiplicidade 1..*

    public Hotel(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public double getTotalFaturamento() {
        return totalFaturamento;
    }

    public void addValorHospedagem(double valor) {
        this.totalFaturamento += valor;
    }

    // Vinculação bidirecional exigida nas instruções
    public void addReserva(Reserva reserva) {
        this.reservas.add(reserva);
        reserva.setHotel(this); // Passando o "this" na associação bidirecional
    }
}