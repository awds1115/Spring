<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
	<td>
		<select id=selRoom style="width:260px;" size=10>
		<c:forEach items="${alRml}" var="rml">
		<option>${rml.roomcode }, ${rml.name }, ${rml.typename }, 
				${rml.howmany }, ${rml.howmuch }
		</option>
		</c:forEach>
		</select>
	</td>
	<td>
		<form id=frmRoom action="/exercise/addRoom">
		<table>
		<tr><td align=right>객실명:</td>
			<td><input type=text name=roomname></td>
		</tr>
		<tr><td align=right>타입:</td>
			<td><input type=text name=roomtype></td>
		</tr>
		<tr><td align=right>숙박가능인원:</td>
			<td><input type=number name=howmany></td>
		</tr>
		<tr><td align=right>숙박비:</td>
			<td><input type=number name=howmuch></td>
		</tr>
		<tr><td colspan=2 align=center>
			<input type=submit value='추가'></td>
		</tr>
		</table>
		</form>
	</td>
</tr>
</table>
</body>
</html>