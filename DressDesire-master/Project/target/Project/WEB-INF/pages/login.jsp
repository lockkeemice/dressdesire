<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="header.jsp" %>

<html>
<link rel="stylesheet" type="text/css" href="<c:url value="/recources/css/login.css"/> "/>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>LOGIN PAGE</title>
</head>
<body>

<div class="container">
                <div class="row vertical-offset-100">
                    <div class="col-md-4 col-md-offset-4">
                        <div class="panel panel-default">
                            <div class="panel-heading">                                
                                <div class="row-fluid user-row">
                                    <!--  <img src="" class="" alt="ENTER USER NAME AND PASSWORD"/> -->
                                   <center> ENTER USERNAME AND PASSWORD</center>
                                   <c:if test="${not empty msg}">
                <div class="msg">${msg}</div>
            </c:if>
                                </div>
                            </div>

<!--  
<center>
ENTER USERNAME AND PASSWORD</center> -->
 <br>

${logout }
${registrationSuccess }
<div id="form-signin" class="form-signin">

<form class="form-signin" action="<c:url value="j_spring_security_check"></c:url>" method="post" >
<c:if test="${not empty error}">
                    <div class="error" style="color: #ff0000;">${error}</div>
                </c:if>

<center>

Enter username <input class="form-control" type="text" name="j_username">

<br>

                   
Enter password <input class="form-control" type="text" name="j_password">

<br>
<br>
<center>
<input class="btn btn-lg btn-success btn-block"" type="submit" value="submit"></center></center>

</form>
</div></div></div></div></div>
</body>
<br>
<br>
<%@ include file="footer.jsp" %>
</html>