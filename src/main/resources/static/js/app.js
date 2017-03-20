var app = angular.module('consumoCs', ['ngRoute','ngResource']);

app.config(function($routeProvider){

    $routeProvider
        .when('/produtos',{
            templateUrl: '/views/produtos.html',
            controller: 'produtosController'
        })
        .when('/home',{
            templateUrl: '/views/home.html',
            controller: 'homeController'})
        .otherwise( { redirectTo: '/'});
});
