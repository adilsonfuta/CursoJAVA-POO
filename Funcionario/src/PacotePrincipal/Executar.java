
package PacotePrincipal;

import java.util.Scanner;



public class Executar {
    
    static Scanner ler=null;
    
    public static void main(String[] args) {
     ler=new Scanner(System.in);
     
        System.out.println("  DIGA O NOME ");
        String nome_func=ler.nextLine();
        
        System.out.println(" DIGA O DEPARTAMENTO");
        String depart=ler.nextLine();
        
         System.out.println(" DIGA O data de Entrada");
        String data=ler.nextLine();
        
         System.out.println(" DIGA O NIF");
         String nif_func=ler.nextLine();
          
        System.out.println(" Diga o salario ");
        double sal=ler.nextDouble();
        Funcionario Prof_MateusDelgado=new Funcionario(nome_func, depart, sal, data, nif_func);
         
        System.out.println(" Nome Completo " +Prof_MateusDelgado.getNome());
        System.out.println("SALARIO ANTES " + Prof_MateusDelgado.getSalario());        
        Prof_MateusDelgado.bonusFuncionario(10);
        System.out.println("SALARIO Depois " + Prof_MateusDelgado.getSalario());
         
        // tarefa para fazer a imp... ferias 
    }
    
}
