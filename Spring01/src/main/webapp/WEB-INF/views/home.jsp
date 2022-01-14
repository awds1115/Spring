<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<table id=home align=right>
	<tr>
		<td>
		<c:if test="${id==null}" >
		<a href='/edu/login'>로그인</a>&nbsp;<a href='/edu/signon'>회원가입</a>
		</c:if>
		<c:if test="${id!=null}" >
		${id}&nbsp;&nbsp;<a href='/edu/Logout'>로그아웃</a>
		</c:if>
		</td>
	</tr>
</table>
</body>
<script>

</script>
</html>
