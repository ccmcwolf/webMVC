<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>Untitled Document</title>
</head>
<body>
	<form action="AddItemServlet" method="post">
		<table width="200" border="0">
			<tr>
				<th align="left" scope="row">Code</th>
				<td><input type="text" id="code"></td>
			</tr>
			<tr>
				<th align="left" scope="row">Description</th>
				<td><input type="text" id="desc"></td>
			</tr>
			<tr>
				<th align="left" scope="row">Unit price</th>
				<td><input type="text" id="unitp"></td>
			</tr>
			<tr>
				<th align="left" scope="row">QTY</th>
				<td><input type="text" id="qty"></td>
			</tr>
			<tr>
				<th colspan="2" align="center" scope="row"><input align="left"
					type="submit" value="Add Item" /></th>
			</tr>
		</table>
	</form>
</body>
</html>