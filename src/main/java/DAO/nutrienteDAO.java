package DAO;

import interfaces.crud;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import clasesDeObjetos.nutriente;

public class nutrienteDAO implements crud<nutriente>{

        private static final String QUERY_INSERT = "INSERT INTO nutriente(id_nutriente, nombre_nutriente, porcion, porcentaje_diario) VALUES (?,?,?,?)";
        private static final String QUERY_SELECT_ALL = "SELECT * FROM nutriente";
        
    @Override
    public List<nutriente> listar() {

        try(Connection con = conexion.conexiondb.getInstance().getConexion();
                PreparedStatement pst = con.prepareStatement(QUERY_SELECT_ALL);
                ResultSet rs = pst.executeQuery()){
        
            List<nutriente> listaNutrientes = new ArrayList<>();
            
            while(rs.next()){
                listaNutrientes.add(map(rs));
            }
            return listaNutrientes;
        }catch(SQLException e){
            System.err.print(e.getMessage());
            return new ArrayList<>();
        }

    }

    @Override
    public boolean crear(nutriente i) {

        try(Connection con = conexion.conexiondb.getInstance().getConexion();
                PreparedStatement pst = con.prepareStatement(QUERY_INSERT)){
        
            pst.setLong(1, i.getIdNutriente());
            pst.setString(2, i.getNombreNutiente());
            pst.setDouble(3, i.getPorcion());
            pst.setDouble(4, i.getPorcentajeDiario());
            
            return pst.executeUpdate() > 0;
            
        }catch(SQLException e){
            System.err.println(e.getMessage());
            return false;
        }

    }

    @Override
    public boolean buscar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public nutriente obtener(long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean modificar(nutriente obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean eliminar(long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public nutriente map(ResultSet rs) throws SQLException {

        return new nutriente() {{
        
            setIdNutriente(rs.getLong("id_nutriente"));
            setNombreNutiente(rs.getString("nombre_nutriente"));
            setPorcion(rs.getDouble("porcion"));
            setPorcentajeDiario(rs.getDouble("porcentaje_diario"));
            
        }};
        
    }
    
}
