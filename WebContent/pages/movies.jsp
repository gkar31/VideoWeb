<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="videoweb">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Videoweb - Vos Films preferes</title>
		
		<script src="jslib/angularjs/angular.js"></script>
		<script src="jslib/angularjs/angular-resource.js"></script>
		<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
		<script src="jslib/bootstrapui/bootstrap.js"></script>
		<script src="jslib/bootstrapui/ui-bootstrap-0.12.0.min.js"></script>
		<script src="js/app.js"></script>
		<script src="js/movieCtrl.js"></script>
		<script src="js/addMovieCtrl.js"></script>
		<script src="js/tag-directive.js"></script>
		<script src="js/app-menu.js"></script>
		
		
		<link rel="stylesheet" type="text/css" href="css/bootstrap.css">
	</head>
	<body ng-controller="movieCtrl">
	

    <app-menu ng-controller="NavCtrl"></app-menu>

		
		
		<div ng-include="srcpage"></div>
		
		
	</body>
</html>