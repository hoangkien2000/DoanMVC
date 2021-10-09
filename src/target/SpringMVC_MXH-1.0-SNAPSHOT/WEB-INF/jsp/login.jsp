<%-- 
    Document   : login
    Created on : Oct 5, 2021, 9:33:14 PM
    Author     : DELL
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:url value="/login" var="action" />


<div class="container1">
    <c:if test="${param != null}">
        ${param}
    </c:if>
    <form:form class="form-login" method="post" action="${action}">
        <h1>Đăng nhập</h1>
        <div class="form-text">
            <label>Username</label>
            <input  name="username" type="text" >
        </div>
        <div class="form-text">
            <label>Password</label>
            <input  name="password" type="password">
        </div>
        <button type="submit">Đăng nhập</button>
        <span>Bạn chưa có tài khoản? Đăng ký <a href="">tại đây</a>.</span>
    </form:form>
</div>
<script src="function.js"></script>