<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function onclick_return(){
		alert("fanhui");
	}
</script>
</head>
<body>
	<h1>success!</h1>
	<h2>message:</h2><h2>${message}</h2>
</body>
<input value="返回" type="button" name="return" onClick="onclick_return()"/>
</html>