public class Aluno extends Pessoa {
    
    private int matr;
    private char curso;
    
    public void cancelarMatr(){
        System.out.println("Matrícula Cancelada");
        this.matr = 0;
    }

    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public char getCurso() {
        return curso;
    }

    public void setCurso(char curso) {
        this.curso = curso;
    }

    

    

    
}
