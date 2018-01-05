<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="url" %>

<%@ include file="header.jsp"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script>
$(document).ready(function() {
var searchCondition = '${searchCondition}';
$('.table').DataTable({
"lengthMenu" : [ [ 3, 5, 7, -1 ], [ 3, 5, 7, "All" ] ],
"oSearch" : {"sSearch" : searchCondition}
})
});
</script>
</head>
<body>


<table class="table table-hover table-condensed border="1">
<thead>
<tr>
<th  style="width:80%">Image</th>
<th  style="width:80%">Product Name</th>
<th  style="width:80%">Price</th>
<th  style="width:80%">Category</th>
<th  style="width:80%">Buy</th>
<th  style="width:80%">Action</th>

</tr>
</thead>

<c:forEach items="${products}" var="p">
<tr>
<url:url value="/resources/images/${p.id}.png" var="url"></url:url>
<td><img src="${url }" height="50" width="50"></td>
<td>${p.name}</td>
<td>${p.price }</td>
<td>${p.category.categoryDetails }</td>

<!-- added for cart -->


                     <!--   <p class="btn-add">
                            <i class="fa fa-shopping-cart"></i><a href="cart/add/${product.product_id}" class="hidden-sm">Add to cart</a></p>
                        <p class="btn-details">
                            <i class="fa fa-list"></i><a href="selectedProduct/${product.product_id}" class="hidden-sm">More details</a></p>
                    </div>  -->
                   
<url:url value="cart/add/${p.id}" var="url4"></url:url>
<td>
<a href="${url4 }"><span class="glyphicon glyphicon-shopping-cart"></span></a></td>


<url:url value="/all/product/viewproduct/${p.id }" var="url13"></url:url>
<td>
<a href="${url13 }"><span class="glyphicon glyphicon-info-sign"></span></a>

 <c:if test="${pageContext.request.userPrincipal.name=='Admin'}">
<security:authorize access="hasRole('ROLE_ADMIN')"/>
 
 <url:url value="/admin/product/editproduct/${p.id }" var="url2"></url:url>
<a href="${url2 }"><span class="glyphicon glyphicon-pencil"></span></a>


<url:url value="/admin/product/deleteproduct/${p.id }" var="url1"></url:url>
<a href="${url1 }"><span class="glyphicon glyphicon-trash"></span></a>
</c:if>
<!-- 
 <url:url value="#" var="url3"></url:url> -->                          <!--  ///all/cart/addToCart/${cart.id }-->
 <!--  <a href="${url }" >Add to cart</a> -->
   
 
</td>
</tr>
</c:forEach>
</table>

</body>
<%@ include file="footer.jsp"%>
</html>