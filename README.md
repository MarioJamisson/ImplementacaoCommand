Controle Remoto
Este projeto é um exemplo simples de aplicação do padrão de design Command em Java. O padrão Command permite encapsular uma solicitação como um objeto, permitindo parametrizar clientes com diferentes solicitações, enfileirar ou registrar pedidos e suportar operações de desfazer.

Estrutura do Código
O código é composto pelas seguintes classes e interfaces:

Luz e Televisao: Representam os dispositivos que podem ser ligados e desligados.

Luz possui métodos ligar() e desligar().
Televisao possui métodos ligar() e desligar().
Comando: Interface que define o método executar(). Todas as classes de comando devem implementar esta interface.

ComandoLigarLuz, ComandoDesligarLuz, ComandoLigarTelevisao, e ComandoDesligarTelevisao: Implementações da interface Comando para ligar e desligar Luz e Televisão.

ControleRemoto: Classe que mantém uma coleção de comandos e pode associar comandos a botões. Fornece métodos para definir comandos e pressionar botões para executar os comandos associados.

Main: Classe principal que demonstra a utilização do padrão Command. Cria instâncias dos dispositivos e comandos, associa comandos a botões do controle remoto e executa comandos.
