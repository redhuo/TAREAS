import com.mpatric.mp3agic.ID3v1;
import com.mpatric.mp3agic.InvalidDataException;
import com.mpatric.mp3agic.Mp3File;
import com.mpatric.mp3agic.UnsupportedTagException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFileChooser;

/**
 * Aqui se va a extraer la informacion de la cancion, como el nombre,
 * artista, genero, duracion, ubicacion en la computadora
 * Al igual permite al usuario manipular esta informacion una vez que fue 
 * guardada en la lista, por medio de guardarInfomacion.java
 * 
 */

public class metodoGuardarObj {
    
     ArrayList<guardarInformacion> listaCanciones = new ArrayList();
     
     String[] listaInformacion;
     
    
     guardarInformacion cancion; 
     int x;
     int y;
     String camino;
    
    public metodoGuardarObj() throws IOException, UnsupportedTagException, InvalidDataException{
        

    }
    
  
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /**
     * Metodo que va a agregar las canciones, cuando el usuario asi lo desee,
     * despues de haber recibido la direccion de la ubicacion y manipulandola
     * para encontrar su respectiva informacion, para luego guardarla en la 
     * lista
     * 
     */
    public void agregarCancion(String camino) throws IOException, UnsupportedTagException, InvalidDataException{
        Mp3File mp3file = new Mp3File(camino);   
        ID3v1 id3v1Tag = mp3file.getId3v1Tag();
        String Autor = id3v1Tag.getArtist()+"";
        String Album = id3v1Tag.getAlbum()+"";
        String Cancion = id3v1Tag.getTitle()+"";
        String Genero = id3v1Tag.getGenreDescription()+"";
        long Duracion = mp3file.getLengthInSeconds();
        String Arte = "C:\\Users\\Jimmy\\Desktop\\New folder (2)\\Tarea1\\images.jpg";
        String path = camino;
        
        cancion = new guardarInformacion( Autor , Album ,Cancion,Genero,Duracion+"",Arte,path+"");
        listaCanciones.add(cancion);   
       
    }
    /**
     * Despues de guardada la informacion el usuario va a poder
     * verificar dicha informacion por medio del este metodo,
     * solo ocupa tener los indices en los que se dentro de la lista
     */  
    public String[] mostrarCancion(int x){     
            String[] listaInformacion ={
            listaCanciones.get(x).getCancion(),
            listaCanciones.get(x).getArtista(),
            listaCanciones.get(x).getAlbum(),
            listaCanciones.get(x).getGenero(),
            listaCanciones.get(x).getTiempo(),
            listaCanciones.get(x).getCamino(),
            listaCanciones.get(x).getArte()};
     
        return  listaInformacion;
    }
    
    /**
     * Por medio de este metodo el usuario, puede buscar sobre una cancion
     * con solo ingresar el nombre del artista
     *
     */
    public  Object[] buscarArtista(String elemento){ 
        int x = 0;
        ArrayList<String> listaBusqueda= new ArrayList();
        for (int i=0; i< listaCanciones.size();i++){
            
            if (listaCanciones.get(x).getArtista().equals(elemento)){
               
               listaBusqueda.add(listaCanciones.get(x).getCancion());
          
            }
            x++;       
        } 
        System.out.println(listaBusqueda);
        return (listaBusqueda.toArray(new String[0])); 
        
    }
    
    /**
     * Por medio de este metodo el usuario, puede buscar sobre una cancion
     * con solo ingresar el nombre del Album
     *
     */
    public  Object[] buscarAlbum(String elemento){
        int x = 0;
        ArrayList<String> listaBusqueda= new ArrayList();
        for (int i=0; i< listaCanciones.size();i++){
            int y = listaCanciones.size()-1;
            if (listaCanciones.get(x).getAlbum().equals(elemento)){
               
               listaBusqueda.add(listaCanciones.get(x).getCancion());
       //no
            }
            x++;    
            
        } 
        System.out.println(listaBusqueda);
        return (listaBusqueda.toArray(new String[0])); 
        
    }
    /**
     * Por medio de este metodo el usuario, puede buscar sobre una cancion
     * con solo ingresar el genero de una cancion
     *
     */
     public  Object[] buscarGenero(String elemento){
        ArrayList<String> listaBusqueda= new ArrayList();
        int x=0;
        for (int i=0; i< listaCanciones.size();i++){

            if (listaCanciones.get(x).getGenero().equals(elemento)){
               
               listaBusqueda.add(listaCanciones.get(x).getCancion());
               
            }
            x++;       
        } 
        System.out.println(listaBusqueda);
        return (listaBusqueda.toArray(new String[0])); 
        
    }
     
    /**
     * Por medio de este metodo el usuario, puede buscar sobre una cancion
     * con solo ingresar el nombre de la cancion
     *
     */
    public Object[] buscarCancion(String elemento){
        int x=0;
        ArrayList<String> listaBusqueda= new ArrayList();
        for (int i=0; i< listaCanciones.size();i++){
       
            if (listaCanciones.get(x).getCancion().equals(elemento)){
               
               listaBusqueda.add(listaCanciones.get(x).getCancion());
          
            }
            x++;       
        } 
        System.out.println(listaBusqueda);
        return (listaBusqueda.toArray(new String[0])); 

    }

    ///////////////////////////////////////////////////////////////////////////
      //Modifica la cancion
    public void modificarCancion(int i,String Artista, String Album, String Genero){
       // for (int i = 0; i < listaCanciones.size();i++){
            //if(cancion.equals(listaCanciones.get(i).getCancion())){
                listaCanciones.get(i).setAlbum(Album);
                listaCanciones.get(i).setArtista(Artista);
                listaCanciones.get(i).setGenero(Genero);
              
                
            
        }
    public void subirImagen(int i,String imagen){
        listaCanciones.get(i).setArt(imagen);
    }

    /**
     * Por medio de este metodo el usuario, puede modificar la
     * informacion de una cancion
     *
     */

    
    /**
     * Por medio de este metodo se puede eliminar una cancion,
     * con solo tener el indice en el que se encuentra dentro de 
     * la lista
     *
     */
    public void eliminarCancion(int x){
                listaCanciones.remove(x);
            }
    public int getSize(){
        return listaCanciones.size();
    }
}
        

       
        

    
    
    

