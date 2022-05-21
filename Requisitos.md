# Requisitos para o AutoSell

A ordem de importância decrescente dada a cada requisito é a seguinte: Critico, Muito Importante, Importante, Relevante, Prescindível

RF: Requisito Funcional
RNF: Requisito Não Funcional

## Clientes

- **RF.1** Um funcionário deve ter registos relevantes ao cliente, estes devem conter o nome, nif, um contacto telefónico, e um mail eletrónico. |Requisito Critico|
- **RNF.1** Os Emails inseridos no AutoSell tem de ser validos segundo os padrões definidos pelo RFC 1035, RFC 2821, RFC 2822, RFC 3696. |Requisito Prescindível|
- **RNF.2** Os Nifs tem de ter 9 algarismos numéricos, sendo esta a única validação feita pelo software para um nif ser aceite como valido pela AutoSell sendo a responsabilidade do funcionário verificar se o mesmo faz sentido ou é valido. |Requisito Relevante|
- **RNF.3** Um contacto telefónico tem 9 dígitos numéricos, sendo esta a única validação feita pelo software. |Requisito Prescindível|

## Gestão de Veículos

- **RF.2**: O funcionário deve ser capaz de armazenar a informação de veículos, sendo que o software designa que veículo, automóvel e viatura representam um automóvel de passageiros ligeiros.|Requisito Critico|
- **RF.3**: A informação guardada sobre cada veiculo tem de conter a matrícula, a marca, modelo, anterior dono, nº de donos prévios, uma breve descrição textual das características do veículo, avaliação monetária, a data em que foi feita a avaliação monetária, quantas reparações feitas pela AutoSell o veiculo recebeu e as peças associadas as mesmas e uma descrição do local atual onde o mesmo está estacionado. |Requisito Muito Importante|
- **RF.4**: A informação guardada referente a um veiculo tem de poder ser alterada pelo funcionário. |Requisito Importante|
- **RF.5**: A sede só irá conter espaço para 4500 veículos, enquanto todas as filiais contêm uma capacidade máxima que nunca deverá exceder 100 automóveis, apesar desta poder variar entre cada filial.

## Gestão de Peças

- **RF.6**: O funcionário tem de ser capaz de registar todas as peças em stock, sendo que uma peça é um componente a ser usado num automóvel, esta após cada uso é gasta no automóvel pelo que ferramentas não contam como peças. Uma peça pode tanto ser contada às unidades ou noutra medida que represente a quantidade restante até ao mesmo não ter mais utilidade. |Requisito Importante|
- **RF.7**: Cada registo de peça deve conter um nome, o local pertencente à AutoSell onde estão guardadas, uma categoria e pode conter uma possível subcategoria.
- **RF.8**: Todas  as  peças  devem  ter  um número de quantidade ou unidades mínimas em stock por filial/sede |Requisito Relevante|
- **RF.9**: Tem de ser possível ao funcionário registar a transação bilateral de peças especialmente entre a sede e a filial. |Requisito Importante|
- **RF.10**: Os valores e registos de cada transação tem de ser guardados, estes sendo a peça em questão, a quantidade, o local de origem, o local destinatário e o dia em que a peça chegou ao destinatário. |Requisito Importante|
- **RF.11**: Uma transação pode ser resultante de um pedido prévio para a mesma, se assim for, junto à informação da transação deve incluir a data do pedido e o facto de a transação ser oriunda de um pedido. |Requisito Relevante|

## Gestão de eventos

- **RF.12**: O funcionário deve ser capaz de registar eventos, estes por sua vez descrevem um período de tempo em que um grupo de automóveis, previamente escolhidos, irão estar estacionados temporariamente num certo local, sendo que o local pode não pertencer ou estar diretamente relacionado com a empresa.|Requisito Importante|
- **RF.13**: Cada registo de um evento tem de armazenar o nome do mesmo, este tipicamente tendo o prefixo de Feira, a data em que ocorreu, as horas do começo e do fim do evento, o local do evento sendo que se não for uma filial ou a sede esta deve ser uma breve descrição textual da mesma, uma descrição textual do tipo de evento, que automóveis pertencentes à AutoSell estão associados ao evento e o numero total dos mesmos |Requisito Importante|
- **RF.14**: O funcionário tem de ter a possibilidade de guardar o proximo local ao qual cada veiculo será transportado, após o evento terminar. |Requisito Prescindível|
- **RNF.4**: As referencias ao local de um veiculo devem manter-se coerentes e atualizados entre os vários registos que o software faça.|Requisito Relevante|

## Gestão de transações e trocas de automóveis

- **RF.15**: O funcionário tem de ser capaz de registar as variadas transações de compra, venda e trocas de automóveis entre a AutoSell e os seus clientes |Requisito Critico|
- **RF.16**: No registo de cada transação tem de conter uma referencia que identifique o cliente que esteve envolvido na transação, os automóveis que estiveram envolvidos na transação, e caso a transação tenha sido uma compra ou venda este deve guardar o valor monetário que foi acatado entre a AutoSell e o respetivo Cliente. |Requisito Muito Importante|
- **RF.17**: Caso uma transação seja uma troca, o valor da diferença monetária entre os automóveis, é compensado monetariamente pelo cliente da AutoSell caso o veiculo do cliente tenha uma apreciação monetária maior que o veiculo da AutoSell não existe compensações por parte da AutoSell |Requisito Muito Importante|
- **RNF.5**: O AutoSell não irá registar a valorização ou desvalorização de um carro ao longo do tempo, uma avaliação e feita por parte do funcionário com auxilio do site VolanteSic, e como referido só irá registar o ganhos e percas capitais, estas que são determinadas ao ocorrer uma transação .
# Gestão de estatísticas

- **RF.18**: Deve ser possível ao funcionário visualizar qual as marcas e modelos de automóveis mais vendidos num certo período do tempo, tem também de permitir restringir este valor a uma filial escolhida pelo funcionário. |Requisito Relevante|
- **RF.19**: O funcionário tem de conseguir ver quais os melhores clientes, estes os que mais lucro fizeram à AutosSell, num período de tempo escolhido pelo funcionário. |Requisito Relevante|
- **RF.20**: As filiais e feiras mais lucrativas e as que conseguiram vender mais automóveis. |Requisito Relevante|
- **RF.21**: Os modelos e marcas que necessitaram de um maior numero de peças e reparações. |Requisito Relevante|
- **RNF.6**: Os períodos de tempo para um histórico ou estatística no software devem pelo menos agrupar especificamente por mês, e na totalidade. |Requisito Relevante|
