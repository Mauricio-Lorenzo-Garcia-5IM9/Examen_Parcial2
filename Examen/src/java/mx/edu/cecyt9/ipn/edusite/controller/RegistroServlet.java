package mx.edu.cecyt9.ipn.edusite.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mx.edu.cecyt9.ipn.edusite.utils.Conexion;

public class RegistroServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RegistroServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RegistroServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        String nombre;
        String apellidom;
        String apellidop;
        String escuela;
        String mf;
        String df;
        
        nombre= request.getParameter("nombre");
        apellidom= request.getParameter("aMaterno");
        apellidop = request.getParameter("aPaterno");
        escuela= request.getParameter("Escuela");
        mf= request.getParameter("mFavorita");
        df= request.getParameter("dFavorito");
        
      try{  
        


      // the mysql insert statement
      String query = " insert into usuario (id_usuario, nombre, apellido)"
        + " values (?, ?, ?)";

      // create the mysql insert preparedstatement
      PreparedStatement preparedStmt = Conexion.obtener.prepareStatement(query);
      preparedStmt.setInt (1, 5);
      preparedStmt.setString (2, nombre);
      preparedStmt.setString   (3, apellido);

      // execute the preparedstatement
      preparedStmt.execute();
      
      Conexion.cerrar();
    }
    catch (Exception e)
    {
      System.err.println("Got an exception!");
      System.err.println(e.getMessage());
    }
        
        
        
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
