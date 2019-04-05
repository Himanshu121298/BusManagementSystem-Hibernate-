/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Bean.Student;
import Dao.StudentDeclaration;
import Dao.StudentOperation;
import HelpingClasses.BCrypt;
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
@WebServlet(name = "RegisterController", urlPatterns = {"/RegisterController"})
public class RegisterController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        String name, username, password,address,account;
        name = req.getParameter("name");
        username = req.getParameter("username");
        password = req.getParameter("password");
        address = req.getParameter("address");
        account = req.getParameter("account");
        password=BCrypt.hashpw(password,BCrypt.gensalt(12));
        Student st = new Student(name, username, password,address,account);
        StudentDeclaration sd = new StudentOperation();
        long id = sd.insertStudent(st);
        if (id > 0) {
           
            if(account.equals("Faculty"))
            {
               resp.sendRedirect("AdminPanel/FacultyInfo.jsp");
            }
            else{
               resp.sendRedirect("AdminPanel/UserInfo.jsp");
            }
        }
}
}
