public class Professor extends Pessoa {
    
    private char especialidade;
    private float salario;

    public void receberAumento(float aum){
        System.out.println("Recebeu almento o(a) Docente " + this.getNome());
    }

    public char getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(char especialidade) {
        this.especialidade = especialidade;
    }
    
    public float getSalario() {
        return salario;
    }
    
    public void setSalario(float salario) {
        this.salario = salario;
    }
}
