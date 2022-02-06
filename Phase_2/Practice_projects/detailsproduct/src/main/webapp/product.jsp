<%@ page contentType="text/html" pageEncoding="UTF-8"%>
 
<%@ page import="servletsample.business.Product" %>
<%@ page import="servletsample.business.ProductService" %>
<%@ page import="java.text.DecimalFormat" %>
 
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Sample</title>
    </head>
    <body>
        <%
        ProductService service = new ProductService();
        String value = request.getParameter("id");
 
        if (value != null) {
            int id = Integer.parseInt(value);
            Product product = service.getProduct(id);
        %>
 
        <h1>Product Details</h1>
        <div>ID: <%= product.getId()%></div>
        <div>Name: <%= product.getName()%></div>
        <div>Price: $ <%= new DecimalFormat("#0.00").format(product.getPrice()) %></div>
        <div><a href="product.jsp">Go Back</a></div>
 
        <% } else { %>
 
        <h1>Product List</h1>
        <table>
            <tr>
                    <td><b>Name</b></td>
                    <td><b>Options</b></td>
            </tr>
 
            <% for (Product product : service.getProducts()) {%>
 
            <tr>
                <td><%= product.getName()%></td>
                <td><a href="product.jsp?id=<%= product.getId()%>">Details...</a></td>
            </tr>
            <% }
          }%>
 
        </table>
    </body>
</html>