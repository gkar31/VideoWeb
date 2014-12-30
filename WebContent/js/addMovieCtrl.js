'use strict';
angular.module('videoweb').controller('addMovieCtrl',function addMovieCtrl($scope,$http) {
    
   $scope.film={};
    
   
   $scope.$on("update_child_controller", function(event, film) {
	   alert("Maj FILM :"+$scope.film.title)
	   $scope.film = film;
	   });
   
   $scope.reset=function()
   {
	   $scope.loadFilms();
	   $scope.srcpage="pages/app-movies.html"
	   
   }
    
   
   $scope.save=function()
    {
    	$http({
    	    method: 'POST',
    	    url: '/VideoDB/addMovie.do',
    	    data: $.param({title: $scope.film.title, 
    	    	           summary: $scope.film.summary, 
    	    	           pictureUrl: $scope.film.image,
    	    	           duration: $scope.film.duree,
    	    	           categories: $scope.film.category,
    	    	           productor: $scope.film.director,
    	    	           actors: $scope.film.actors,
    	    	           is3D: $scope.film.is3D}),
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