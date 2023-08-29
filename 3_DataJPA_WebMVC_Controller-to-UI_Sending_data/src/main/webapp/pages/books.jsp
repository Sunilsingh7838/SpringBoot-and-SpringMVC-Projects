<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    

<%--  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>--%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book data</title>
</head>
<body>
     <%-- <table>
                <thead>
			        <tr>
			            <th>Book ID<th><th>Book Name<th><th>Book Price<th>
			        </tr>
		        </thead>
	      <tbody>
	            <c:forEach items = "${book}" var = "book">
		                <tr>
		                   <td>${book.bookId}</td>
		                   <td>${book.bookName}</td>
		                   <td>${book.bookPrice}</td>
		                </tr>
	            </c:forEach>
	      </tbody>
      </table>
      --%>
      
      
      <h1> This is Table</h1>
      <table border="1">
        <tr>
            <th>Book ID</th>
            <th>Book Name</th>
            <th>Book Price</th>
        </tr>
        <%-- 
            // Example data (this could come from a database or other source)
            String[][] data = {
                ${book.bookId},
                ${book.bookId},
                ${book.bookId}
            };
            
            for (String[] row : data) {
        --%>
        <tr>
            <td>${books.bookId}</td>
            <td>${books.bookName}</td>
            <td>${books.bookPrice}</td>
        </tr>
        <%--
            }
        --%>
    </table>
</body>
</html>