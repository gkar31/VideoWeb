'use strict';
angular.module('videoweb').controller('movieCtrl',function movieCtrl($scope,$http) {
    
    $scope.films=[];
    
    $scope.srcpage="pages/app-movies.html"
    	$http.defaults.cache=false;
    
    $scope.navTo=function(url)
    {
    	$scope.srcpage=url;
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
    
    
        $http({method: 'GET', url: '/VideoDB/movies.do'})
            .success(function(data, status, headers, config) {
                console.log(data);
                $scope.films=data;
            })
            .error(function(data, status, headers, config) {
             alert("Error status :" +data);
            });
          
      
      
});