import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> estoque = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        estoque.add(new Produto("A001", "Camiseta", 49.90, 50));
        estoque.add(new Produto("B002", "Calça Jeans", 129.50, 20));
        estoque.add(new Produto("C003", "Sapato", 99.00, 15));

        System.out.println("--- Sistema de Controle de Estoque (Simples) ---");

        System.out.println("\n--- PRODUTOS DISPONÍVEIS ---");
        for (Produto p : estoque) {
            System.out.printf("Cód: %s | Nome: %s | Valor: R$%.2f | Estoque: %d\n",
                    p.codigo, p.nome, p.valor, p.quantidadeEstoque);
        }
        System.out.println("------------------------------");

        System.out.println("\n--- REALIZAR VENDA ---");
        System.out.print("Digite o código do produto: ");
        String codigoDesejado = scanner.nextLine().toUpperCase();

        Produto produtoSelecionado = null;
        for (Produto p : estoque) {
            if (p.codigo.equals(codigoDesejado)) {
                produtoSelecionado = p;
                break;
            }
        }

        if (produtoSelecionado == null) {
            System.out.println("Produto não encontrado. Venda cancelada.");
            scanner.close();
            return;
        }

        System.out.printf("Produto: %s. Estoque atual: %d.\n",
                produtoSelecionado.nome, produtoSelecionado.quantidadeEstoque);
        System.out.print("Digite a quantidade a vender: ");
        int quantidadeVenda = Integer.parseInt(scanner.nextLine());

        if (quantidadeVenda <= 0 || quantidadeVenda > produtoSelecionado.quantidadeEstoque) {
            System.out.println("Quantidade inválida ou estoque insuficiente. Venda cancelada.");
            scanner.close();
            return;
        }

        double valorBruto = produtoSelecionado.valor * quantidadeVenda;
        double valorFinal = valorBruto;

        System.out.println("\n--- FORMAS DE PAGAMENTO ---");
        System.out.println("1. Pix/Espécie/Débito (5% de desconto)");
        System.out.println("2. Crédito (3x sem juros)");
        System.out.print("Escolha uma opção: ");
        String opcaoPagamento = scanner.nextLine();

        if (opcaoPagamento.equals("1")) {
            double desconto = valorBruto * 0.05;
            valorFinal = valorBruto - desconto;
            System.out.printf("Desconto de R$%.2f aplicado. Valor final: R$%.2f\n", desconto, valorFinal);

            System.out.print("Pagamento em Espécie? (S/N): ");
            if (scanner.nextLine().toUpperCase().equals("S")) {
                System.out.print("Digite o valor pago: R$");
                double valorPago = Double.parseDouble(scanner.nextLine());

                if (valorPago >= valorFinal) {
                    double troco = valorPago - valorFinal;
                    System.out.printf("Troco a ser devolvido: R$%.2f\n", troco);
                } else {
                    System.out.println("Valor pago insuficiente. Venda cancelada.");
                    scanner.close();
                    return;
                }
            } else {
                System.out.println("Pagamento via Pix/Débito confirmado.");
            }

        } else if (opcaoPagamento.equals("2")) {
            double parcela = valorFinal / 3;
            System.out.printf("Pagamento via Crédito: 3x de R$%.2f\n", parcela);

        } else {
            System.out.println("Opção de pagamento inválida. Venda cancelada.");
            scanner.close();
            return;
        }
        
        produtoSelecionado.quantidadeEstoque -= quantidadeVenda;
        System.out.println("\nVENDA CONCLUÍDA COM SUCESSO!");
        System.out.printf("Novo estoque de '%s': %d unidades.\n", produtoSelecionado.nome, produtoSelecionado.quantidadeEstoque);

        scanner.close();
    }
}