import java.util.Date;

public class Emprestimo extends Main{
    private int id_emprestimo;
    private Date data_emprestimo;
    private Date data_devolucao;

    public Emprestimo(int id_emprestimo, Date data_emprestimo, Date data_devolucao) {
        this.id_emprestimo = id_emprestimo;
        this.data_emprestimo = data_emprestimo;
        this.data_devolucao = data_devolucao;
    }

    public int getId_emprestimo() {
        return id_emprestimo;
    }

    public void setId_emprestimo(int id_emprestimo) {
        this.id_emprestimo = id_emprestimo;
    }

    public Date getData_emprestimo() {
        return data_emprestimo;
    }

    public void setData_emprestimo(Date data_emprestimo) {
        this.data_emprestimo = data_emprestimo;
    }

    public Date getData_devolucao() {
        return data_devolucao;
    }

    public void setData_devolucao(Date data_devolucao) {
        this.data_devolucao = data_devolucao;
    }
}
