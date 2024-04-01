<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored = "false"%>
    
  <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
    
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
    body {
      color: red;
      background-color: green;
      text-align: center;
    }
  </style>

<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script
	src="https://cdn.datatables.net/1.10.21/js/jquery.dataTables.min.js"></script>
<!-- //cdn.datatables.net/1.10.21/css/jquery.dataTables.min.css
--><link href="https://cdn.datatables.net/1.10.21/css/jquery.dataTables.min.css"
	rel="stylesheet" type="text/css">
<script>
$(document).ready(function() {
	$('#stutab').DataTable({
		"pagingType" : "full_numbers"
	});
});
</script>
</head>
<body>
<h3>View Books</h3>

<table id="stutab">

<thead>
<tr>
<th>Book Id</th>
<th>Book Title</th>
<th>Book Author</th>
<th>Book ISBN</th>
<th>Book Publication Date</th>
<th>Book Genre</th>
<th>Edit</th>
<th>Delete</th>
</tr>

</thead>
<tbody>
<c:forEach items="${books}" var="b">
<tr>
<td>${b.bookId}</td>
<td>${b.title}</td>
<td>${b.auther}</td>
<td>${b.ISBN}</td>
<td>${b.publicationDate}</td>
<td>${b.genre}</td>
<td><a href="editBook?id=${b.bookId }">Edit</a>   </td>
<td><a href="deleteBook?id=${b.bookId }">Delete</a>   </td>


</tr>



</c:forEach>



</tbody>


</table>

</body>
</html>