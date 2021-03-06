package com.chamodshehanka.heshanhardware.servlet;

import com.chamodshehanka.heshanhardware.controller.ItemController;
import com.chamodshehanka.heshanhardware.model.Item;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author chamodshehanka on 5/9/2019
 * @project HeshanHardware
 **/
@WebServlet(name = "GetItemServlet", urlPatterns = "/SearchItem")
public class GetItemServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String itemCode = request.getParameter("itemCode");
        Item item = ItemController.getItemByID(itemCode);

        response.setContentType("text/html");
        request.setAttribute("item", item);
        request.getRequestDispatcher("/manage-item.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
