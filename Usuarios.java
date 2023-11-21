package padroescomportamentais.observer;

import java.util.Observable;
import java.util.Observer;

public class Usuarios implements Observer {

    private String nome;
    private String ultimanoticia;

    public Usuarios(String nome) {
        this.nome = nome;
    }

    public String getUltimaNoticia() {
        return this.ultimanoticia;
    }

    public void Cadastrar(Noticias novidade) {
        novidade.addObserver(this);
    }

    public void update(Observable novidade, Object arg1) {
        this.ultimanoticia = this.nome + ", nova noticia, " + novidade.toString();
        // System.out.println(this.ultimanoticia);
    }
}
