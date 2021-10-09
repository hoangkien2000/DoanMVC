<%-- 
    Document   : header
    Created on : Oct 5, 2021, 12:24:26 PM
    Author     : DELL
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<nav class="navbar navbar-expand-sm bg-light navbar-light">
  <ul class="navbar-nav">
    <li class="nav-item active">
        <a class="nav-link" href="<c:url value="/"/>">Trang chu</a>
    </li>
    <li class="nav-item active">
        <a class="nav-link text-danger" href="<c:url value="/login"/>">DANG NHAP</a>
    </li>
  </ul>
</nav>