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
        <h5>Hello ${username} <a href="shoppingList?action=logout"> Log Out </a></h5>
        <h2>List</h2>
        <label>Add item:</label>
        <input type="text" name="item" value="">
         <input type="submit" value="Add">
    </body>
</html>
