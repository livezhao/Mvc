<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>index.jsp</title>
<style>
.dialog{
	width: 200px;
	height: 200px;
	background-color:green;
}
</style>
<script type="text/javascript" src="http://code.jquery.com/jquery-latest.js"></script>
<script type="text/javascript" src="http://james.padolsey.com/demos/jQueryPlugin-flyOffPage/jquery.flyoffpage.full.js"></script>

</head>
<body>
hello index.jsp!!!
<form action="/Mvc/add">
<input id="pythonScript" name="pythonScript" type="text"/>
<input type="submit"/>
</form>
<input id="btnDiv" type="button" value="点击弹框" />
<div id="addDialog" class="dialog"></div>
<script type="text/javascript">
	var $btnDiv = $("#btnDiv");
	$("#btnDiv").click(function(){
		$addDialog = $("#addDialog");
		console.log($addDialog.css("display"));
		//$addDialog.toggleClass("dialog");
		//$addDialog.fadeOut();
		$addDialog.flyOffPage();
	});
	
</script>
</body>
</html>