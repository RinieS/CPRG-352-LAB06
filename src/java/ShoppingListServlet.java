/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author 840979
 */
public class ShoppingListServlet extends HttpServlet {


  

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
       
        String act = request.getParameter("logout");
        if (act != null){
            session.invalidate();
            getServletContext().getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
        }
        String username = (String)session.getAttribute("username");
        if (username == null || username.equals("") ){
           getServletContext().getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response); 
          
        }
        else {
            getServletContext().getRequestDispatcher("/WEB-INF/shoppingList.jsp").forward(request, response); 
        }
        
    
        
        
        
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        
        String username = request.getParameter("username");
        ArrayList<String> shopList = new ArrayList<String>();
        
        if (username == null || username.equals("")){
         getServletContext().getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);   
         return;
        }
        else {
            session.setAttribute("sessionUser", username);
            session.setAttribute("sessionItems", shopList);
            getServletContext().getRequestDispatcher("/WEB-INF/shoppingList.jsp").forward(request, response);
        }
         //getServletContext().getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
         String action = request.getParameter("action");
      if (action != null && action.equals("add")){
          String itemEntered = request.getParameter("itemEntered");
          
          shopList.add(itemEntered);
          
          session.setAttribute("sessionItems", shopList);
          shopList = (ArrayList<String>)session.getAttribute("sessionItems");
          getServletContext().getRequestDispatcher("/WEB-INF/shoppingList.jsp").forward(request, response);
          
      }
    }

   
}
