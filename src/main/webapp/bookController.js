var myApp = angular.module('bookApp', []);
myApp.controller('bookCtrl', [
		'$scope',
		'$http',
		function($scope, $http) {
			$http.get('http://localhost:8080/bi-server/api/books').success(
					function(data) {
						$scope.Books = data;
					});

			$scope.removeBook = function(book) {
				console.log("deleting ");
				$http({
					method : 'DELETE',
					url : 'http://localhost:8080/bi-server/api/books/'
							+ book.id
				})

			};
			$scope.addBook = function(book) {
				console.log("adding ");
				$http({
					method : 'POST',
					url : 'http://localhost:8080/bi-server/api/books/',
					data:book		
				})

			};
		} ]);
