/**
 * Created by assis on 17/03/17.
 */
app.controller('homeController', function($scope, $http) {


    function getMesExtenso(mes) {
        var arrayMes = new Array(12);
        arrayMes[0] = "Janeiro";
        arrayMes[1] = "Fevereiro";
        arrayMes[2] = "Março";
        arrayMes[3] = "Abril";
        arrayMes[4] = "Maio";
        arrayMes[5] = "Junho";
        arrayMes[6] = "Julho";
        arrayMes[7] = "Agosto";
        arrayMes[8] = "Setembro";
        arrayMes[9] = "Outubro";
        arrayMes[10] = "Novembro";
        arrayMes[11] = "Dezembro";
        return arrayMes[mes];
    }

    $scope.listaConsumo = [];

    $http.get('lista')
        .success(function(lista){
            $scope.listaConsumo = lista;
        })
        .error(function(erro){
            console.log(erro);
        })

    $scope.headingTitle = getMesExtenso(new Date().getMonth());
});

app.controller('produtosController', function($scope) {
    $scope.headingTitle = mes;
});


