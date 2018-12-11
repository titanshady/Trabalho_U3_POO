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
public class Moto extends Veiculo{
    String corAssento;
    int volBagageiro;
    
    public Moto(String cor, String montadora, String modelo, int velocidadeMaxima, int cilindrada, String corAssento, int volBagageiro) {
        velocidadeAtual = 0;
        this.cor = cor;
        this.montadora = montadora;
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeMaxima;
        this.cilindrada = cilindrada;
        this.corAssento = corAssento;
        this.volBagageiro = volBagageiro;
    }
    
    public void verInfo(){
        System.out.println("===== " + this.modelo + " =====");
        System.out.println("Cor: " + this.cor);
        System.out.println("Montadora: " + this.montadora);
        System.out.println("Velocidade Maxima: " + this.velocidadeMaxima + "Km/h");
        System.out.println("Cilindrada: " + this.cilindrada);
        System.out.println("Cor do Assento: " + this.corAssento);
        System.out.println("Volume do Bagageiro: " + this.volBagageiro + "Lt"); 
    }
    
    public void testeMoto(){
        verInfo();
        System.out.println("\n===== Iniciado Teste do Modelo: " + this.modelo + " =====");
        if (ligaedesliga() != false) {
            acelera(60);
            System.out.println("Marcha usada: " + pegaMarcha());
            ligaedesliga();
        }
        System.out.println("===== Teste Finalizado =====\n\n");
    }
    
    //lubrificarCorrent;
    //apertarBalanca;

    
}
