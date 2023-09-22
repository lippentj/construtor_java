import java.sql.Connection;

public class Main {
    public static void main (String[] args){
        MySQL conexao = new MySQL();
        Connection conn = conexao.conectar();


    }
}
