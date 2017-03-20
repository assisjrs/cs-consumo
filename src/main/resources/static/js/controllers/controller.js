/**
 * Created by assis on 17/03/17.
 */
app.controller('homeController', function($scope, $http) {

    $scope.listaConsumo = [];



    $http.get('consumo/lista')
        .success(function(lista){
            $scope.listaConsumo = lista;
        })
        .error(function(erro){
            console.log(erro);
        })

    $scope.headingTitle = "Lista de Usuarios";
});

app.controller('produtosController', function($scope) {
    $scope.headingTitle = "Lista de Produtos";
});


