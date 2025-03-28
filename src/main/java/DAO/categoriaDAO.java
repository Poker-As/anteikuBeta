package DAO;

import interfaces.crud;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import clasesDeObjetos.categoria;

public class categoriaDAO implements crud<categoria>{

    private static final String QUERY_INSERT = "INSERT INTO categoria (id_familia, nombre_familia, descripcion_categoria) VALUES (?,?,?)";
    private static final String QUERY_SELECT_ALL = "SELECT * FROM categoria";    
    private static final String QUERY_SELECT_ONE = "SELECT * FROM categoria WHERE id_categoria = ?";    
    
    
    @Override
    public List<categoria> listar() {

        try (Connection con = conexion.conexiondb.getInstance().getConexion();
            PreparedStatement pst = con.prepareStatement(QUERY_SELECT_ALL);
                ResultSet rs = pst.executeQuery()){
        
            List<categoria> listaCategorias = new ArrayList<>();
            
            while(rs.next()){
                listaCategorias.add(map(rs));
            }
            return listaCategorias;
        }catch(SQLException e){
            System.err.println(e.getMessage());
            return new ArrayList<>();
        }

    }

    @Override
    public boolean crear(categoria obj) {

        try (Connection con = conexion.conexiondb.getInstance().getConexion();
                PreparedStatement pst = con.prepareStatement(QUERY_INSERT)){
         
            pst.setLong(1, obj.getIdCategoria());
            
            return pst.executeUpdate() > 0;
            
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return false;
        }
    }

    @Override
    public boolean buscar(long id) {
         try(Connection con = conexion.conexiondb.getInstance().getConexion();
             PreparedStatement pst = con.prepareStatement(QUERY_SELECT_ONE)){
        
            pst.setLong(1, id);
            ResultSet rs = pst.executeQuery();
            
            return rs.next();
            
        }catch(SQLException e){
            System.err.println(e.getMessage());
            return false;
        }
    }

    @Override
    public categoria obtener(long id) {
         try (Connection con = conexion.conexiondb.getInstance().getConexion();
                PreparedStatement pst = con.prepareStatement(QUERY_SELECT_ONE)){
            
            pst.setLong(1, id);
            try(ResultSet rs = pst.executeQuery()){
                if(rs.next()){
                    return map(rs);
                }
            }
 
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    return null;
    }


    @Override
    public boolean modificar(categoria obj) {
    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean eliminar(long id) {
    throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public categoria map(ResultSet rs) throws SQLException {

        return new categoria(){{
        
            setIdCategoria(rs.getInt("id_familia"));
            setNombreCategotia(rs.getString("nombre_familia"));
            setDescripcionCategoria(rs.getString("descripcion_categoria"));
            
        }};

    }
       
}
