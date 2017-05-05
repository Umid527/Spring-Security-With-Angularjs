    angular.module('hello', [ 'ngRoute' ])
        .config(function($routeProvider, $httpProvider,$locationProvider,$qProvider) {
            //  Due to aa077e8, the default hash-prefix used for $location
            // hash-bang URLs has changed from the
            // empty string ('') to the bang ('!').
            //
            //  If you actually want to have no hash-prefix,
            // then you can restore the previous behavior by adding
            // a configuration block to your application:
            $locationProvider.hashPrefix('');


            //is added for "Possibly unhandled rejection"
            $qProvider.errorOnUnhandledRejections(false);


            $routeProvider
                .when('/', {
                templateUrl : 'home.html',
                controller : 'home',
                controllerAs: 'controller'})
                    // .when('/login', {
                    // templateUrl : 'login.html',
                    // controller : 'navigation',
                    // controllerAs: 'controller'})
                .otherwise('/');

            $httpProvider.defaults.headers.common['X-Requested-With'] = 'XMLHttpRequest';

        })
        .controller('navigation',function($rootScope, $http, $location, $route) {

                var self = this;

                self.tab = function(route) {
                    return $route.current && route === $route.current.controller;
                };

                // var authenticate = function(credentials, callback) {
                //
                //     var headers = credentials ? {
                //         authorization : "Basic "
                //         + btoa(credentials.username + ":"
                //             + credentials.password)
                //     } : {};
                //
                //     $http.get('user', {
                //         headers : headers
                //     }).then(function(response) {
                //         if (response.data.name) {
                //             $rootScope.authenticated = true;
                //         } else {
                //             $rootScope.authenticated = false;
                //         }
                //         callback && callback($rootScope.authenticated);
                //     }, function() {
                //         $rootScope.authenticated = false;
                //         callback && callback(false);
                //     });
                //
                // };

//function is called when the controller is loaded to see if the user is actually
// already authenticated (e.g. if he had refreshed the browser in the middle of a session).
// We need the authenticate() function to make a remote call because the actual
// authentication is done by the server, and we don’t want to trust the browser
// to keep track of it.

                // authenticate();
                //
                // self.credentials = {};

            $http.get('user').then(function(response) {
                if (response.data.name) {
                    $rootScope.authenticated = true;
                } else {
                    $rootScope.authenticated = false;
                }
            }, function() {
                $rootScope.authenticated = false;
            });

            self.credentials = {};

            self.logout = function() {
                $http.post('logout', {}).finally(function() {
                    $rootScope.authenticated = false;
                    $location.path("/");
                });
            }

            })
        .controller('home', function($http) {
            var self = this;
            $http.get('resource/').then(function(response) {
                console.log(response.data)
                self.greeting = response.data;
            })
        });