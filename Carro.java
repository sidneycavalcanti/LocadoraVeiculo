/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalocadora;

/**
 *
 * @author sidney
 */
public class Carro {
    
  
    int qtd;
    String nome;
    String marca;
    double potencia;
    String cor;
    String tipo;
    double km_rodados;


    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getKm_rodados() {
        return km_rodados;
    }

    public void setKm_rodados(double km_rodados) {
        this.km_rodados = km_rodados;
    }
    
    //construtor
    
    public Carro(int qtd, double potencia, double km_rodados, String nome, String marca,  String cor, String tipo) {
 
        this.qtd = qtd;
        this.potencia = potencia;
        this.km_rodados = km_rodados;
        this.nome = nome;
        this.marca = marca;
        this.cor = cor;
        this.tipo = tipo;
       
        
    }
     
    //metodos
    
    void totalcarros(){}
    void carrosalugados(){}
    
    
    
    
}
