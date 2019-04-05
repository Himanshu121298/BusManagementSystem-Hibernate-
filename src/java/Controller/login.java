
/*
/ * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
package Controller;

import Bean.Student;
import Dao.StudentDeclaration;
import Dao.StudentOperation;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

///**
// *
// * @author hp
// */
public class login extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        String username, password, account;
        username = req.getParameter("username");
        password = req.getParameter("password");
        account = req.getParameter("account");
        Student st = new Student();
        st.setUsername(username);
        st.setPassword(password);
        st.setAccount(account);
        StudentDeclaration sd = new StudentOperation();
        Student st2 = sd.SignIn(st);
        if (st2 != null) {
            HttpSession session = req.getSession();
            session.setAttribute("username", username);
            switch (account) {
                case "Admin": {
                    //out.println("Admin");
                    resp.sendRedirect("AdminPanel/UserInfo.jsp");
                    break;
                }
                case "Student": {
                    //out.println("Student");
                    resp.sendRedirect("Start.jsp");
                    break;
                }
                case "Faculty": {
                    // out.println("Faculty");
                    resp.sendRedirect("FacultyPanel/FUserInfo.jsp");
                    break;
                }
            }
        } else {

            resp.sendRedirect("index.jsp?info=Username or Password Wrong");
        }

    }
}
