import java.io.File;
import java.io.PrintStream; 
import static java.lang.System.out;
import java.util.Map;
import javazoom.jlgui.basicplayer.BasicController;
import javazoom.jlgui.basicplayer.BasicPlayer;
import javazoom.jlgui.basicplayer.BasicPlayerEvent;
import javazoom.jlgui.basicplayer.BasicPlayerListener;

/**
 * Funcionalidades para reproducir la musica, por medio de la libreria
 * BasicPlayerListener, va a recibir los datos de la cancion del Interface.java
 * 
 */
public class Reproductormusica implements BasicPlayerListener {
    //private PrintSream out= null;
    BasicPlayer player = new BasicPlayer();
    
    //Constructor de Reproductormusica
    public Reproductormusica() {
        player.addBasicPlayerListener(this);
        //player = new BasicPlayer();
    }
BasicController control=(BasicController)player;
/*
public void coge(String y){

}
    public void Play() throws Exception {
        player.play();
    }

    public void AbrirFichero(String ruta) throws Exception {
        player.open(new File(ruta));
        player.play();
    }

    public void Pausa() throws Exception {
        player.pause();
    }

    public void Continuar() throws Exception {
        player.resume();
    }

    public void Stop() throws Exception {
        player.stop();
    }
    public void reproducemp3 () throws Exception{
       try {
        Reproductormusica   mi_reproductor = new Reproductormusica();
            mi_reproductor.AbrirFichero("/home/estebanmorales/Downloads/ingrid rosario - como lluvia.mp3");
            mi_reproductor.Play();
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
    public static void main(String args[]) throws Exception{
        Reproductormusica y = new Reproductormusica();
        y.AbrirFichero("/home/estebanmorales/Downloads/ingrid rosario - como lluvia.mp3");
        y.Play();
    }
*/
    
    public void opened(Object stream, Map properties) {
        display("opened : " + properties.toString());
    }

    public void progress(int bytesread, long microseconds, byte[] pcmdata, Map properties) {
        display("progress : " + properties.toString());
    }

    public void stateUpdated(BasicPlayerEvent event) {
        display("stateUpdated : " + event.toString());
    }

    public void setController(BasicController controller) {
        display("setController : " + controller);
    }

    public void display(String msg) {
        if (out != null) {
            out.println(msg);
        }
    } 
}