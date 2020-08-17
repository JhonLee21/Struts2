/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.usuario;
import conexion.ConexionSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class UsuarioDao {
    
    private String sql ="insert into usuario(id, nombre, apellido, correo, pass) values(?,?,?,?,?)";
    private String sql2="select * from usuario";
    private String sql3 ="update usuario set nombre=? ,apellido=? ,correo=?,pass=? where id=? ";
    private String sql4="delete from usuario where id=?";
    
    public boolean insertUsuario(usuario u) throws SQLException{
        boolean resultado=false;
        
        Connection con=ConexionSQL.getConnection();
        
        PreparedStatement ps=con.prepareStatement(sql);
        
        ps.setString(1, u.getId());
        ps.setString(2, u.getNombre());
        ps.setString(3, u.getApellido());
        ps.setString(4, u.getCorreo());
        ps.setString(5, u.getPass());
        
        if(ps.executeUpdate()==1){
            
            resultado=true;
            ps.close();
            con.close();
            
            
        }
        
        
        return resultado;
    }
    
    public List<usuario> consulta() throws SQLException{
    List<usuario> lista = new ArrayList<usuario>();
        Connection con=ConexionSQL.getConnection();
        PreparedStatement ps=con.prepareStatement(sql2);
        ResultSet res=ps.executeQuery();
        
        while(res.next()){
            usuario us=new usuario();
            us.setId(res.getString(1));
            us.setNombre(res.getString(2));
            us.setApellido(res.getString(3));
            us.setCorreo(res.getString(4));
            us.setPass(res.getString(5));
            lista.add(us);
            
        }
        ps.close();
        res.close();
        con.close();
    
    
        return lista;
    }
    public void update(usuario upd){
    try{
        Connection con=ConexionSQL.getConnection();
        
        PreparedStatement ps=con.prepareStatement(sql3);
        ps.setString(1, upd.getId());
        ps.setString(2, upd.getNombre());
        ps.setString(3, upd.getApellido());
        ps.setString(4, upd.getCorreo());
        ps.setString(5, upd.getPass());
        ps.executeUpdate();

        } catch (SQLException e) {
                System.err.println(e.getMessage());
        }
    }
    
    
    public void deleteUser(usuario Id) {
        try {
            Connection con=ConexionSQL.getConnection();
            PreparedStatement ps=con.prepareStatement(sql4);
            ps.setString(1, Id.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
  
}
