#language:pt

  Funcionalidade: Verificar o consumo de itens disponiveis na copa

    Esquema do Cenario: Verificar se o sistema esta exibindo os nomes dos usuarios
      Dado que esteja na pagina principal
      Quando eu acesso a pagina de listagem de usuario
      Então verifico que o "<nome>" e o <valor> estão presentes

      Exemplos: nome, valor

        |nome  | valor  |
        |João  | 30     |
        |Maria | 70     |


     Cenário: Verificar que se o funcionario não tiver valores no mes corrente, este não será exibido
      Dado que o funcionario não possua debitos
      Quando eu acesso a pagina de listagem de usuario
      Então eu verifico que este funcionario não está sendo exibido.