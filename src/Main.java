import java.util.HashMap;
import java.util.Map;

class Luz {
    public void ligar() {
        System.out.println("Luz ligada.");
    }

    public void desligar() {
        System.out.println("Luz desligada.");
    }
}

class Televisao {
    public void ligar() {
        System.out.println("Televisão ligada.");
    }

    public void desligar() {
        System.out.println("Televisão desligada.");
    }
}

interface Comando {
    void executar();
}

class ComandoLigarLuz implements Comando {
    private Luz luz;

    public ComandoLigarLuz(Luz luz) {
        this.luz = luz;
    }

    @Override
    public void executar() {
        luz.ligar();
    }
}

class ComandoDesligarLuz implements Comando {
    private Luz luz;

    public ComandoDesligarLuz(Luz luz) {
        this.luz = luz;
    }

    @Override
    public void executar() {
        luz.desligar();
    }
}

class ComandoLigarTelevisao implements Comando {
    private Televisao televisao;

    public ComandoLigarTelevisao(Televisao televisao) {
        this.televisao = televisao;
    }

    @Override
    public void executar() {
        televisao.ligar();
    }
}

class ComandoDesligarTelevisao implements Comando {
    private Televisao televisao;

    public ComandoDesligarTelevisao(Televisao televisao) {
        this.televisao = televisao;
    }

    @Override
    public void executar() {
        televisao.desligar();
    }
}

class ControleRemoto {
    private Map<String, Comando> comandos;

    public ControleRemoto() {
        comandos = new HashMap<>();
    }

    public void definirComando(String nome, Comando comando) {
        comandos.put(nome, comando);
    }

    public void pressionarBotao(String nome) {
        Comando comando = comandos.get(nome);
        if (comando != null) {
            comando.executar();
        } else {
            System.out.println("Comando " + nome + " não encontrado.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Luz luz = new Luz();
        Televisao televisao = new Televisao();

        Comando comandoLigarLuz = new ComandoLigarLuz(luz);
        Comando comandoDesligarLuz = new ComandoDesligarLuz(luz);
        Comando comandoLigarTelevisao = new ComandoLigarTelevisao(televisao);
        Comando comandoDesligarTelevisao = new ComandoDesligarTelevisao(televisao);

        ControleRemoto controleRemoto = new ControleRemoto();
        controleRemoto.definirComando("Ligar Luz", comandoLigarLuz);
        controleRemoto.definirComando("Desligar Luz", comandoDesligarLuz);
        controleRemoto.definirComando("Ligar Televisao", comandoLigarTelevisao);
        controleRemoto.definirComando("Desligar Televisao", comandoDesligarTelevisao);

        controleRemoto.pressionarBotao("Ligar Luz");
        controleRemoto.pressionarBotao("Ligar Televisao");
        controleRemoto.pressionarBotao("Desligar Luz");
        controleRemoto.pressionarBotao("Desligar Televisao");
    }
}
