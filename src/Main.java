/**
 *
 * @author camil
 * https://www.youtube.com/watch?v=Surp4lZaYF0
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // não usando adapter:
        ReprodutorVideo rep = new VideoCassete();
        rep.reproduzir("Duro de matar", "NTSC", true);
        
        // usando adapter
        //BluerayPlayer brp = new BluerayPlayer();
        ReprodutorVideo rep2  = new BlueRayAdapter(new BluerayPlayer());        
        rep2.reproduzir("BlueRay", "BR", true);
    }
    
}
