<%@ page contentType="text/html; charset=UTF-8" import="monsters_run.*" %>
<% Monster[] monsters ={new Slime("スラキチ"),new DeathBat("ゴメス"),new Slime("スラッチ")}; %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>run</title>
</head>
<body>
<% for(Monster m:monsters){ %>
<p><%=m.run() %></p>
<%} %>
</body>
</html>