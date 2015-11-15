var myApp = angular.module('myApp',[]);

myApp.controller('Bye', function($scope, $http) {
    $http.get('goodbye', {data: {name: name}}).
        success(function(data) {
            $scope.goodbye = data;
        });

    $scope.update = function() {
        $http.get('goodbye', {params: {name: $scope.name}}).
            success(function(data) {
                $scope.goodbye = data;
            });
    }
});
