<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
<h1 >${msg}</h1>

<  form:form action="register" modelAttribute="bookDto">

Book Name : <form:input path="title"/><br><br>
Book auther :<form:input path="auther"/><br><br>
Book ISBN: <form:input path="ISBN"/><br><br>
Book publicationDate: <form:input path="publicationDate"/><br><br>
Book genre: <form:input path="genre"/><br><br>
<input type="submit" value="Register">

</form:form>

<a href="viewBooks">ViewAllBooks </a>




</body>
</html>