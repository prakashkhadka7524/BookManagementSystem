<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored = "false"  %>
  
 <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
    body {
      color: White;
     
      text-align: center;
      border: 2px;
    }
    form {
	  background-color: red;
}
  </style>
</head>
<body style="">
<h1 >${msg}</h1>

<form:form action="editSave" modelAttribute="cust">
<form:hidden path="bookId"/>
Book Name : <form:input path="title"/><br><br>
Book auther :<form:input path="auther"/><br><br>
Book ISBN: <form:input path="ISBN"/><br><br>
Book publicationDate: <form:input path="publicationDate"/><br><br>
Book genre: <form:input path="genre"/><br><br>
<input type="submit" value="editSave">

</form:form>


</body>
</html>