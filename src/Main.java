public class Main {

    static class Pessoa {
        protected String nome;
        protected int idade;

        public Pessoa(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }

        public void aniversario() {
            idade++;
            System.out.println(nome + " fez aniversário! Nova idade: " + idade + " anos.");
        }

        public String getNome() { return nome; }
        public int getIdade() { return idade; }
    }

    static class Aluno extends Pessoa {
        private int matricula;
        private double media;

        public Aluno(String nome, int idade, int matricula, double nota1, double nota2, double nota3) {
            super(nome, idade);
            this.matricula = matricula;
            this.media = (nota1 + nota2 + nota3) / 3;
        }


        public void mostrarDetalhes() {
            System.out.printf("Aluno: %s (Matrícula %d)\n", nome, matricula);
            System.out.printf("Idade: %d. Média Calculada: %.2f\n", idade, media);
        }
    }

    static class Professor extends Pessoa {
        private double salario;

        public Professor(String nome, int idade, int qtdAulasSemana) {
            super(nome, idade);
            this.salario = 300.0 * qtdAulasSemana;
        }


        public void mostrarDetalhes() {
            System.out.printf("Professor: %s\n", nome);
            System.out.printf("Idade: %d. Salário Calculado: R$%.2f\n", idade, salario);
        }
    }


    public static void main(String[] args) {

        System.out.println("----- DEMONSTRAÇÃO DE HERANÇA -----");

        System.out.println("\n--- OBJETO ALUNO ---");
        Aluno joao = new Aluno("João", 20, 1234, 7.5, 8.0, 6.5);

        joao.mostrarDetalhes();
        joao.aniversario();

        System.out.println("--------------------------");


        System.out.println("\n--- OBJETO PROFESSOR ---");
        Professor maria = new Professor("Maria", 45, 10);

        maria.mostrarDetalhes();
        maria.aniversario();

        System.out.println("--------------------------");
    }
}