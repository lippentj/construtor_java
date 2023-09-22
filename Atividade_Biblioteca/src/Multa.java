import java.text.DecimalFormat;

public class Multa extends Main{
    private int id_multa;
    private String descricao;
    private int valor;

    public Multa(int id_multa, String descricao, int valor) {
        this.id_multa = id_multa;
        this.descricao = descricao;
        this.valor = valor;
    }

    public int getId_multa() {
        return id_multa;
    }

    public void setId_multa(int id_multa) {
        this.id_multa = id_multa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
