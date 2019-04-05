/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Bean.Buses;
import Dao.BusOperation;
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
public class BusUpdate extends HttpServlet {
  @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getParameter("id") != null) {
            PrintWriter out = resp.getWriter();
        String BusNo,BusRoute,BusTime,DriverName,DriverContact;
        BusNo = req.getParameter("BusNo");
        BusRoute = req.getParameter("BusRoute");
        BusTime = req.getParameter("BusTime");
        DriverName = req.getParameter("DriverName");
        DriverContact = req.getParameter("DriverContact");
        Buses st = new Buses(BusNo, BusRoute,BusTime,DriverName,DriverContact);
            long id = Long.parseLong(req.getParameter("id"));
            BusOperation so = new BusOperation();
            long l = so.upDate(id, st);
            if (l > 0) {
               resp.sendRedirect("AdminPanel/BusesInfo.jsp");
            } 
        }
    }
}
