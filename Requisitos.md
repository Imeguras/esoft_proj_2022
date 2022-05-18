# Requisitos para o AutoSell

## Gestão de Veículos

- O utilizador deve ser capaz de armazenar a informação de todos veículos incluindo os da sede mais os de todas as filiais
- A informação guardada sobre cada veiculo tem de conter a matrícula, a marca, modelo, anterior dono, nº de donos prévios, uma breve descrição textual das características do veículo, avaliação monetária e onde em que filial/sede estacionados
- A avaliação monetária é inserida pelo funcionário ~~este utiliza um site VolanteSic como referencia para saber que valor colocar~~

## Gestão de Peças

- O utilizador tem de ser capaz de registar todas as peças em stock, sendo uma peça um componente a ser usado num automóvel, esta pode tanto ser gasta com um automóvel ou ser reutilizada.
- Todas  as  peças  devem  ter  um número de unidades mínimas ou quantidade mínima em stock por filial/sede
- Tem de ser possível a transação de stock de peças especialmente entre sede e a filial, sendo mais frequente a transação de peças, em que a sede é a origem e a filial é o destino.
- Os valores e registos de cada transação tem de ser guardados, estes sendo a peça em questão, a quantidade, o local de origem, o local destinatário e o dia em que a peça chegou ao destinatário.
- Uma transação pode ser resultante de um pedido prévio para a mesma, se assim for, junto à informação da transação deve incluir a data do pedido e o facto de a transação ser oriunda de um pedido(e quem o fez?)

## Gestão de eventos

- (Um gestor?) deve ser capaz de registar eventos, estes por sua vez descrevem um período de tempo em que um grupo de carros, estes previamente escolhidos, irão estar temporariamente estacionados num certo local, este podendo não pertencer ou estar diretamente relacionado com a empresa.
- Cada registo dos eventos, tem de armazenar a data e as horas do começo e do fim, o local do evento->(textual? ou mais detalhado?), o tipo do evento(?), que carros estão associados ao evento e o numero total dos mesmos
- (`<O gestor>`) tem de ter a possibilidade de guardar a informação sobre o proximo local para qual
  cada carro será transportado após o evento terminar

. TODO:

.

.
## Gestao de transacoes:
- A aplicação tem de ser capaz de registar todas as transacoes de compra
  e venda da AutoSell
- Cada transacao tem de guardar o cliente e carro envolvidos na transacao (?) 		-> perguntao ao prof
- Caso seja possivel o cliente negociar o preco da venda/compra, guardar
  o novo valor da compra/venda e tambem guardar o desconto e/ou a diferenca
  para o preco guardado pela gestao de veiculos (valor do volante sic e
  avaliacao do funcionario) (?) -> perguntar ao prof
- Caso a autosell ofereca servicos de pagamento a prestacoes, guardar tambem
  na transacao o tipo de transacao (a pronto, prestacoes, etc..), e se
  a mesma esta concluida ou ainda a decorrer, guardar tambem quanto falta
  pagar e em quanto tempo (?) -> perguntar ao prof
