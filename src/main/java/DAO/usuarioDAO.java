package DAO;

import interfaces.crud;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import clasesDeObjetos.usuario;
import org.mindrot.jbcrypt.BCrypt;

public class usuarioDAO implements crud<usuario>{

    private static final String QUERY_INSERT = "INSERT INTO usuario (cedula_usuario, nombre_usuario, apellido_usuario, correo_usuario, contrasenia, telefono_usuario, "
            + "rol_usuario, fecha_nacimiento, genero) VALUES (?,?,?,?,?,?,?,?,?)";
    private static final String QUERY_SELECT_ALL = "SELECT * FROM usuario";
    private static final String QUERY_SELECT_ONE = "SELECT * FROM usuario WHERE cedula_usuario = ?";
    private static final String QUERY_UPDATE = "UPDATE usuario "
            + "SET nombre_usuario = ?, apellido_usuario = ?, correo_usuario = ?, "
            + "contrasenia = ?, telefono_usuario = ?, rol_usuario = ?, fecha_nacimiento = ?, genero = ?";
    private static final String QUERY_DELETE = "DELETE FROM usuario WHERE cedula_usuario = ?";
    private static final String QUERY_LOGIN = "SELECT * FROM usuario WHERE cedula_usuario = ?";
    
    @Override
    public List<usuario> listar() {
        
        try(Connection con = conexion.conexiondb.getInstance().getConexion();
                PreparedStatement pst = con.prepareStatement(QUERY_SELECT_ALL);
                ResultSet rs = pst.executeQuery()){
        
            List<usuario> listaUsuario = new ArrayList<>();
            while(rs.next()){
                listaUsuario.add(map(rs));
            }
            return listaUsuario;
        }catch(SQLException e){
            System.err.println(e.getMessage());
            return new ArrayList<>();
        }
        
    }

    @Override
    public boolean crear(usuario u) {

        try(Connection con = conexion.conexiondb.getInstance().getConexion();
                PreparedStatement pst = con.prepareStatement(QUERY_INSERT)){
        
            pst.setLong(1, u.getCedulaUsuario());
            pst.setString(2, u.getNombreUsuario());
            pst.setString(3, u.getApellidoUsuario());
            pst.setString(4, u.getCorreoUsuario());
            pst.setString(5, u.getCotraseniaUsuario());
            pst.setString(6, u.getTelefonoUsuario());
            pst.setString(7, u.getRolUsuario());
            pst.setDate(8, (java.sql.Date) u.getFechaNacimiento());
            pst.setString(9, u.getGenero());
            
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
            
            try(ResultSet rs = pst.executeQuery()){
                return rs.next();
            }
            
        }catch(SQLException e){
            System.err.println(e.getMessage());
            return false;
        }
    }

    @Override
    public usuario obtener(long id) {

        try(Connection con = conexion.conexiondb.getInstance().getConexion();
                PreparedStatement pst = con.prepareStatement(QUERY_INSERT)){
        
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
    public boolean modificar(usuario u) {

        try(Connection con = conexion.conexiondb.getInstance().getConexion();
                PreparedStatement pst = con.prepareStatement(QUERY_UPDATE)){
        
            pst.setString(1, u.getNombreUsuario());
            pst.setString(2, u.getApellidoUsuario());
            pst.setString(3, u.getCorreoUsuario());
            pst.setString(4, u.getCotraseniaUsuario());
            pst.setString(5, u.getTelefonoUsuario());
            pst.setString(6, u.getRolUsuario());
            pst.setDate(7, u.getFechaNacimiento());
            pst.setString(8, u.getGenero());
            
            return pst.executeUpdate() > 0;
            
        }catch(SQLException e){
            System.err.println(e.getMessage());
            return false;
        }

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
    public usuario map(ResultSet rs) throws SQLException {
        return new usuario(){{
            setCedulaUsuario(rs.getLong("cedula_usuario"));
            setNombreUsuario(rs.getString("nombre_usuario"));
            setApellidoUsuario(rs.getString("apellido_usuario"));
            setCorreoUsuario(rs.getString("correo_usuario"));
            setCotraseniaUsuario(rs.getString("contrasenia"));
            setTelefonoUsuario(rs.getString("telefono_usuario"));
            setRolUsuario(rs.getString("rol_usuario"));
            setFechaNacimiento(rs.getDate("fecha_nacimiento"));
        }};
    }
        
    //Metodo para ingresar al login
    
    public boolean ingresarAlLogin(long cedula, String password){
        
        try (Connection con = conexion.conexiondb.getInstance().getConexion(); 
                PreparedStatement pst = con.prepareStatement(QUERY_LOGIN)) {

            pst.setLong(1, cedula);

            try (ResultSet rs = pst.executeQuery()) {
                if (rs.next()) {
                    String hashedPassword = rs.getString("contrasenia");

                    return BCrypt.checkpw(password, hashedPassword);
                }
            }
        } catch (SQLException e) {
            System.err.println("Error en la consulta de login: " + e.getMessage());
        }
        return false;
    }
}
