'use strict';

angular.module('videoweb').directive('tagList', function(){
    return {
        restrict: 'AE',
        replace: true,
        template: '<div><span ng-repeat="tag in tags"><span  class="label label-primary">{{tag}}</span>  </span></div>',
        scope:{
            tagString:'='
        },
        link: function (scope, elem, attrs) {
            var list = scope.tagString.split(',');

            scope.tags = list.map(function(text){
                return text.trim();
            });
        }

    }
});

angular.module('videoweb').directive('durationMovie', function(){
    return {
        restrict: 'AE',
        replace: true,
        template: '<span class="label label-info">{{dureeFilm}}</span>',
        scope:{
        	durationString:'='
        },
        link: function (scope, elem, attrs) {
            var duree = scope.durationString;
            var hour=duree/60;
            hour=hour-hour%1;
            var minute=duree-(hour*60);
            scope.dureeFilm = duree+" min. ("+hour +"h "+minute +" min. )";
        }

    }
});