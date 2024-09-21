# Controle Remoto

Este projeto é um exemplo simples de aplicação do padrão de design **Command** em Java. O padrão Command permite encapsular uma solicitação como um objeto, permitindo parametrizar clientes com diferentes solicitações, enfileirar ou registrar pedidos e suportar operações de desfazer.

## Estrutura do Código

O código é composto pelas seguintes classes e interfaces:

1. **Luz** e **Televisao**: Representam os dispositivos que podem ser ligados e desligados.
   - **Luz** possui métodos `ligar()` e `desligar()`.
   - **Televisao** possui métodos `ligar()` e `desligar()`.

2. **Comando**: Interface que define o método `executar()`. Todas as classes de comando devem implementar esta interface.

3. **ComandoLigarLuz**, **ComandoDesligarLuz**, **ComandoLigarTelevisao**, e **ComandoDesligarTelevisao**: Implementações da interface `Comando` para ligar e desligar Luz e Televisão.

4. **ControleRemoto**: Classe que mantém uma coleção de comandos e pode associar comandos a botões. Fornece métodos para definir comandos e pressionar botões para executar os comandos associados.

5. **Main**: Classe principal que demonstra a utilização do padrão Command. Cria instâncias dos dispositivos e comandos, associa comandos a botões do controle remoto e executa comandos.

## Como Utilizar

1. **Crie instâncias dos dispositivos**:
   ```java
   Luz luz = new Luz();
   Televisao televisao = new Televisao();
2. **Crie comandos para os dispositivos**:

  ```java
  Comando comandoLigarLuz = new ComandoLigarLuz(luz);
  Comando comandoDesligarLuz = new ComandoDesligarLuz(luz);
  Comando comandoLigarTelevisao = new ComandoLigarTelevisao(televisao);
  Comando comandoDesligarTelevisao = new ComandoDesligarTelevisao(televisao);
```
3. **Configure o controle remoto com os comandos:**
   ```java
   ControleRemoto controleRemoto = new ControleRemoto();
   controleRemoto.definirComando("Ligar Luz", comandoLigarLuz);
   controleRemoto.definirComando("Desligar Luz", comandoDesligarLuz);
   controleRemoto.definirComando("Ligar Televisao", comandoLigarTelevisao);
   controleRemoto.definirComando("Desligar Televisao", comandoDesligarTelevisao);
4. **Utilize o controle remoto para executar comandos:**
   ```java
   controleRemoto.pressionarBotao("Ligar Luz");
   controleRemoto.pressionarBotao("Ligar Televisao");
   controleRemoto.pressionarBotao("Desligar Luz");
   controleRemoto.pressionarBotao("Desligar Televisao");

## Exemplo de Execução
**Quando o código é executado sairá**
Luz ligada.
Televisão ligada.
Luz desligada.
Televisão desligada.

