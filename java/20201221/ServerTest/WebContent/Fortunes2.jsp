<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
<!DOCTYPE html>
<%
	String[] fortunes={"凶","小吉","中吉","大吉"};
	int index=new java.util.Random().nextInt(4);
	String str=fortunes[index];
	String deco="f"+index;
%>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/fortunes.css">
<title>今日の運勢</title>
</head>
<body>
	<p class="<%=deco%>">あなたの運勢は<%=str%>です</p>
</body>
</html>