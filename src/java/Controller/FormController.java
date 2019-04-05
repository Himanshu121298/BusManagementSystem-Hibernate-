/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Bean.Contact;
import Dao.BusDeclaration;
import Dao.BusOperation;
import Dao.FormDeclaration;
import Dao.FormOperation;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hp
 */
@WebServlet(name = "FormController", urlPatterns = {"/FormController"})
public class FormController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        String name,username,email,Queries,Contact;
        name = req.getParameter("name");
        username = req.getParameter("username");
        email = req.getParameter("email");
        Queries = req.getParameter("Queries");
        Contact = req.getParameter("Contact");
        Contact st = new Contact(name,username,email,Queries,Contact);
        FormDeclaration sd = new FormOperation();
        long id = sd.insertQuestion(st);
        if (id > 0) {
               resp.sendRedirect("Start.jsp");
            }
            else{
               out.println("wrong");
            }
        
}
}
