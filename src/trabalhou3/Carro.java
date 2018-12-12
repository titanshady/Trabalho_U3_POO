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
public class Carro{
    private int volPortaMalas;
    private int qtdePortas;
    private Veiculo veiculo;
    
    public Carro(int volPortaMalas, int qtdePortas, Veiculo veiculo) {
        this.volPortaMalas = volPortaMalas;
        this.qtdePortas = qtdePortas;
        this.veiculo = veiculo;
    }
    
    public void verInfo(){
        veiculo.verInfo();
        System.out.println("Volume do Portamalas: " + this.volPortaMalas + "Lt");
        System.out.println("Quantidade de Portas: " + this.qtdePortas); 
    }

    public void abrirPorta(){
        System.out.println("\n.... Abrindo Portas ....");
    }
    
    public void alinhaPneus(){
        System.out.println(".... Alinhando Pneus ....\n");
    }
    
    public void acelera(int quantidade) {
        int velocidadeNova = veiculo.getVelocidadeAtual() + quantidade; 
        if (velocidadeNova < veiculo.getVelocidadeMaxima()){
            veiculo.setVelocidadeAtual(velocidadeNova);
            System.out.println("Velocidade do Carro: " + veiculo.getVelocidadeAtual() + "Km/h");
        } else{
            veiculo.setVelocidadeAtual(veiculo.getVelocidadeMaxima());
            System.out.println("Velocidade do Carro: " + veiculo.getVelocidadeAtual() + "Km/h");
        }
    }
    
    public void testeCarro(){
        verInfo();
        System.out.println("\n===== Iniciado Teste do Modelo: " + veiculo.getModelo() + " =====");
        if (veiculo.ligar() != false) {
            int numero = (int) (Math.random()*100);  
            acelera(numero);
            if (numero % 2 == 0) {
                System.out.println("\n===== Carro Necessita de Calibragem =====");
                abrirPorta();
                alinhaPneus();
            } else{
                System.out.println("\n===== Carro em Perfeitas Condições =====");
            }
            veiculo.desligar();
        }
        System.out.println("===== Teste Finalizado =====\n\n");
    }

}
