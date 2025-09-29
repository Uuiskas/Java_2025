public class Funcionario {
        private String matricula;
        private String nome;
        private double salarioBruto;

        public double calcularSalarioLiquido() {
            return salarioBruto * 0.85;
        }

        public double calcularInss() {
            return salarioBruto * 0.15;
        }

        public String exibirContracheque() {
            return "Matrícula: " + matricula +
                    "Nome: " + nome +
                    "Salario Bruto: " + salarioBruto +
                    "Salario Liquido: " + calcularSalarioLiquido();
        }

        public String getMatricula() {
            return matricula;
        }

        public void setMatricula(String matricula) {
            this.matricula = matricula;
        }
}
