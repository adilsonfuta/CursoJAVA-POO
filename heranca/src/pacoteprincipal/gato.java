/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacoteprincipal;

/**
 *
 * @author ITEL
 */
public class gato extends Animal{
    
    public gato(String nome, int idade, String genero, float altura) {
        super(nome, idade, genero, altura);
    }

    @Override
    public void comunicar(String som) {
        super.comunicar(som);
        System.out.println(" lalalala "); //To change body of generated methods, choose Tools | Templates.
    }

    
}
