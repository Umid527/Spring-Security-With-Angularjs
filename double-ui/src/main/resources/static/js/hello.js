angular.module('hello', []).controller('home',

    function($http) {

        var self = this;

        console.log('Loading');

        $http.get('user').then(function(response) {

            console.log('Loading1');

            var data = response.data;
            console.log('Loading2');
            console.log(data);
            if (data.name) {
                console.log('Loading3');
                self.authenticated = true;
                self.user = data.name
                $http.get('/resource/').then(function(response) {
                    alert("dsds")
                    self.greeting = response.data;
                })
            } else {
                console.log('Loading4');
                self.authenticated = false;
            }
        }, function() {
            self.authenticated = false;
        });

    });