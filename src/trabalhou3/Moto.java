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
public class Moto {
    private String corAssento;
    private int volBagageiro;
    private Veiculo veiculo;
    
    public Moto(String corAssento, int volBagageiro, Veiculo veiculo) {
        this.corAssento = corAssento;
        this.volBagageiro = volBagageiro;
        this.veiculo = veiculo;
        
        
    }
    
    public void verInfo(){
        veiculo.verInfo();
        System.out.println("Cor do Assento: " + this.corAssento);
        System.out.println("Volume do Bagageiro: " + this.volBagageiro + "Lt"); 
    }
    
    public void lubrificarCorrent(){
        System.out.println("\n.... Lubrificando Corrente ....");
    }
    
    public void apertarBalanca(){
        System.out.println(".... Apertando Balança ....\n");
    }
    
    public void acelera(int quantidade) {
        int velocidadeNova = veiculo.getVelocidadeAtual() + quantidade; 
        if (velocidadeNova < veiculo.getVelocidadeMaxima()){
            veiculo.setVelocidadeAtual(velocidadeNova);
            System.out.println("Velocidade da Moto: " + veiculo.getVelocidadeAtual() + "Km/h");
        } else{
            veiculo.setVelocidadeAtual(veiculo.getVelocidadeMaxima());
            System.out.println("Velocidade da Moto: " + veiculo.getVelocidadeAtual() + "Km/h");
        }
    }
    
    public void testeMoto(){
        verInfo();
        System.out.println("\n===== Iniciado Teste do Modelo: " + veiculo.getModelo() + " =====");
        if (veiculo.ligar() != false) {
            int numero = (int) (Math.random()*100);            
            acelera(numero);
            if (numero % 2 == 0) {
                System.out.println("\n===== Moto Necessita de Calibragem =====");
                lubrificarCorrent();
                apertarBalanca();
            } else{
                System.out.println("\n===== Moto em Perfeitas Condições =====");
            }
            veiculo.desligar();
        }
        System.out.println("===== Teste Finalizado =====\n\n");
    }

    
}
