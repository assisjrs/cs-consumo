Feature: Listar Debitos
    Scenario: Deve ser possivel visualizar os usuarios por mes
    Given A lista contem 1 usuario com o nome "Francisco Assis"
    When eu visualisar a lista
    Then Devo encontrar a lista com 1  pessoa com o nome "Francisco Assis" e o debito de 30 reais

    Scenario: Não deve contemplar o usuário no mes
    Given A lista de um mes passado nao deve conter o usuario "Francisco Assis"
    When eu  visualisar a lista
    Then Nao deve encontrar o usuario "Francisco Assis"

    Scenario: A lista deve conter os valores do mês passados nao quitados
    Given A lista deve conter o usuario com debitos do mes e do mes passado
    When eu  visualisar a lista
    Then Deve encontrar a lista com 1 pessoa com o nome "Francisco Assis" e o debito de 60 reais


