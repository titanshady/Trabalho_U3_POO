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
public class TrabalhoU3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Veiculo veicmustang = new Veiculo("Ford","Mustang", 250, 600);
        Carro mustang = new Carro(200, 2, veicmustang);
        mustang.testeCarro();
        
        Veiculo veicgsx = new Veiculo("Suzuki","GSX-R1000A", 250, 999);
        Moto gsx = new Moto("Preto", 60, veicgsx);
        gsx.testeMoto();
 }
    
}
