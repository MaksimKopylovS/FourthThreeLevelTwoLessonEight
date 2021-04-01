angular.module('app').controller('ordersController', function ($scope, $http, $localStorage) {
    const contextPath = 'http://localhost:8189/app/api/v1';

    $scope.showMyOrders = function () {
        $localStorage.orderUser = {userName: $localStorage.currentUser.username}
        $http.post(contextPath + '/order/username', $localStorage.orderUser)
            .then(function (response) {
                $scope.userOrder = response.data
            console.log(response.data)
        });
    };

    $scope.showMyOrders();
});