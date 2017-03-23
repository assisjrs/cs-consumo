/**
 * Created by assis on 17/03/17.
 */
app.controller('listaController', function($scope, $http) {


    ano = new Date().getFullYear();
    mes =  new Date().getMonth();

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

    $scope.mesDoAno = arrayMes;


    $scope.acessaServicoLista = function(mes){
        lista(ano, getMesExtenso(mes));
    };

    function getMesExtenso(mes) {
        return arrayMes[mes];
    };

    $scope.listaConsumo = [];

    function lista(ano, mes){}

        $http.get('lista/'+  ano + "/" + mes + "/")
            .success(function(lista){
                $scope.listaConsumo = lista;
            })
            .error(function(erro){
                console.log(erro);
            });


    $scope.headingTitle = getMesExtenso(new Date().getMonth());
});
