package DAO;

import interfaces.crud;
import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import clasesDeObjetos.ingrediente;
import clasesDeObjetos.nutriente;

public class ingredienteDAO implements crud<ingrediente>{

    private static final String QUERY_INSERT = "INSERT INTO componente (id_componente, id_nutriente, nombre_componente, cantidad, descripcion) VALUES (?,?,?,?,?)";
    private static final String QUERY_SELECT_ALL = "SELECT * FROM componente";
    private static final String QUERY_SELECT_ONE = "SELECT * FROM componente WHERE id_componente = ?";
    private static final String QUERY_UPDATE = "UPDATE componente "
            + "SET nombre_componente = ?, cantidad = ?, descripcion = ?";
    private static final String QUERY_DELETE = "DELETE FROM componente WHERE id_componente = ?";
    
    @Override
    public List<ingrediente> listar() {

        try(Connection con = conexion.conexiondb.getInstance().getConexion();
                PreparedStatement pst = con.prepareStatement(QUERY_SELECT_ALL);
                ResultSet rs = pst.executeQuery()){
        
            List<ingrediente> listaIngrediente = new ArrayList<>();
            while(rs.next()){
                listaIngrediente.add(map(rs));
            }
            return listaIngrediente;
        }catch(SQLException e){
            System.err.println(e.getMessage());
            return new ArrayList<>();
        }

    }

    @Override
    public boolean crear(ingrediente i) {

        try(Connection con = conexion.conexiondb.getInstance().getConexion();
                PreparedStatement pst = con.prepareStatement(QUERY_INSERT)){
        
            pst.setLong(1, i.getIdIngrediente());
            
            Long[] arrayNutriente = i.getIdNutriente().toArray(new Long[0]);
            Array sqlArray = con.createArrayOf("BIGINT", arrayNutriente);
            pst.setArray(2, sqlArray);
            
            pst.setString(3, i.getNombreIngrediente());
            pst.setDouble(4, i.getCantidadIngrediente());
            pst.setString(5, i.getDescripcion());
            
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
    public ingrediente obtener(long id) {

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
    public boolean modificar(ingrediente i) {

        try(Connection con = conexion.conexiondb.getInstance().getConexion();
                PreparedStatement pst = con.prepareStatement(QUERY_UPDATE)){
        
            pst.setString(1, i.getNombreIngrediente());
            pst.setDouble(2, i.getCantidadIngrediente());
            pst.setString(3, i.getDescripcion());
            
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
    public ingrediente map(ResultSet rs) throws SQLException {

        return new ingrediente() {{
        
            setIdIngrediente(rs.getLong("id_componente"));
            setIdNutriente((List<Long>) rs.getArray("id_nutriente"));
            setNombreIngrediente(rs.getString("nombre_componente"));
            setCantidadIngrediente(rs.getDouble("cantidad"));
            setDescripcion(rs.getString("descripcion"));
            
        }};
        
    }
    
    public void llenarComboBoxNutriente(JComboBox<String> comboBox){
    
        nutrienteDAO nDao = new nutrienteDAO();
        
        DefaultComboBoxModel<String> model = new DefaultComboBoxModel<>();
        
        comboBox.removeAll();
        List<nutriente> listaNutriente = nDao.listar();
        
        if(listaNutriente.isEmpty()){
            model.addElement("No hay nutrientes registrados");
        }else{
            for(nutriente n : listaNutriente){
                model.addElement(n.getIdNutriente() + "-" + n.getNombreNutiente());
            }
        }
        comboBox.setModel(model);
    }
    
}
