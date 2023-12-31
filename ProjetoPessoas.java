public class ProjetoPessoas{
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Aluno();
        Pessoa p3 = new Professor();
        Pessoa p4 = new Funcionario();

        p1.setNome("Lucas");
        p2.setNome("Filipe");
        p3.setNome("Maria");
        p4.setNome("Cláudia");

        p1.setSexo('M');
        p2.setSexo('M');
        p3.setSexo('F');
        p4.setSexo('F');

        p2.setIdade(18);
       
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());

        //p2.setCurso("informatica");
        //p3.setSalario(2500.75f);
        //p4.setSetor("Estoque");
    }
}