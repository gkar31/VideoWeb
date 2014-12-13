'use strict';
angular.module('videoweb',  ['ngResource','ui.bootstrap']);



angular.module('videoweb').controller('NavCtrl', function ($scope, $rootScope,$location) {
    //$scope.page = {current : 'home'}; // Structure car sur dans les scopes fils, il n'est pas possible de //modifier une variable simple du scope pere
    $scope.application = {
        name: 'VideoWeb'
    };

    $scope.go = function (page) {
        //delete $rootScope.bookId;
        //$scope.page.current =  page;
        $location.path('/'+page)
    }
});