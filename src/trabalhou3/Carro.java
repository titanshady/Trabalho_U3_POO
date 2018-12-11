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
public class Carro extends Veiculo{
    int volPortaMalas;
    int qtdePortas;
    
    public Carro(String cor, String montadora, String modelo, int velocidadeMaxima, int cilindrada, int volPortaMalas, int qtdePortas) {
        velocidadeAtual = 0;
        this.cor = cor;
        this.montadora = montadora;
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeMaxima;
        this.cilindrada = cilindrada;
        this.volPortaMalas = volPortaMalas;
        this.qtdePortas = qtdePortas;
    }
    
    public void verInfo(){
        System.out.println("===== " + this.modelo + " =====");
        System.out.println("Cor: " + this.cor);
        System.out.println("Montadora: " + this.montadora);
        System.out.println("Velocidade Maxima: " + this.velocidadeMaxima + "Km/h");
        System.out.println("Cilindrada: " + this.cilindrada);
        System.out.println("Volume do Portamalas: " + this.volPortaMalas + "Lt");
        System.out.println("Quantidade de Portas: " + this.qtdePortas); 
    }

    public void abrirPorta(){
        System.out.println("\n.... Abrindo Portas ....");
        System.out.println("===== Teste Completo =====\n");
    }
    
    public void alinhaPneus(){
        System.out.println(".... Alinhando Pneus ....");
        System.out.println("===== Alinhamento Completo =====\n");
    }
    
    public void testeCarro(){
        verInfo();
        System.out.println("\n===== Iniciado Teste do Modelo: " + this.modelo + " =====");
        if (ligaedesliga() != false) {
            acelera(60);
            int numero = (int) Math.random();
            if ((numero % 2) == 0) {
                System.out.println("\n===== Veiculo Necessita de Calibragem =====");
                abrirPorta();
                alinhaPneus();
            } else{
                System.out.println("\n===== Veiculo em Perfeitas Condições =====");
            }
            ligaedesliga();
        }
        System.out.println("===== Teste Finalizado =====\n\n");
    }

}
