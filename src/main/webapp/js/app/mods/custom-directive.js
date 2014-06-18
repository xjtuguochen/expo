(function () {
    "user strict";
    angular.module("expo", []).controller("TestController", ["$scope", "$interval", "$log", function ($scope, $interval, $log) {
        $scope.detail = new DataPoint("detail");
        $scope.overview = new DataPoint("overview");
        var i = 0;
        /*$interval(function () {
            $scope.detail = new DataPoint("detail");
            $scope.overview = new DataPoint("overview");
            $log.debug("interval triggered " + ++i);
        }, 300);*/

    }])
        .directive("chart", ["$log", function ($log) {
            return {
                restrict: "E",
                scope: {
                    chartData: "=chartData"
                },
                link: function (scope, element, attribute) {
                    scope.$watch('chartData', function (newPoints) {
                        $log.debug("new data");
                    })
                }
            };
        }]);

    function DataPoint(type) {
        this.type = type;
    }

    DataPoint.prototype.sayType = function () {
        return this.type;
    };

})();