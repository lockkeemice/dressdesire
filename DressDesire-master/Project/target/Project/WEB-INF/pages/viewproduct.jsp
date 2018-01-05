<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="header.jsp" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<!-- <div class="container" style="margin-top:50px;">
	<div class="row">
    	<div class="col-xs-12 col-sm-6 col-md-3">
            <div class="col-item"> -->
            
            <div class="container-wrapper">
    <div class="container">
        <div class="page-header">
            <h4>Product Detail</h4>
            
        </div>
        
        <div class="container" ng-app = "cartApp">
            <div class="row">
                <div class="post-images-content">
                <url:url value="/resources/images/${product.id}.png" var="url"></url:url>
<img src="${url }" width="250" height="250"></div>

 <div class="row">
                        <div class="product name:">
                            <h5>PRODUCT NAME:   ${product.name }}</h5>
                           
                        </div>
                       <div class="product price:">
                           
                             <h5 class="price-text-color">PRICE       :  Rs:${product.price}/-</h5>
                        </div>
                        <div class="product manufacturer">
                            <h5>MANUFACTURER:   ${product.manufacturer }</h5>
                           
                        </div>
                        <div class="product description">
                            <h5>DESCRIPTION :	${product.description }</h5>
                           
                        </div>
                    </div>
                    <div class="separator clear-left">
                       <url:url value="/all/product/productlist" var="url"></url:url>
<a href="${url }">Browse All Products</a><br><br>

                       
                        <p ng-controller="cartCtrl">
                        <a href="<c:url value="/home" />" class="btn btn-default">Back</a>
                       
                        <url:url value="cart/add/${product.id}" var="url"></url:url>
                        <a href="${url }" class="btn btn-warning btn-large"
                          
                         ng-click="cart/add/${product.id}"><span
                                class="glyphicon glyphicon-shopping-cart"></span>Order Now</a>
                       
                    </p>
                </div>
            </div>
        </div>

</div>
</div>
                       
                       
                     <!--   </div>
                    <div class="clearfix">
                    </div></div>
                    </div> -->
               


</body>
<%@include file="footer.jsp" %>
</html>