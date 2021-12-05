
package Modelo;

import Config.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class ProductoDAO {
    
    Conexion cn=new Conexion();
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
   //OPERACIONES CRUD
    
    public List listar(){
        String sql="select * from producto";
        List<Producto>lista=new ArrayList<>();
         try{
             con=cn.Conexion();
             ps=con.prepareStatement(sql);
             rs=ps.executeQuery();
             while (rs.next()){
                Producto pro=new Producto();
                pro.setIdProducto(rs.getInt(1));
                pro.setNom(rs.getString(2));
                pro.setPrecio(rs.getFloat(3));
                pro.setStock(rs.getString(4));
                pro.setDepto(rs.getString(5));
                lista.add(pro);           
         }
             
         }catch(Exception e){
         }
         return lista;
    }
    public int agregar(Producto pro){
        String sql="insert into producto(Nombres,Precio,Stock,Departamento)values(?,?,?,?)";
          try{
              con=cn.Conexion();
              ps=con.prepareStatement(sql);
              ps.setString(1, pro.getNom());
              ps.setFloat(2, pro.getPrecio());
              ps.setString(3, pro.getStock());
              ps.setString(4, pro.getDepto());
              ps.executeUpdate();
          }catch (Exception e){
              
          }
          return r;
}
    public Producto listarId (int id){
        Producto pro=new Producto();
        String sql="select * from producto where IdProducto="+id;
        try{
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
             while (rs.next()){
                  pro.setNom(rs.getString(2));
                  pro.setPrecio(rs.getFloat(3));
                  pro.setStock(rs.getString(4));
                  pro.setDepto(rs.getString(5));
                  
             }
            
        }catch (Exception e){
            
        }
        return pro;
        
    }
    public int actualizar(Producto pro){
        String sql="update producto set Nombres=?,Precio=?,Stock=?,Departamento=? where IdProducto=?";
          try{
              con=cn.Conexion();
              ps=con.prepareStatement(sql);
              ps.setString(1, pro.getNom());
                 ps.setFloat(2, pro.getPrecio());
                    ps.setString(3, pro.getStock());
                       ps.setString(4, pro.getDepto());
                          ps.setInt(5, pro.getIdProducto());
              ps.executeUpdate();
          }catch (Exception e){
              
          }
          return r;
        
    }
    public void delete(int id){
        String sql="delete  from producto where IdProducto="+id;
        try{
            con=cn.Conexion();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        }catch (Exception e){
            
        }
        
        
    }
}
    
