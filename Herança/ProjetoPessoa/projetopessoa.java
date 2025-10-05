package ProjetoPessoa;

public class projetopessoa {
    public static void main(String[] args) {
        //principal
        pessoa p1  = new pessoa();
        aluno  p2  = new aluno();
        professor p3 = new professor();
        funcionario p4 = new funcionario();

        p1.setNome("Pedro");
        p2.setNome("Bruno");
        p3.setNome("Fernanda");
        p4.setNome("Claudiana");

        p1.setIdade(18);
        p2.setIdade(22);
        p3.setIdade(30);
        p4.setIdade(38);

        p1.setSexo("M");
        p2.setSexo("M");
        p3.setSexo("F");
        p4.setSexo("F");

        p2.setCurso("Informatica");
        p3.setSalario(2500.75f);
        p4.setSetor("Estoque");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
