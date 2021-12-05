
package Controlador;

import Modelo.Empleado;
import Modelo.EpleadoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Validar extends HttpServlet {

    
EpleadoDAO edao=new EpleadoDAO();
Empleado em=new Empleado();
  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String accion=request.getParameter("accion");
        
        if(accion.equalsIgnoreCase("Ingresar")){
            String user=request.getParameter("txtuser");
            String pass=request.getParameter("txtpass");
            em=edao.validar(user, pass);
            if(em.getUser()!=null){
                request.setAttribute("usuario", em);
                
                request.getRequestDispatcher("Controlador?menu=Principal").forward(request, response);
            }else{
                request.getRequestDispatcher("index.jsp").forward(request, response);
                
            }
            
        }
       
    else{
            request.getRequestDispatcher("index.jsp").forward(request, response);
}
}

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
