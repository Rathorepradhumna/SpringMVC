<%@ taglib prefix = "form" uri="http://www.springframework.org/tags/form" %>
<!Doctype html>
<html>
<head>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
		First name : <form:input path="firstName"/>
		<br><br>
		
		Last name : <form:input path="lastName"/>
		
		<br><br>
		Country : 
		<form:select path="country">
			<form:options items="${student.countryOptions }"/>
			
		
		</form:select>
		<br><br>
		Favorite Langauge : 
		Java <form:radiobutton path="favoriteLanguage" value="Java"/>
		C++ <form:radiobutton path="favoriteLanguage" value="C++"/>
		Python <form:radiobutton path="favoriteLanguage" value="Python"/>
		Ruby <form:radiobutton path="favoriteLanguage" value="Ruby"/>
		
		<br>
		
		Operating Systems :
		Linux <form:checkbox path="operatingSystems" value="Linux"/>
		Mac Os <form:checkbox path="operatingSystems" value="Mac Os"/>
		Windows <form:checkbox path="operatingSystems" value="Windows"/>
		
		<input type="submit" value="submit"/>
	</form:form>
</body>
</html>
