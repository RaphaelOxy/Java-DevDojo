package academy.devDojo.src.javaCore.Csobrecargametodos.teste;

import academy.devDojo.src.javaCore.Csobrecargametodos.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        //anime.init("Akuma Drive 2", "TV", 12);
        anime.init("Akuma Drive", "TV", 12, "Ação");
        //anime.setGenero("Ação");
       /* anime.setNome("Akudama Drive");
        anime.setTipo("TV");
        anime.setEpisodios(12);*/
        anime.imprime();
    }
}
