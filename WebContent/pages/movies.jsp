<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="videoweb">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Videoweb - Vos Films preferes</title>
		
		<script src="jslib/angularjs/angular.js"></script>
		<script src="jslib/angularjs/angular-resource.js"></script>
		<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
		<script src="jslib/bootstrapui/bootstrap.js"></script>
		<script src="jslib/bootstrapui/ui-bootstrap-0.12.0.min.js"></script>
		<script src="js/app.js"></script>
		<script src="js/movieCtrl.js"></script>
		<script src="js/tag-directive.js"></script>
		<script src="js/app-menu.js"></script>
		
		
		<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
	</head>
	<body ng-controller="movieCtrl">
	

    <app-menu ng-controller="NavCtrl"></app-menu>

		
		<h1 ng-cloak>Movies List</h1>
		
		
		<table>
		<tr ng-repeat="item in films">
			<td><img ng-src="{{item.pictureUrl}}"/> </td>
			<td>
				<table>
					<tr>
						<td><h2>{{item.title}}</h2></td>
					</tr>
					<tr>
						<td>{{item.summary}}</td>
					</tr>
					<tr>
						<td><b>Un film de :&nbsp;</b>{{item.productor}}</td>
					</tr>
					<tr>
						<td><b>avec :&nbsp;</b>{{item.actors}}</td>
					</tr>
					<tr>
						<td><b>duree :&nbsp;</b><duration-movie duration-string="item.duration"></duration-movie></td>
					</tr>
					<tr>
						<td><tag-list tag-string="item.categories"></tag-list></td>
					</tr>
				</table>
				
				<br>
				
			</td>
		</tr>
		</table>
	</body>
</html>