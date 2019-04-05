/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Bean.Buses;
import Dao.BusDeclaration;
import Dao.BusOperation;
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
@WebServlet(name = "BusController", urlPatterns = {"/BusController"})
public class BusController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        String BusNo,BusRoute,BusTime,DriverName,DriverContact;
        BusNo = req.getParameter("BusNo");
        BusRoute = req.getParameter("BusRoute");
        BusTime = req.getParameter("BusTime");
        DriverName = req.getParameter("DriverName");
        DriverContact = req.getParameter("DriverContact");
        Buses st = new Buses(BusNo, BusRoute,BusTime,DriverName,DriverContact);
        BusDeclaration sd = new BusOperation();
        long id = sd.insertBus(st);
        if (id > 0) {
               resp.sendRedirect("AdminPanel/BusesInfo.jsp");
            }
            else{
               out.println("wrong");
            }
        
}
}
