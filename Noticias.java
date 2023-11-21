package padroescomportamentais.observer;

import java.util.Observable;

public class Noticias extends Observable {

    private String data;
    private String titulo;

    public Noticias(String data, String titulo) {
        this.data = data;
        this.titulo = titulo;
    }

    public void lancarNoticia() {
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Noticia{" +
                ", data='" + data + '\'' +
                ", titulo='" + titulo + '\'' +
                '}';
    }
}
