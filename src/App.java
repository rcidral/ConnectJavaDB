import java.sql.PreparedStatement;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            Veiculo veiculo = new Veiculo(1, "Civic", "Honda", "2022", "abc1234");
            PreparedStatement stmt = DAO.createConnection().prepareStatement(
                "INSERT INTO veiculo (id, nome, marca, modelo, placa) VALUES (?, ?, ?, ?, ?);"
            );
            stmt.setInt(1, veiculo.getId());
            stmt.setString(2, veiculo.getNome());
            stmt.setString(3, veiculo.getMarca());
            stmt.setString(4, veiculo.getModelo());
            stmt.setString(5, veiculo.getPlaca());
            stmt.execute();
            DAO.closeConnection();
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
