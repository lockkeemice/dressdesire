<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="../../favicon.ico">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="url" %>
    <title>DressDesire</title>
<!-- <head> -->
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css"
href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<!-- Angular Js -->
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.1/angular.min.js"></script>

<!-- JQuery -->
<script src="https://code.jquery.com/jquery-2.2.1.min.js"></script>
<script src="https://cdn.datatables.net/1.10.10/js/jquery.dataTables.min.js"></script>

<link href="https://cdn.datatables.net/1.10.10/css/jquery.dataTables.min.css" rel="stylesheet">

<!--</head>  -->
   
<div class="navbar-wrapper">
    <div class="container">

        <nav class="navbar navbar-inverse navbar-static-top">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar"
                            aria-expanded="false" aria-controls="navbar">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                  <!--   <img src=value="resources/images/1.jpg" width="70" height="70" align=left> -->
   <url:url value="/resources/images/logo.png" var="url"></url:url>
<img src="${url }" height="80" width="250" >
                <!--    <a class="navbar-brand" href="<c:url value="/" /> ">DressDesire</a> -->
               </div>
                 <div align="right" class="collapse navbar-collapse" id="bs-example-navbar-collapse-1" style= display:"inline-block">

        
                <div id="navbar" class="navbar-collapse collapse">
                    <ul class="nav navbar-nav">
                        <li><a href="<c:url value="/" /> ">Home</a></li>
                        <li><a href="<c:url value="/all/product/productlist" />"> Browse Products</a></li>
                      <c:if test="${pageContext.request.userPrincipal.name=='Admin'}">
                        <li><a href="<c:url value="/admin/product/productform" />">Add new Products</a></li>
                       
                            </c:if>
                
                      
                        
                        <li class="dropdown">
			<a href="" class="dropdown-toggle" data-toggle="dropdown">
                     Select by Category<b class="caret"></b></a>
			<ul class="dropdown-menu">
			<c:forEach var="c" items="${categories }">
			<li>
<a href="<c:url value="/all/product/productsByCategory?searchCondition=${c.categoryDetails }"></c:url>" >
  ${c.categoryDetails }</a></li>
  
			</c:forEach>
			</ul><li></li></ul>
			
			<ul class="nav navbar-nav navbar pull-right">
			
                        <c:if test="${pageContext.request.userPrincipal.name!=null }">			
 <li><a href="">Welcome ${pageContext.request.userPrincipal.name }</a></li>
 </c:if>
  <url:url value="/all/registrationform" var="url"></url:url>
  
  <c:if test="${pageContext.request.userPrincipal.name==null }">
 <li><a href="${url }">Register</a></li>
 
 <url:url value="/login" var="url"></url:url>
  <li><a href="${url }">Sign in</a></li>
 
 </c:if>
 
 
 
 <c:if  test="${pageContext.request.userPrincipal.name!=null }">
  <li><a href="<c:url value="/j_spring_security_logout"></c:url>">logout</a>
  </li>
  </c:if>
  
     
<url:url value="cart" var="url"></url:url>
  <li><a href="${url }"><span class="glyphicon glyphicon-shopping-cart"></span>${cartSize}</a></li>
</ul>

</div></div></div>

</nav>

                        
                      
                       
               
