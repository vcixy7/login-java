package dao;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dao {

    // CADASTRAR USUÁRIO
    public boolean cadastrar(String nome, String gmail, String senha, String log) {
        String sql = "INSERT INTO usarios (nome, email, senha, log) VALUES (?, ?, ?, ?)";

        try (Connection con = Conexao.getconexao();
             PreparedStatement stmt = con.prepareStatement(sql)) {

            stmt.setString(1, nome);
            stmt.setString(2, gmail);
            stmt.setString(3, senha);
            stmt.setString(4, log);

            int linhasAfetadas = stmt.executeUpdate();
            return linhasAfetadas > 0; // retorna true se inseriu com sucesso

        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar: " + e.getMessage());
            return false;
        }
    }

    // LOGIN
    public boolean login(String nome, String senha) {
        String sql = "SELECT * FROM usarios WHERE nome = ? AND senha = ?";

        try (Connection con = Conexao.getconexao();
             PreparedStatement stmt = con.prepareStatement(sql)) {

            stmt.setString(1, nome);
            stmt.setString(2, senha);

            ResultSet rs = stmt.executeQuery();
            return rs.next(); // true se encontrou o usuário

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // VERIFICA SE USUÁRIO EXISTE PELO NOME
    public boolean usuarioExiste(String nome) {
        String sql = "SELECT * FROM usarios WHERE nome = ?";

        try (Connection con = Conexao.getconexao();
             PreparedStatement stmt = con.prepareStatement(sql)) {

            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();
            return rs.next(); // true se encontrou
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
