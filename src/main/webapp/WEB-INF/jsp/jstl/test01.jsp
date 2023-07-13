<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test01</title>
</head>
<body>
	<h1>1. JSTL core variables</h1>
	<c:set var="num1" value="24"/>
	<c:set var="num2" value="24"/>
	<h3>Number 1: ${num1 }</h3>
	<h3>Number 2: ${num2 }</h3>
	
	<h1>2. JSTL core arithmetic</h1>
	<h3>Addition: ${num1 + num2 }</h3>
	<h3>Subtraction: ${num1 - num2}</h3>
	<h3>Multiplication: ${num1 * num2}</h3>
	<h3>Division: ${num1/num2 }</h3>
	
	<h1>3. JSTL core out</h1>
	<c:out value="<title>core out<title>"/>
	
	<h1>4. JSTL core if 1</h1>
	<c:set var="avg" value="${(num1 + num2)/2}"/>
	
	<!--
	<c:set var="head1" value="h1>"/>
	<c:set var="head3" value="h3>"/>
	-->
	
	<c:if test="${avg ge 10}">
		<!--<c:out value="${'<'}${head1 }" escapeXml="false"/>Average: ${avg } <c:out value="${'</'}${head1 }" escapeXml="false"/>-->
		<h1>Average: ${avg }</h1>
	</c:if>
	<c:if test="${avg lt 10}">
		<!--<c:out value="${'<'}${head3 }" escapeXml="false"/>Average: ${avg }<c:out value="${'</'}${head3 }" escapeXml="false"/>-->
		<h3>Average: ${avg }</h3>
	</c:if>

	<c:set var="mult" value="${num1 * num2}"/>
	<c:if test="${mult gt 100}">
		<c:out value="<script> alert('Too big a number')</script>" escapeXml="false" />
	</c:if>
	

</body>
</html>