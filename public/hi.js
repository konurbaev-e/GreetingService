var myApp = angular.module('myApp',[]);

myApp.controller('Hello', function($scope, $http) {
    $http.get('hello', {data: {name: name}}).
        success(function(data) {
            $scope.hello = data;
        });

    $scope.update = function() {
        $http.get('hello', {params: {name: $scope.name}}).
            success(function(data) {
                $scope.hello = data;
            });
    }
});
