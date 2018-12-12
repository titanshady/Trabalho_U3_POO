/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhou3;

/**
 *
 * @author Rick
 */
public class Veiculo {

    private String montadora;
    private String modelo;
    private int velocidadeMaxima;
    private int cilindrada;

    private boolean ligada = false;
    private int velocidadeAtual = 0;
    
    public Veiculo(String montadora, String modelo, int velocidadeMaxima, int cilindrada) {
        this.montadora = montadora;
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeMaxima;
        this.cilindrada = cilindrada;
    }

    public String getModelo() {
        return modelo;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }
    
    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    
    public void verInfo(){
        System.out.println("===== " + this.modelo + " =====");
        System.out.println("Montadora: " + this.montadora);
        System.out.println("Velocidade Maxima: " + this.velocidadeMaxima + "Km/h");
        System.out.println("Cilindrada: " + this.cilindrada);
    }
    
    /*public Boolean ligaedesliga() {
        if (this.ligada == false){
            this.ligada = true;
            System.out.println("O Veículo foi ligado");
        } else {
            this.ligada = false;
            System.out.println("O Veículo foi desligado");
        }
        return this.ligada;
    }*/
    public Boolean ligar() {
        if (this.ligada == false){
            this.ligada = true;
            System.out.println("O Veículo foi ligado");
        } return this.ligada;
    }
    
public Boolean desligar() {
        if (this.ligada == true){
            this.ligada = false;
            System.out.println("O Veículo foi desligado");
        } return this.ligada;
    }

    public void acelera(int quantidade) {
        int velocidadeNova = this.velocidadeAtual + quantidade; 
        if (velocidadeNova < this.velocidadeMaxima){
            this.velocidadeAtual = velocidadeNova;
            System.out.println("Velocidade da Veículo: " + this.velocidadeAtual + "Km/h");
        } else{
            this.velocidadeAtual = velocidadeMaxima;
            System.out.println("Velocidade do Veículo: " + this.velocidadeAtual + "Km/h");
        }
    }
    
    
    

 }