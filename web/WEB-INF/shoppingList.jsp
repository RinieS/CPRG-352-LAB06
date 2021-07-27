<%-- 
    Document   : shoppingList
    Created on : Jun 26, 2021, 8:29:01 PM
    Author     : 840979
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Shopping List</h1>
        <h5>Hello ${sessionUser} <a href="shoppingList?logout"> Log Out </a></h5>
        <h2>List</h2>
        <label>Add item:</label>
        <form action="ShoppingList" method="post">
        <input type="text" name="itemEntered">
         <input type="submit" value="Add">
         <input type="hidden" name="action" value="add">
        </form>
        <form action="ShoppingList" method="post">
            <c:forEach items= "${sessionItems}" var="item">
                <input type="radio" name="listItem" value="${item}">${item}
            </c:forEach>
                <input type="submit" name="action" value="Delete">
                   
        </form>
    </body>
</html>
