import java.sql.PreparedStatement;

public class Veiculo {
    
    private int id;
    private String nome;
    private String marca;
    private String modelo;
    private String placa;

    public Veiculo(
        int id,
        String nome,
        String marca,
        String modelo,
        String placa) throws Exception {
        this.id = id;
        this.nome = nome;
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;

        PreparedStatement stmt = DAO.createConnection().prepareStatement(
            "INSERT INTO veiculo (id, nome, marca, modelo, placa) VALUES (?, ?, ?, ?, ?);"
        );
        stmt.setInt(1, this.getId());
        stmt.setString(2, this.getNome());
        stmt.setString(3, this.getMarca());
        stmt.setString(4, this.getModelo());
        stmt.setString(5, this.getPlaca());
        stmt.execute();
        DAO.closeConnection();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModleo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
}
