import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = sc.nextLine();

        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("\nAluno: " + nome);
        System.out.println("Média: " + media);

        if (media >= 70) {
            System.out.println("Situação: Aprovado ");
        } else if (media < 40) {
            System.out.println("Situação: Reprovado ");
        } else {
            System.out.println("Situação: Final ");
        }

        sc.close();
    }
}

