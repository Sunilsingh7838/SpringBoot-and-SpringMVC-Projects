<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Data</title>
</head>
<body>

   <h2>Book Data</h2>
 <%--  Book Id : ${book.bookId} </br>
   
   Book Name : ${book.bookName} </br>
   
   Book Price : ${book.bookPrice}
    --%>
         <h1> This is Table</h1>
         
      <table border="1">
        <tr>
            <th>Book ID</th>
            <th>Book Name</th>
            <th>Book Price</th>
        </tr>
        
         <tr>
            <td>${book.bookId}</td>
            <td>${book.bookName}</td>
            <td>${book.bookPrice}</td>
        </tr>
        
         <tr>
            <td>${book.bookId}</td>
            <td>${book.bookName}</td>
            <td>${book.bookPrice}</td>
        </tr>
        
       </table>
</body>
</html>