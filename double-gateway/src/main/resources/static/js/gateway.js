angular.module('gateway', []).config(function ($httpProvider, $locationProvider, $qProvider) {

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
    $httpProvider.defaults.headers.common['X-Requested-With'] = 'XMLHttpRequest';

}).controller('navigation',

    function ($http) {

        var self = this;

        var authenticate = function(credentials, callback) {

            var headers = credentials ? {
                authorization : "Basic "
                + btoa(credentials.username + ":"
                    + credentials.password)
            } : {};

            $http.get('user', {
                headers : headers
            }).then(function(response) {
                if (response.data.name) {
                    self.authenticated = true;
                } else {
                    self.authenticated = false;
                }
                callback && callback();
            }, function() {
                self.authenticated = false;
                callback && callback();
            });

        }
        authenticate();

        self.credentials = {};
        self.login = function() {
            authenticate(self.credentials, function() {
                if (self.authenticated) {
                    console.log("Login succeeded")
                    self.error = false;
                    self.authenticated = true;
                } else {
                    console.log("Login failed")
                    self.error = true;
                    self.authenticated = false;
                }
            })
        };

    });
