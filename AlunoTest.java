package padroescomportamentais.observer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {

    @Test
    void deveNotificarUmUsuario() {
        Noticias novidade = new Noticias("2021-21-11", "Ultima noticia do ano");
        Usuarios usuario = new Usuarios("Usuario 1");
        usuario.Cadastrar(novidade);
        novidade.lancarNoticia();
        assertEquals("Usuario 1, nova noticia, Noticia{data=2021-21-11, titulo='Ultima noticia do ano'}", usuario.getUltimaNoticia());
    }

    @Test
    void deveNotificarUsuarioTurmaA() {
        Noticias novidadeA = new Noticias("2021-21-11", "Ultima noticia do ano");
        Noticias novidadeB = new Noticias("2021", "Algoritmos");
        Usuarios usuario1 = new Usuarios("Usuario 1");
        Usuarios usuario2 = new Usuarios("Usuario 2");
        usuario1.Cadastrar(novidadeA);
        usuario2.Cadastrar(novidadeB);
        novidadeA.lancarNoticia();
        assertEquals("Usuario 1, nova noticia, Noticia{data=2021-21-11, titulo='Ultima noticia do ano'}", usuario.getUltimaNoticia());
        assertEquals(null, usuario2.getUltimaNoticia());
    }
}