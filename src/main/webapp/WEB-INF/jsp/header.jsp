<!DOCTYPE html>
<html>
<head>
	<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
	<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
	<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	
	<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
	
	<!-- Optional theme -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">
	<link rel="stylesheet" href="https://cdn.datatables.net/1.10.11/css/jquery.dataTables.min.css" crossorigin="anonymous">
	<link rel="stylesheet" href="https://cdn.datatables.net/buttons/1.1.2/css/buttons.dataTables.min.css" crossorigin="anonymous">
	<link rel="stylesheet" href="https://cdn.datatables.net/select/1.1.2/css/select.dataTables.min.css" crossorigin="anonymous">    
	
	<spring:url value="/css/main.css" var="mainCss" />
	
	<link href="${mainCss}" rel="stylesheet" />
	
    <title>${title}</title>
</head>
<body>

<c:set var="baseURL" value="${pageContext.request.contextPath}"/>
<input type="hidden" id="baseURL" value="${baseURL}">

<div id="wrapper" class="content">
	<div id="header">
<!-- 			<div class="panel panel-default"> -->
<!-- 				<div class="panel-body"><h3>Hotel Logatti</h3></div> -->
<!-- 			</div> -->
			
			<div class="panel-heading menu"><%@ include file="/WEB-INF/jsp/menu.jsp"%></div>
	</div>