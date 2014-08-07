(function () {
    "user strict";
    angular.module("expo", []).controller("TestController", ['$q', "$scope", "$interval", "$log", function ($q, $scope, $interval, $log) {
        function asyncGreet(name) {
            var deferred = $q.defer();

            function okToGreet() {
                return true;
            }

            setTimeout(function () {
                deferred.notify('About to greet ' + name + '.');

                if (okToGreet(name)) {
                    deferred.resolve('Hello, ' + name + '!');
                } else {
                    deferred.reject('Greeting ' + name + ' is not allowed.');
                }
            }, 1000);

            return deferred.promise;
        }

        var promise = asyncGreet('Robin Hood');

        promise.then(function (greeting) {
            $log.debug('Success: ' + greeting);
        }, function (reason) {
            $log.error('Failed: ' + reason);
        }, function (update) {
            $log.debug('Got notification: ' + update);
        });

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

(function () {
    'use strict';
    angular.module("expo").controller("SelectorController", function ($log, $scope) {
        $scope.valueDate = "20140721";

        $scope.$watch("valueDate", function (newValue) {
            $log.debug("Value date new value is " + newValue);
        })

    })
})();