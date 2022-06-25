1,2,3,8

## 1. Adicionar um veículo - Caminho principal

1. O utilizador seleciona a opção Veículos na janela principal
2. O sistema mostra a "Janela **Veiculos**"
3. O utilizador seleciona na opção Adicionar Veiculo
4. O sistema mostra a "Janela **Adicionar/ Alterar Veiculos**"
5. O utilizador preenche os campos referentes à matrícula, à marca, ao modelo, ao anterior dono, ao nº de donos prévios, às características do veículo, à avaliação monetária e ao local.
6. O sistema regista todos estes campos e ainda regista como data da avaliação monetária a data do dia
7. O sistema mostra uma informação para informar que o adicionar do Veiculo foi sucedida
8. O sistema mostra a "Janela **Veiculos**"

## 1. Adicionar um veículo - Caminhos Secundários

3.1. O utilizador seleciona a opção **Voltar atrás**
3.1.1. O sistema mostra a "Janela **Principal"**

3.2. O utilizador seleciona a opção **Filtrar**
3.2.1 O sistama mostra a "Janela **Veiculos**", com os veiculos devidamente filtrados

5.1. O utilizador seleciona a opção **Cancelar**
5.1.1. O sistema mostra a "Janela **Veiculos**"

5.2. O utilizador no campo do cliente seleciona a opção **Adicionar Cliente**
5.2.1. Invocar caso de uso **"Adicionar um cliente"(16)**
5.2.2. O sistema preenche o campo com o cliente que foi criado
5.2.3. O utilizador preenche os restantes campos referentes à matrícula, à marca, ao modelo, ao anterior dono, ao nº de donos prévios, às características do veículo, à avaliação monetária e ao local

--TODO final check daqui para baixo

## 2. Editar um veículo - Caminho principal

1. O utilizador seleciona a opção Veículos na janela principal
2. O sistema mostra a "Janela **Veiculos**"
3. O utilizador seleciona um veiculo a editar
4. O sistema mostra a "Janela **Adicionar/ Alterar Veiculos**" e preenche os campos referentes à matrícula, à marca, ao modelo, ao anterior dono, ao nº de donos prévios, às características do veículo, à avaliação monetária e ao local com os valores que estão no registo
5. O utilizador altera os campos que pretende atualizar ou alterar
6. O sistema regista as alterações feitas no registo
7. O sistema mostra uma informação para informar que a alteração do Veiculo foi sucedida
8. O sistema mostra a "Janela **Veiculos**"

## 2. Editar um veículo - Caminho Secundários

3.1. O utilizador seleciona a opção **Voltar atrás**
3.1.1. O sistema mostra a "Janela **Principal**"

5.1. O utilizador seleciona a opção **Cancelar**
5.1.1. O sistema mostra a "Janela **Veiculos**"

## 3. Visualizar um veículo - Caminho principal

1. O utilizador seleciona a opção Veículos na janela principal
2. O sistema mostra a "Janela **Veiculos**", em que para cada registo e mostrado visualmente a marca junto ao modelo, a matricula, o local, e
3. O utilizador seleciona que atributo
