<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>My JSP 'main.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">

	<script type="text/javascript">
		function queryUser(){
			//提交form
		document.itemsForm.action = "${pageContext.request.contextPath }/items/deleteItems.action";
		document.itemsForm.submit();
		
		document.mainForm.action = "${pageContext.request.contextPath}/"
		}
	
	</script>
  </head>
  
  <body>
	<h1>主界面</h1>
	<form name="mainForm" action=""  method="post">
		查询条件：<table width="100%" border="1">
				<tr>
					<td>
						用户名：<input type="text" name="">
						<input type="button" value="查询" onclick="">
						<input type="button" value="删除" onclick="">
						<input type="button" value="批量删除" onclick="">
					</td>
				</tr>
		</table>
		用户列表：<table>
		
		</table>
	</form>
  </body>
</html>
