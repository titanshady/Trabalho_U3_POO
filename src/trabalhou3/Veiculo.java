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

    String cor;
    String montadora;
    String modelo;
    int velocidadeMaxima;
    int cilindrada;
    
    int velocidadeAtual;
    boolean ligaedesliga;
    boolean ligada = false;

    //liga o carro
    public Boolean ligaedesliga() {
        if (this.ligada == false){
            this.ligada = true;
            System.out.println("O Veículo foi ligado");
        } else {
            this.ligada = false;
            System.out.println("O Veículo foi desligado");
        }
        return this.ligada;
    }
   //acelera uma certa quantidade
    public void acelera(int quantidade) {
        int velocidadeNova = this.velocidadeAtual + quantidade; 
        if (velocidadeNova < this.velocidadeMaxima){
            this.velocidadeAtual = velocidadeNova;
            System.out.println("Velocidade do Veículo: " + this.velocidadeAtual + "Km/h");
        }
    }
   //devolve a marcha do carro
    public Integer pegaMarcha() {
        if (this.velocidadeAtual < 0) {
            return -1;
        }
        if (this.velocidadeAtual >= 0 && this.velocidadeAtual < 40) {
            return 1;
        }
        if (this.velocidadeAtual >= 40 && this.velocidadeAtual < 80) {
            return 2;
        }
        return 3;
    }
    

 }