<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
table {
	margin-left: auto;
	margin-right: auto;
}

body {
	text-align: center
}

button {
	background-color: black;
	width: 100%;
	color: white;
	padding: 15px;
	margin: 10px 0px;
	border: none;
	cursor: pointer;
	transition: color 0.7s;
	
}
button span{
        width: 0;
        height: 100%;
        position: absolute;
        top: 0;
        left: 0;
        background: white;
        z-index: -1;
        transition: 0.7s;
        }
input[type=text], input[type=password] {
	width: 100%;
	margin: 8px 0;
	padding: 12px 20px;
	display: inline-block;
	border: 2px solid green;
	box-sizing: border-box;
	text-align: center;
}

button:hover {
	opacity: 0.7;
	background-color: #bbbbbb;
	color: black;
}
</style>
</head>
<body>
	<form action="/signup" method="post">
		<table>
			<tr>
				<td>username: <input type="text" placeholder="Username"
					name="user" required>
				</td>
			</tr>
			<tr>
				<td>Password : <input type="password"
					placeholder="Enter password" type="password" name="pass1" required>

				</td>
			</tr>
			<tr>
				<td>Password : <input type="password"
					placeholder="confirm the password" type="password" name="pass2"
					required> <br>
					<button type="submit">signup</button>

				</td>
			</tr>
		</table>
	</form>
</body>
</html>