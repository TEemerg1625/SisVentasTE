
package Controlador;

import Modelo.Cliente;
import Modelo.ClientesDAO;
import Modelo.Empleado;
import Modelo.EpleadoDAO;
import Modelo.Producto;
import Modelo.ProductoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Controlador extends HttpServlet {

     Empleado em=new Empleado();
     EpleadoDAO edao=new EpleadoDAO();
     Producto pro=new Producto();
     ProductoDAO pdao=new ProductoDAO();
     Cliente c=new Cliente();
     ClientesDAO cdao=new ClientesDAO();
     int ide;
     int ede;
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            String menu=request.getParameter("menu");
            String accion=request.getParameter("accion");
            if(menu.equals("Principal")){
                request.getRequestDispatcher("Principal.jsp").forward(request, response);
                
            } 
             if(menu.equals("Empleado")){
                 switch (accion){
                     case "Listar":
                        List lista=edao.listar();
                        request.setAttribute("empleados", lista);
                        
                     break;
                     case "Agregar":
                         String dni=request.getParameter("txtDni");
                         String nom=request.getParameter("txtNombres");
                         String tel=request.getParameter("txtTel");
                         String depto=request.getParameter("txtdepartamento");
                         String user=request.getParameter("txtUsuario");
                         em.setDni(dni);
                         em.setNom(nom);
                         em.setTel(tel);
                         em.setDepto(depto);
                         em.setUser(user);
                         edao.agregar(em);
                         request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);
                           break;
                           
                     case "Editar":
                          ide=Integer.parseInt(request.getParameter("id"));
                          Empleado e=edao.listarId(ide);
                          request.setAttribute("empleado", e);
                          //request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);
                          request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);
                          break;
                          
                     case "Actualizar":
                         String dni1=request.getParameter("txtDni");
                         String nom1=request.getParameter("txtNombres");
                         String tel1=request.getParameter("txtTel");
                         String depto1=request.getParameter("txtdepartamento");
                         String user1=request.getParameter("txtUsuario");
                         em.setDni(dni1);
                         em.setNom(nom1);
                         em.setTel(tel1);
                         em.setDepto(depto1);
                         em.setUser(user1);
                         edao.agregar(em);
                         em.setId(ide);
                         edao.actualizar(em);
                         request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);
                         break;
                             
                     case "Delete":
                         ide=Integer.parseInt(request.getParameter("id"));
                         edao.delete(ide);
                         request.getRequestDispatcher("Controlador?menu=Empleado&accion=Listar").forward(request, response);
                     
                     break;
                     default:
                         throw new AssertionError();
                 }
                 
                request.getRequestDispatcher("Empleado.jsp").forward(request, response);
 //CLIENTES CLIENTES CLIENTES CLIENTES    ****************************          
            } 
              if(menu.equals("Cliente")){
                  switch (accion){
                       case "Listar":
                           List lista=cdao.listar();
                           request.setAttribute("clientes", lista);
                           
                               break;
                       case "Agregar":
                           String dni=request.getParameter("txtDni");
                           String nom=request.getParameter("txtNombres");
                            String dir=request.getParameter("txtDireccion");
                             String depto=request.getParameter("txtDepartamento");
                           c.setDni(dni);
                           c.setNom(nom);
                           c.setDir(dir);
                           c.setDepto(depto);
                           cdao.agregar(c);
                           request.getRequestDispatcher("Controlador?menu=Cliente&accion=Listar").forward(request, response);
                       break;
                       case "Editar":
                           
                             
                            ide=Integer.parseInt(request.getParameter("id"));
                            Cliente ct=cdao.listarId(ide);
                            request.setAttribute("cliente", ct);
                            request.getRequestDispatcher("Controlador?menu=Cliente&accion=Listar").forward(request, response);
                            
                            
                       break;
                       case "Actualizar":
                           String dni1=request.getParameter("txtDni");
                           String nom1=request.getParameter("txtNombres");
                            String dir1=request.getParameter("txtDireccion");
                             String depto1=request.getParameter("txtDepartamento");
                            c.setDni(dni1);
                            c.setNom(nom1);
                            c.setDir(dir1);
                            c.setDepto(depto1);
                            c.setIdCliente(ide);
                           cdao.actualizar(c);
                           request.getRequestDispatcher("Controlador?menu=Cliente&accion=Listar").forward(request, response);
                       break;
                       case "Delete":
                           ide=Integer.parseInt(request.getParameter("id"));
                           cdao.delete(ide);
                           request.getRequestDispatcher("Controlador?menu=Cliente&accion=Listar").forward(request, response);
                       break;
                   }
                request.getRequestDispatcher("Clientes.jsp").forward(request, response);
                
            } 
              
              //***************************************************
               if(menu.equals("Producto")){
                   switch (accion){
                       case "Listar":
                           List lista=pdao.listar();
                           request.setAttribute("productos", lista);
                           
                               break;
                       case "Agregar":
                           String nom=request.getParameter("txtNombre");
                           Float precio=Float.parseFloat(request.getParameter("txtPrecio"));
                           
                           String stock=request.getParameter("txtStock");
                           String depto=request.getParameter("txtdepartamento");
                           pro.setNom(nom);
                           pro.setPrecio(precio);
                           pro.setStock(stock);
                           pro.setDepto(depto);
                           pdao.agregar(pro);
                           request.getRequestDispatcher("Controlador?menu=Producto&accion=Listar").forward(request, response);
                           
                       break;
                       case "Editar":
                           ide=Integer.parseInt(request.getParameter("id"));
                           Producto p=pdao.listarId(ide);
                           request.setAttribute("producto", p);
                           request.getRequestDispatcher("Controlador?menu=Producto&accion=Listar").forward(request, response);
                       break;
                       
                       case "Actualizar":
                           String nom1=request.getParameter("txtNombre");
                           Float precio1=Float.parseFloat(request.getParameter("txtPrecio"));
                           
                           String stock1=request.getParameter("txtStock");
                           String depto1=request.getParameter("txtdepartamento");
                           pro.setNom(nom1);
                           pro.setPrecio(precio1);
                           pro.setStock(stock1);
                           pro.setDepto(depto1);
                           pro.setIdProducto(ide);
                           pdao.actualizar(pro);
                          
                           request.getRequestDispatcher("Controlador?menu=Producto&accion=Listar").forward(request, response);
                       break;
                       
                       
                       case "Delete":
                            ide=Integer.parseInt(request.getParameter("id"));
                            pdao.delete(ide);
                            request.getRequestDispatcher("Controlador?menu=Producto&accion=Listar").forward(request, response);
                       break;
                   }
                   
                request.getRequestDispatcher("Producto.jsp").forward(request, response);
                  
                
            }
               
 //REGISTARA VENTA REGISTRAR VENTA REGISTRAR VENTA ************************
                if(menu.equals("NuevaVenta")){
                   switch (accion){
                       case "BuscarCliente":
                           String dni=request.getParameter("codigocliente");
                           c.setDni(dni);
                           c=cdao.buscar(dni);
                           request.setAttribute("c", c);
                       break;
                       default:
                           throw new AssertionError();
                   }
                    request.getRequestDispatcher("RegistrarVenta.jsp").forward(request, response);
           }  
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
