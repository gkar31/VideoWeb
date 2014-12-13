'use strict';
angular.module('videoweb').controller('movieCtrl',function movieCtrl($scope,$http) {
    
    $scope.films=[];
   
    
    
    
   
     
    
    
        $http({method: 'GET', url: '/VideoDB/movies.do'})
            .success(function(data, status, headers, config) {
                console.log(data);
                $scope.films=data;
            })
            .error(function(data, status, headers, config) {
             alert("Error status :" +data);
            });
          
      
      
});