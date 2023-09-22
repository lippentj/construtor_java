import java.util.Date;

public class Cliente extends Main{
    private int id_cliente;
    private String nome;
    private Date data_nasc;
    private enum sexo{
        M, F
    }
    private String cpf;
    private String endereco;
    private String fone;

    public Cliente(int id_cliente, String nome, Date data_nasc, String cpf, String endereco, String fone) {
        this.id_cliente = id_cliente;
        this.nome = nome;
        this.data_nasc = data_nasc;
        this.cpf = cpf;
        this.endereco = endereco;
        this.fone = fone;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(Date data_nasc) {
        this.data_nasc = data_nasc;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }
}
