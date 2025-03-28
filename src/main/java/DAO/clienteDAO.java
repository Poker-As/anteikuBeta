package DAO;

import interfaces.crud;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import clasesDeObjetos.cliente;

public class clienteDAO implements crud<cliente>{

    private static final String QUERY_INSERT = "INSERT INTO cliente (cedula_cliente) VALUES (?)";
    private static final String QUERY_SELECT_ALL = "SELECT c.cedula_cliente, "
            + " u.nombre_usuario, "
            + "u.apellido_usuario, u.correo_usuario, u.contrasenia, u.telefono_usuario, u.rol_usuario, u.fecha_nacimiento, "
            + "u.genero "
            + "FROM cliente c "
            + "JOIN usuario u ON c.cedula_cliente = u.cedula_usuario";
    private static final String QUERY_SELECT_ONE = "SELECT c.cedula_cliente, "
            + " u.nombre_usuario, "
            + "u.apellido_usuario, u.correo_usuario, u.contrasenia, u.telefono_usuario, u.rol_usuario, u.fecha_nacimiento, "
            + "u.genero "
            + "FROM cliente c "
            + "JOIN usuario u ON c.cedula_cliente = u.cedula_usuario "
            + "WHERE c.cedula_cliente = ?";
    private static final String QUERY_DELETE = "DELETE FROM cliente WHERE cedula_cliente = ?";
    private static final String QUERY_COUNT_CLIENT = "SELECT COUNT(*) AS total_cliente FROM cliente";
    
    @Override
    public List<cliente> listar() {

        try (Connection con = conexion.conexiondb.getInstance().getConexion();
                PreparedStatement pst = con.prepareStatement(QUERY_SELECT_ALL);
                ResultSet rs = pst.executeQuery()){
            
            List<cliente> listaClientes = new ArrayList<>();
            
            while(rs.next()){

                listaClientes.add(map(rs));
            }
            return listaClientes;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return new ArrayList<>();
        }
    }

    @Override
    public boolean crear(cliente c) {

        try (Connection con = conexion.conexiondb.getInstance().getConexion();
                PreparedStatement pst = con.prepareStatement(QUERY_INSERT)){
         
            pst.setLong(1, c.getCedulaUsuario());
            
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
    public cliente obtener(long id) {
    
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
    public boolean modificar(cliente obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean eliminar(long id) {

        try (Connection con = conexion.conexiondb.getInstance().getConexion();
                PreparedStatement pst = con.prepareStatement(QUERY_DELETE)){
                
            pst.setLong(1, id);
            return pst.executeUpdate() > 0;
            
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            return false;
        }   
    }

    @Override
    public cliente map(ResultSet rs) throws SQLException {
    
        return new cliente() {{
        
            setCedulaUsuario(rs.getLong("cedula_cliente"));
            setNombreUsuario(rs.getString("nombre_usuario"));
            setApellidoUsuario(rs.getString("apellido_usuario"));
            setCorreoUsuario(rs.getString("correo_usuario"));
            setCotraseniaUsuario(rs.getString("contrasenia"));
            setTelefonoUsuario(rs.getString("telefono_usuario"));
            setRolUsuario(rs.getString("rol_usuario"));
            setFechaNacimiento(rs.getDate("fecha_nacimiento"));
            setGenero(rs.getString("genero"));
            
        }};
    
    }
    
    public long contadorDeClientes(){
    
        try(Connection con = conexion.conexiondb.getInstance().getConexion();
                PreparedStatement pst = con.prepareStatement(QUERY_COUNT_CLIENT)){

            long cont = 0;
            
            ResultSet rs = pst.executeQuery();
            
            if(rs.next()){
                cont = rs.getLong("total_cliente");
            }
            return cont;
        }catch(SQLException e){
            System.err.println(e.getMessage());
        }
        return 0;
        
    }
    
}
