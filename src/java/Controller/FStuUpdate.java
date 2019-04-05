/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Bean.Student;
import Dao.StudentOperation;
import HelpingClasses.BCrypt;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hp
 */
public class FStuUpdate extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getParameter("id") != null) {
            PrintWriter out = resp.getWriter();
            String name, username, password, address, account;
            name = req.getParameter("name");
            username = req.getParameter("username");
            password = req.getParameter("password");
            address = req.getParameter("address");
            account = req.getParameter("account");
            password=BCrypt.hashpw(password,BCrypt.gensalt(12));
            Student st = new Student(name, username, password, address, account);
            long id = Long.parseLong(req.getParameter("id"));
            StudentOperation so = new StudentOperation();
            long l = so.upDate(id, st);
            if (l > 0) {
              
               resp.sendRedirect("FacultyPanel/UserInfo.jsp");
            
            } 
        }
    }
}
