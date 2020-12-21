<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*" %>
 <%
 	int num=new Random().nextInt(4);
 	String str="";
 	switch(num){
 	case 0:
 		str="凶";
 		break;
 	case 1:
 		str="小吉";
 		break;
 	case 2:
 		str="中吉";
 		break;
 	case 3:
 		str="大吉";
 		break;
 	}
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>あなたの運勢は<%=str %>です</p>

</body>
</html>