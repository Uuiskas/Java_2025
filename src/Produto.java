public class Produto {
    // Atributos públicos para acesso direto, simplificando os getters e setters.
    public String codigo;
    public String nome;
    public double valor;
    public int quantidadeEstoque;

    public Produto(String codigo, String nome, double valor, int quantidadeEstoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
        this.quantidadeEstoque = quantidadeEstoque;
    }
}