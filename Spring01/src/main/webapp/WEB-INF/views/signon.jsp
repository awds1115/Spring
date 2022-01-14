<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="/edu/signon_check">
    <table id=signon align=center >
        <tr>
            <td id=sign align=right>실명</td>
            <td id=sign><input type=text id=realname name=realname size=20></td>
            <td id=sign>성별</td>
            <td id=sign><input type=radio id=male name=gender value=male>남성
                <input type=radio id=female name=gender value=female>여성</td>
        </tr>

        <tr>
            <td id=sign align=right>아이디</td>
            <td id=sign><input type=text id=userid name=userid size=20></td>
        </tr>   
        <tr>
            <td id=sign align=right>비밀번호</td>
            <td id=sign><input type=password id=passcode1 name=passcode1></td>
            <td id=sign align=right>비밀번호 확인</td>
            <td id=sign><input type=password id=passcode2 name=passcode2></td>
        </tr>
        <tr>
            <td id=sign align=right>모바일 번호</td>
            <td id=sign><input type=number id=mobile name=mobile size=20></td>
        </tr>

        <tr>
            <td id=sign align=right>관심분야</td>
            <td id=sign align=left>
                <input type=checkbox name=interest value="정치">정치&nbsp;
                <input type=checkbox name=interest value="경제">경제&nbsp;
                <input type=checkbox name=interest value="사회">사회&nbsp;
                <input type=checkbox name=interest value="문화">문화&nbsp;<br>
                <input type=checkbox name=interest value="역사">역사&nbsp;
                <input type=checkbox name=interest value="연예">연예&nbsp;
                <input type=checkbox name=interest value="스포츠">스포츠&nbsp;
                <input type=checkbox name=interest value="예술">예술&nbsp;<br>
            </td>
        </tr >
        <tr>
            <td id=sign colspan=2>
                <input type=submit value='가입완료'>&nbsp;
                <input type=button id=btncancel value='취소' onclick='document.location="/edu/home/"'>
                <input type=reset Value='다시작성'>
            </td>
        </tr>
    </table>
    </form>
</body>
</html>