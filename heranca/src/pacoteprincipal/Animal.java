
package pacoteprincipal;


public class Animal {
    // nome , idade, genero , altura
     protected String nome;
     protected int  idade;
     protected String genero;
     protected float altura;

    public Animal(String nome, int idade, String genero, float altura) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
        this.altura = altura;
    }

    public void comunicar(String som){
        System.out.println(" eu sou o "+this.nome+
                "e eu gosto de "+som);
    }
       
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    
     
     
    
}
