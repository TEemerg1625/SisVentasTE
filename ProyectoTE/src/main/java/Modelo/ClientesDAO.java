
package Modelo;

import Config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class ClientesDAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r;
    
     public Empleado validar(String user, String dni){
        Empleado em= new Empleado();
        String sql="select * from empleado where User=? and Dni=?";
        try{
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, dni);
            rs=ps.executeQuery();
            while (rs.next()){
                em.setId(rs.getInt("IdEmpleado"));
                em.setUser(rs.getString("User"));
                em.setDni(rs.getString("Dni"));
                em.setNom(rs.getString("Nombres"));
                
                
            }
        }catch(Exception e){
            
        }
        return em;
    }
     
    public Cliente buscar(String dni){
        Cliente c=new Cliente();
        String sql="select * from cliente where Dni="+dni;
        try{
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                c.setIdCliente(rs.getInt(1));
                c.setDni(rs.getString(2));
                c.setNom(rs.getString(3));
                c.setDir(rs.getString(4));
                c.setDepto(rs.getString(5));
                
                
            }
        
    }catch(Exception e){
            
            }
        return c;
    }
    
    
    //OPERACIONES CRUD-----------------******************************
    public List listar(){
        
        String sql="select * from cliente";
        List<Cliente>lista=new ArrayList<>();
        try{
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Cliente c=new Cliente();
                c.setIdCliente(rs.getInt(1));
                c.setDni(rs.getString(2));
                c.setNom(rs.getString(3));
                c.setDir(rs.getString(4));
                c.setDepto(rs.getString(5));
                lista.add(c);
            }
        }catch(Exception e){
            
        }
        return lista;
    }
    //*********************----------------------*****************
    public int agregar(Cliente c){
        String sql="insert into cliente(Dni,Nombres,Direccion,Departamento)values(?,?,?,?)";
        try{
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, c.getDni());
            ps.setString(2, c.getNom());
            ps.setString(3, c.getDir());
            ps.setString(4, c.getDepto());
            ps.executeUpdate();
            
            
        }catch(Exception e){
            
        }
        return r;
        
    }
    //**************---------------------******************
    public Cliente listarId(int id){
        Cliente c=new Cliente();
        String sql="select * from cliente where IdCliente="+id;
        try{
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                c.setDni(rs.getString(2));
                c.setNom(rs.getString(3));
                c.setDir(rs.getString(4));
                c.setDepto(rs.getString(5));
                
            }
        }catch(Exception e){
            
        }
        return c;
    }
    //*************************---------------------------**************
    public int actualizar(Cliente c){
         String sql="update cliente set Dni=?, Nombres=?, Direccion=?, Departamento=? where IdCliente=?";
        try{
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.setString(1, c.getDni());
            ps.setString(2, c.getNom());
            ps.setString(3, c.getDir());
            ps.setString(4, c.getDepto());
            ps.setInt(5, c.getIdCliente());
            ps.executeUpdate();
            
            
        }catch(Exception e){
            
        }
        return r;
        
    }
    //***************************-------------------------------------******************
    public void delete(int id){
        String sql="delete from cliente where IdCliente="+id;
        try{
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        }catch(Exception e){
            
        }
        
    }
}
