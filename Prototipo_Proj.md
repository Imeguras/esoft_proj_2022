# Janela principal (home page) :

    Através da home page, o utilizador deverá poder aceder a 7 janelas diferentes:
		- Janela de Veículos
		- Janela de Peças
		- Janela de Estatísticas
		- Janela de Filiais
		- Janela de Eventos
		- Janela de Transações
		- Janela de Clientes

## Janela de Veículos:

    Na Janela de Veículos, deverá ser possível visualizar todos os veículos e ter um filtro para ajudar a pesquisa dos mesmos.

    Deverá ser possível adicionar e editar um veículo, abrindo a **Janela Adicionar / Editar Veículos** com esse fim.

### Janela Adicionar / Editar Veículos:

    Nesta janela, serão apresentadas os vários atributos e características de um veículo que o utilizador terá de registar.

    Para adicionar o veículo, todos os atributos e características deveram estar preenchidos corretamente.

    A qualquer momento o utilizador poderá cancelar a operação.

## Janela de Peças:

    Na Janela de Peças, deverá ser possível visualizar uma coleção de peças disponíveis e conseguir filtrar as mesmas.

    Deverá ser possível adicionar uma peça nova, para qual a interface deverá abrir a**Janela Adicionar Peça**.

    Para alterar a quantidade de peças numa oficina, registar transações de peças, e fazer pedidos das mesmas deverá ser apresentada a**Janela Transações Peças**.

### Janela Adicionar Peça:

    O utilizador poderá definir um novo tipo de peça, introduzindo todos os atributos e características,
	Se a peça for duplicada, em relação ao Nome, Categoria e Sub-Categoria, deve ser criada uma nova transação em que a origem e registada como de origem fora do sistema.

    A qualquer momento o utilizador poderá cancelar a operação.

### Janela Transações Peças:

    O utilizador poderá definir uma transação de uma peça que ja tenha sido previamente registada no sistema, devendo dizer qual a origem e destino e a quantidade a enviar.

    Se a origem ou destino forem invalidas ou a quantidade for superior a disponível da origem a operação deve ser cancelada.

    A qualquer momento o utilizador poderá cancelar a operação.

## Janela de Estatísticas:

    Na janela de estatísticas deve mostrar as variadas estatísticas definidas nos requisitos para qual deve ter um controle individual para cada, que deja para recalcular-las no período de tempo escolhido, este válido.

## Janela de Filiais:

    Na Janela de Filiais, deverá ser possível ver todas as filiais, o nome e a capacidade e poder filtrar resultados baseados no nome.
	A sede deverá estar presente apesar de estar demarcada como tal.

## Janela de Eventos:

    O utilizador poderá ver as varias exposições/eventos, ou seja um resumo dos atributos de cada, sendo possível filtrar pela data e pelo nome

## Janela de Transações:

    O utilizador deverá ver todas as transações que ocorreram e um resumo dos seus atributos e características, sendo possível filtrar pela data, pelo tipo(compra, venda, troca) e pelo cliente.

    Deverá existir maneira de adicionar uma nova transação, esta deverá abrir a**Janela Nova Transação**

	A qualquer momento o utilizador poderá cancelar a operação.

### Janela Nova Transação:

    O utilizador deverá poder registar uma nova transação registando os atributos e características.

    Caso seja uma compra, a interface deverá ajudar o funcionário embutindo ou abrindo a janela para criar um novo carro.

    Caso seja uma troca, a interface irá não só apresentar o comportamento referido acima para ajudar o cliente mas também deverá ter um controle que mostre a diferença que o cliente terá de pagar

	A qualquer momento o utilizador poderá cancelar a operação.

## Janela Clientes:

	Deverá ser possível ao utilizador ver a coleção de todos os clientes da AutoSell dará a opção de ver o histórico de transações do cliente selecionado, se assim for escolhido deve ser aberta a janela de transações com o filtro aplicado para aquele cliente em especifico

	Deverá ser possível  alterar ou remover clientes na mesma janela, sendo que utilize a **Janela Criar Cliente** para criar um novo cliente

### Janela Criar Cliente

	Deverá ser possível ao utilizador criar um novo usuário desde que todos os atributos estejam corretamente validados como descritos nos requisitos

# No geral:

    Se não existir items a mostrar, quando tal e suposto ser feito, deverá ser mostrada uma mensagem a dizer não existem registos disponíveis até que o utilizador mude de janela.

    Se não existir itens a mostrar após a filtragem, deve ser mostrada uma mensagem pequena a dizer não existem registos disponíveis até que o filtro seja mudado.

    Em todas as janelas que não a home page deverá existir um controle que deixe o utilizador voltar à**Janela principal**.

    Caso uma operação seja cancelada o utilizador irá voltar à Janela principal.
