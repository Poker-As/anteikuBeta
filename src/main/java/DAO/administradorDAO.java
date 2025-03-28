package DAO;

import interfaces.crud;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import clasesDeObjetos.administrador;

public class administradorDAO implements crud<administrador>{

    private static final String QUERY_INSERT = "INSERT INTO administrador (cedula_administrador) VALUES (?)";
    private static final String QUERY_SELECT_ALL = "SELECT a.cedula_administrador, u.nombre usuario, "
            + "u.apellido_usuario, u.correo_usuario, u.contrasenia, u.telefono_usuario, u.rol_usuario, u.fecha_nacimiento, "
            + "u.genero "
            + "FROM administrador a "
            + "JOIN usuario u ON a.cedula_administrador = u.cedula_usuario";
    private static final String QUERY_SELECT_ONE = "SELECT a.cedula_administrador, u.nombre usuario, "
            + "u.apellido_usuario, u.correo_usuario, u.contrasenia, u.telefono_usuario, u.rol_usuario, u.fecha_nacimiento, "
            + "u.genero "
            + "FROM administrador a "
            + "JOIN usuario u ON a.cedula_administrador = u.cedula_usuario "
            + "WHERE a.cedula_administrador = ?";
    private static final String QUERY_DELETE = "DELETE FROM adminsitrador WHERE cedula_administrador = ?";
    
    @Override
    public List<administrador> listar() {

        try(Connection con = conexion.conexiondb.getInstance().getConexion();
                PreparedStatement pst = con.prepareStatement(QUERY_SELECT_ALL);
                ResultSet rs = pst.executeQuery()){
        
            List<administrador> listaAdministrador = new ArrayList<>();
            
            while(rs.next()){
                listaAdministrador.add(map(rs));
            }
            return listaAdministrador;
        }catch(SQLException e){
            System.err.println(e.getMessage());
            return new ArrayList<>();
        }
    }

    @Override
    public boolean crear(administrador a) {

        try(Connection con = conexion.conexiondb.getInstance().getConexion();
                PreparedStatement pst = con.prepareStatement(QUERY_INSERT)){
        
            pst.setLong(1, a.getCedulaUsuario());
            
            return pst.executeUpdate() > 0;
            
        }catch(SQLException e){
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
    public administrador obtener(long id) {

        try(Connection con = conexion.conexiondb.getInstance().getConexion();
                PreparedStatement pst = con.prepareStatement(QUERY_SELECT_ONE)){
        
            pst.setLong(1, id);
            try(ResultSet rs = pst.executeQuery()){
                if(rs.next()){
                    return map(rs);
                }
            }
            
        }catch(SQLException e){
           System.err.println(e.getMessage());
        }
        return null;
    }

    @Override
    public boolean modificar(administrador a) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean eliminar(long id) {

        try(Connection con = conexion.conexiondb.getInstance().getConexion();
                PreparedStatement pst = con.prepareStatement(QUERY_DELETE)){
        
            pst.setLong(1, id);
            return pst.executeUpdate() > 0;
            
        }catch(SQLException e){
            System.err.println(e.getMessage());
            return false;
        }

    }

    @Override
    public administrador map(ResultSet rs) throws SQLException {
        
        return new administrador(){{
        
            setCedulaUsuario(rs.getLong("cedula_administrador"));
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


}
