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
public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public String obterData() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }

    public int calcDiasCorridos() {
        int[] diasMeses = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        // 1ª Parte da fórmula do enunciado
        int diasAnos = (int)(((ano - 1) - 1900) * 365.25);
        
        // 2ª Parte: Somatória dos meses anteriores
        int somaMesesAnteriores = 0;
        for (int i = 0; i < (mes - 1); i++) {
            somaMesesAnteriores += diasMeses[i];
        }
        
        int totalDias = diasAnos + somaMesesAnteriores + dia;
        
        // Regra do ano bissexto: se for bissexto e passou de fevereiro, soma 1 dia
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            if (mes > 2) {
                totalDias += 1;
            }
        }
        
        return totalDias;
    }

    public int subtrairDatas(Data outraData) {
        return Math.abs(this.calcDiasCorridos() - outraData.calcDiasCorridos());
    }
}