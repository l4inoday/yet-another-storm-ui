/**
 * Created by mzang on 2014-09-28.
 */

'use strict';

/**
 * @ngdoc function
 * @name anotherStormUiApp.controller:OverviewCtrl
 * @description
 * # AboutCtrl
 * Controller of the anotherStormUiApp
 */
angular.module('anotherStormUiApp')
    .controller('OverviewCtrl', function ($scope) {
        $scope.awesomeThings = [
            'HTML5 Boilerplate',
            'AngularJS',
            'Karma'
        ];
    });