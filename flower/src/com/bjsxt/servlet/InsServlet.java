package com.bjsxt.servlet;

import com.bjsxt.pojo.Flower;
import com.bjsxt.service.FlowerService;
import com.bjsxt.service.impl.FlowerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author hellosaferide
 */
public class InsServlet extends HttpServlet {

    private FlowerService flowerService=new FlowerServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        String name=request.getParameter("name");
        String price=request.getParameter("price");
        String production=request.getParameter("production");
        Flower flower=new Flower();
        flower.setPrice(Float.parseFloat(price));
        flower.setProduction(production);
        flower.setfName(name);
        int index=flowerService.add(flower);
        if(index>0){
            response.sendRedirect("show");
        }else{
            response.sendRedirect("add.jsp");
        }
    }
}
