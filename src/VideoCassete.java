
/**
 *
 * @author camil
 */
public class VideoCassete implements ReprodutorVideo{

    @Override
    public void reproduzir(String nome, String formato, boolean possuiAudio) {
        System.out.println("Video cassete - Filme: " + nome + " formato: " + formato);
        System.out.println(possuiAudio ? " com audio " : "sem áudio");
    }
    
}
