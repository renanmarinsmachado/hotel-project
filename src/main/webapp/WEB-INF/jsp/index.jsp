<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<body>
    <label>${message}</label>
    
    <c:forEach items="${rooms}" var="room">
    	<c:out value="${room.name}"></c:out>
    </c:forEach>
</body>
</html>