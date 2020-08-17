/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

import bean.usuario;
import com.opensymphony.xwork2.ActionSupport;
import dao.UsuarioDao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class Service extends ActionSupport{
    private usuario us=new usuario();
    
    
    @Override
    public String execute() throws SQLException{
        
        UsuarioDao ad=new UsuarioDao();
        
  
        ad.insertUsuario(getUs());
        
        
        return SUCCESS;
    }
    
    
    private List<usuario> lista=new ArrayList<usuario>();
    public String consulta() throws SQLException{
        UsuarioDao ad=new UsuarioDao();
        setLista(ad.consulta());
        
        return SUCCESS;
        
        
    }
    
    

    /**
     * @return the us
     */
    public usuario getUs() {
        return us;
    }

    /**
     * @param us the us to set
     */
    public void setUs(usuario us) {
        this.us = us;
    }

    /**
     * @return the lista
     */
    public List<usuario> getLista() {
        return lista;
    }

    /**
     * @param lista the lista to set
     */
    public void setLista(List<usuario> lista) {
        this.lista = lista;
    }
}
