'use strict';
angular.module('videoweb').controller('movieCtrl',function movieCtrl($rootScope,$scope,$http) {
    
    $scope.films=[];
    $scope.film={};
    $scope.srcpage="pages/app-movies.html"
    	$http.defaults.cache=false;
    
    
    $scope.$broadcast("update_child_controller", $scope.film);
    
    $scope.navTo=function(url)
    {
    	$scope.srcpage=url;
    }
    
    
    $scope.editFilm=function(pfilm)
    {
    	console.log("Film a editer :"+pfilm.title)
    	$scope.film=pfilm;
    	if(pfilm.is3D=="O")
    		{
    			$scope.film.is3D=true;
    		}
    	else
    		{
    		$scope.film.is3D=false;
    		}
    	
    	$scope.srcpage="pages/app-edit.html";
    }
   
    $scope.loadFilms=function()
    {
    	$http.defaults.cache=false;
    	$http({method: 'GET', url: '/VideoDB/movies.do'})
        .success(function(data, status, headers, config) {
            console.log(data);
            $scope.films=data;
            $scope.srcpage="pages/app-movies.html"
        })
        .error(function(data, status, headers, config) {
         alert("Error status :" +data);
        });
    }
    
    
    
    $scope.update=function()
    {
    	$http({
    	    method: 'POST',
    	    url: '/VideoDB/editMovie.do',
    	    data: $.param({title: $scope.film.title, 
    	    	           summary: $scope.film.summary, 
    	    	           pictureUrl: $scope.film.pictureUrl,
    	    	           duration: $scope.film.duration,
    	    	           categories: $scope.film.categories,
    	    	           productor: $scope.film.director,
    	    	           actors: $scope.film.actors,
    	    	           is3D: $scope.film.is3D,
    	    	           filmId: $scope.film.filmId}),
    	    headers: {'Content-Type': 'application/x-www-form-urlencoded'}
    	}).success(function(data, status, headers, config) {
            alert("Success :" +data.message);
            $scope.loadFilms();
        });
      
    }
    
    
        $http({method: 'GET', url: '/VideoDB/movies.do'})
            .success(function(data, status, headers, config) {
                console.log(data);
                $scope.films=data;
            })
            .error(function(data, status, headers, config) {
             alert("Error status :" +data);
            });
          
      
      
});