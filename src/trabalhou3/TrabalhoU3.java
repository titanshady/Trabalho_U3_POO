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
        Carro mustang = new Carro("Preto", "Ford","Mustang", 250, 600, 200, 2);
        mustang.testeCarro();
        
        Moto gsx = new Moto("Preto", "Suzuki","GSX-R1000A", 250, 999, "Preto", 60);
        gsx.testeMoto();
 }
    
}
