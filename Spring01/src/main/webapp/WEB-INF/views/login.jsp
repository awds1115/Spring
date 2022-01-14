<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>login</h1>        <!--  ReuqestMapping("/doLogin")-->
<form method=get action="/edu/doLogin">
 <table align=center>
 <tr><td>아이디</td><td><input type=text id=id name=id ></td></tr>
 <tr><td>비밀번호</td><td><input type=password id=pw name=pw ></td></tr>
 <tr><td colspan=2 align=center><input type=submit id=lg value='로그인'>&nbsp;
 				   <input type=reset value='다시하기'></td></tr>
 <tr><td colspan=2 align=center><input type=button id=cancel value='취소' onclick='document.location="/edu/home"'></td>
 	 <td><a href="/edu/signon">회원가입</a></td></tr>
 </table>
 </form>
<!-- <form method=post action="/edu/doLogin" id=frmLogin> -->
<%-- 아이디 <input type=text id=userid name=userid value="${userid}"><br> --%>
<%-- 비밀번호 <input type=password id=password name=password value="${password}"><br> --%>
<!-- <input type=submit value=로그인>&nbsp;&nbsp;<input type=reset value=비우기><br> -->
<!-- <!-- <img src="images/20220113.PNG/" width='500px'> --> -->
<!-- <!-- <img src="resource/image.png" width='500px'> --> -->
<!-- 	<img src="animal/cat1.jfif" width='500px'> -->
<!-- 	</form> -->
</body>
</html>