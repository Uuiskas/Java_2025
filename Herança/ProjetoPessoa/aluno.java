package ProjetoPessoa;

public class aluno extends pessoa{
    private int mat;
    private String curso;

    public void cancelarmatr(){
        System.out.println("Matrícula Cancelada");
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }
}
