/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author mohamad
 */
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String x = req.getParameter("nama"); //untuk mengambil request
        String output = "hallo " + x;
        resp.getWriter().print(output); //respon ketika dipanggil
        resp.getWriter().flush(); // memastika bahwa respon dikitim
    }
    
    
}
