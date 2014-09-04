/**
 * Funcionalidad para guardar dentro de una lista,
 * todas las canciones agregadas por el usuario, 
 * de igual forma permite que extraer la informacion de la cancion,
 * sea Nombre de la cancio, Artista, Album, Genero, Duracion
 * cuando el usuario le sea necesario
 * 
 */
public class guardarInformacion {
    public String nombreArtista;
    public String nombreAlbum;
    public String nombreCancion;
    public String Genero;
    public String Duracion;
    public String Arte;
    public String Camino;
   
    //Constructor para guardar en la lista los datos, recibidos
    public guardarInformacion ( String nArtista, String nAlbum, String nCancion,String genero,String tiempo,String arteAlbum,String dCamino){
        setArtista(nArtista);
        setCancion(nCancion);
        setAlbum(nAlbum);
        setTiempo(tiempo);
        setGenero(genero);
        setArt(arteAlbum);
        setCamino(dCamino);
    }
    // Guardan la informacion del nombre del artista 
    public void setArtista(String nArtista){
        this.nombreArtista = nArtista;
     }
    // Guarda la informacion del nombre del album
    public void setAlbum(String nAlbum){
        this.nombreAlbum = nAlbum;
    }
    // Guarda la informacion del nombre de la cancion        
    public void setCancion(String nCancion){
        this.nombreCancion =nCancion;    
    }
    // Regresa o importa el nombre de la cancion     
    public String getCancion(){
        return this.nombreCancion;
    }
    // Regresa o importa el nombre del artista
    public String getArtista(){
        return this.nombreArtista;
    }
    // Regresa o importa el nombre del album
    public String getAlbum(){
        return this.nombreAlbum;
    }
   //Guarda la informacion del tiempo 
    public void setTiempo(String tiempo){
        this.Duracion =tiempo;
    }
    // Regresa o importa la informacion del tiempo
    public String getTiempo(){
        return this.Duracion;
    }
    //Guarda la informacion del genero
    public void setGenero(String genero){
        this.Genero =genero;
    }
    // Regresa o importa el genero de la cancion
    public String getGenero(){
        return this.Genero;
    }
    //Guarda la imagen de la cancion
    public void setArt(String arteAlbum){
        this.Arte = arteAlbum;
    }
    // Regresa o importa la imagen de cancion
    public String getArte(){
        return this.Arte;
    }
    //Guarda la informacion de la direccion de la cancion
    public void setCamino(String dCamino){
        this.Camino = dCamino;
    }
    // Regresa o importa la direccion de la cancion
    public String getCamino(){
        return this.Camino;
    }

}

