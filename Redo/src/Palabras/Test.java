/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Palabras;

/**
 *
 * @author Pedro
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Method m1 =new Method("C:\\Users\\Amand\\Desktop\\prueba 1\\prueba2.txt");
        m1.insertarPalabras("hola", "eres", "una", "pedazo", "zorra");
        
        m1.Leerfichero();
    }
    
}
