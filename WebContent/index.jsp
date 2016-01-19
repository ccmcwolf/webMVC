<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Untitled Document</title>
</head>
<body>
	<form action="CustomerServlet" method="GET">
		<table width="200" border="0">
			<tr>
				<th align="left" scope="row">ID</th>
				<td><input type="text" id="id"></td>
			</tr>
			<tr>
				<th align="left" scope="row">Name</th>
				<td><input type="text" id="nm"></td>
			</tr>
			<tr>
				<th align="left" scope="row">Address</th>
				<td><input type="text" id="address"></td>
			</tr>
			<tr>
				<th colspan="2" align="center" scope="row"><input align="left"
					type="submit" value="Add Customer" /></th>
			</tr>
		</table>
	</form>
</body>
</html>