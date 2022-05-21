# Requisitos para o AutoSell

## Gestão de Veículos

- **RF.1**: O funcionário deve ser capaz de armazenar a informação de todos veículos incluindo os da sede mais os de todas as filiais
- **RF.2**: A informação guardada sobre cada veiculo tem de conter a matrícula, a marca, modelo, anterior dono, nº de donos prévios, uma breve descrição textual das características do veículo, avaliação monetária, a data em que foi feita a avaliação monetária, quantas reparações feitas pela autosell o veiculo recebeu e as peças associadas as mesmas e uma descrição textual do local atual onde o mesmo está estacionado
- **RF.3**: A informação guardada referente a um veiculo tem de poder ser alterada pelo funcionário

## Gestão de Peças

- **RF.4**: O funcionário tem de ser capaz de registar todas as peças em stock, sendo que uma peça é um componente a ser usado num automóvel, este após cada uso e gasto no automóvel pelo que ferramentas não contam apesar de uma peça poder tanto ser contada às unidades ou noutra medida que represente a quantidade de usos.
- **RF.5**: Todas  as  peças  devem  ter  um número de unidades mínimas ou quantidade mínima em stock por filial/sede
- **RF.6**: Tem de ser possível a transação de stock de peças especialmente entre sede e a filial, sendo mais frequente a transação de peças, em que a sede é a origem e a filial é o destino.
- **RF.7**: Os valores e registos de cada transação tem de ser guardados, estes sendo a peça em questão, a quantidade, o local de origem, o local destinatário e o dia em que a peça chegou ao destinatário.
- **RF.8**: Uma transação pode ser resultante de um pedido prévio para a mesma, se assim for, junto à informação da transação deve incluir a data do pedido e o facto de a transação ser oriunda de um pedido

## Gestão de eventos

- **RF.9**: O funcionário deve ser capaz de registar eventos, estes por sua vez descrevem um período de tempo em que um grupo de carros, estes previamente escolhidos, irão estar temporariamente estacionados num certo local, sendo que o local pode não pertencer ou estar diretamente relacionado com a empresa.
- **RF.10**: Cada registo de um evento, tem de armazenar a data em que ocorreu, as horas do começo e do fim do evento, uma descrição textual do local do evento, o tipo de evento(?), que carros estão associados ao evento e o numero total dos mesmos
- **RF.11**: O funcionário tem de ter a possibilidade de guardar a informação textual sobre o proximo local ao qual cada carro será transportado, após o evento terminar

## Gestão de transações e trocas de carros

- **RF.12**: O funcionário tem de ser capaz de registar as variadas transações de compra, venda e trocas de automóveis entre a AutoSell e os seus clientes
- **RF.13**: No registo de cada transação tem de conter uma referencia que identifique cliente que esteve envolvido na transação, o carro que esteve envolvido na transação, e caso a transação tenha sido uma compra ou venda este deve guardar o valor monetário que foi acatado entre a AutoSell e o respetivo Cliente.
# Gestão de estatísticas

- **RF.14**: Deve ser possível ao funcionário visualizar qual as marcas e modelos de carros mais vendidos num certo período do tempo, tem também de permitir restringir este valor a uma filial escolhida pelo funcionário.
- **RF.15**: O funcionário tem de conseguir ver quais os melhores clientes, sendo estes os que mais lucro fizeram à autosell num periodo de tempo escolhido pelo funcionário
- **RF.16**: As filiais e feiras mais lucrativas e as que conseguiram vender mais carros;
- **RF.17**: Os modelos e marcas que necessitaram de um maior numero de peças e reparações
- **RNF.1**: Os períodos de tempo para um histórico ou estatística no software devem pelo menos agrupar especificamente por mês, e na totalidade
