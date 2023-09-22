public class Livro extends Main{
    private int id_livro;
    private String exemplar;
    private String autor;
    private int edicao;
    private int ano;
    private char disponibilidade;

    public Livro(int id_livro, String exemplar, String autor, int edicao, int ano, char disponibilidade) {
        this.id_livro = id_livro;
        this.exemplar = exemplar;
        this.autor = autor;
        this.edicao = edicao;
        this.ano = ano;
        this.disponibilidade = disponibilidade;
    }

    public int getId_livro() {
        return id_livro;
    }

    public void setId_livro(int id_livro) {
        this.id_livro = id_livro;
    }

    public String getExemplar() {
        return exemplar;
    }

    public void setExemplar(String exemplar) {
        this.exemplar = exemplar;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public char getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(char disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
}
