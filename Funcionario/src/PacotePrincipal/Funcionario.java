package PacotePrincipal;


public class Funcionario {
    
    // zonas dos atributos
        private String nome;
        private String departamento;
        private double salario;
        private String dataEntrada;
        private String nif;        
        private boolean trabalha;
    
    // zona dos metodos 
       public Funcionario(){
        
        }

    public Funcionario(String nome, String departamento, double salario, String dataEntrada, String nif) {
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
        this.dataEntrada = dataEntrada;
        this.nif = nif;
        this.trabalha = true;
    }
    
    // zona dos metodos gets e sets

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public boolean isTrabalha() {
        return trabalha;
    }

    public void setTrabalha(boolean trabalha) {
        this.trabalha = trabalha;
    }
    
    
    // zona do metodo bonus func    
    public void bonusFuncionario(double jurobonus){
        double valor= (jurobonus/100);
        this.salario= (salario*valor)+salario;
    }
    
    // zona do metodo ferias
    
    public void ferias(){
        this.trabalha=false;
    }
       
    
}
