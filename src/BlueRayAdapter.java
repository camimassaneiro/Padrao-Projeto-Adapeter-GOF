
/**
 *
 * @author camil
 */
public class BlueRayAdapter implements ReprodutorVideo{
    
    private BluerayPlayer br;

    public BlueRayAdapter(BluerayPlayer br) {
        this.br = br;
    }

    @Override
    public void reproduzir(String nome, String formato, boolean possuiAudio) {
        this.br.executar(nome, formato, 0);
    }
    
}
