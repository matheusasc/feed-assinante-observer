import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestarFeed {
    public static void main(String[] args) {

        try {

            Feed feed = new Feed();

            Assinante assinante1 = new Assinante("Matheus", "matheus@gmail.com");
            Assinante assinante2 = new Assinante("Carlos", "carlos@gmail.com");
            Assinante assinante3 = new Assinante("Thiago", "thiago@gmail.com");
            Assinante assinante4 = new Assinante("Wesley", "wesley@gmail.com");

            feed.addObservador(assinante1);
            feed.addObservador(assinante2);

            SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");

            Noticia noticia = new Noticia("Título da notícia", "Conteudo da noticia...", formatoData.parse("01/11/2024"));
            feed.adicionarNoticia(noticia);

            Noticia outraNoticia = new Noticia("Outra notícia", "Conteudo da outra noticia...", formatoData.parse("02/11/2024"));
            feed.adicionarNoticia(outraNoticia);

        }catch (ParseException e){
            e.printStackTrace();
        }
    }
}
