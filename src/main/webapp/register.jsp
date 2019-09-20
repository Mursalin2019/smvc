<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<title>this is register page</title>
<body>
	<form:form id="registerForm" modelAttribute="registerObject"
		action="register-process" method="post">
		<table align="right">
			<tr>
				<td><form:label path="firstname">FirstName: </form:label></td>
				<td><form:input path="firstname" name="firstname" id="firstname" />
				</td>
			</tr>
			<tr>
				<td><form:label path="lastname">LastName:</form:label></td>
				<td><form:input path="lastname" name="lastname"
						id="lastname" /></td>
			</tr>
			<tr>
				<td><form:label path="email">Email:</form:label></td>
				<td><form:input path="email" name="email"
						id="email" /></td>
			</tr>
			<tr>
				<td><form:label path="dateofbirth">DateOfBirth:</form:label></td>
				<td><form:input path="dateofbirth" name="dateOfbirth"
						id="dateofbirth" /></td>
			</tr>
			<tr>
				<td></td>
				<td align="left"><form:button id="register" name="register">Register</form:button>
				</td>
			</tr>
			<tr></tr>
		</table>

		<table align="center">
			<tr>
				<td style="font-style: italic; color: red;">${message}</td>
			</tr>
		</table>
	</form:form>
</body>
</html>
