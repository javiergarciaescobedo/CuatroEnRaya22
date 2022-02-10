package es.javiergarciaescobedo.cuatroenraya;

public class CuatroEnRaya {

    short tamXTablero;
    short tamYTablero;
    char[][] tablero;
    
    // Método constructor
    public CuatroEnRaya() {  
        tamXTablero = 7;
        tamYTablero = 6;
        tablero = new char[tamXTablero][tamYTablero];
        for(int x=0; x<tamXTablero; x++) {
            for(int y=0; y<tamYTablero; y++) {
                tablero[x][y] = '.';
            }
        }
    }   
    
    public CuatroEnRaya(short tamX, short tamY) {  
        tamXTablero = tamX;
        tamYTablero = tamY;
        tablero = new char[tamXTablero][tamYTablero];
        for(int x=0; x<tamXTablero; x++) {
            for(int y=0; y<tamYTablero; y++) {
                tablero[x][y] = '.';
            }
        }
    } 
    
    public void mostrarTableroConsola() {
        for(int y=0; y<tamYTablero; y++) {
            for(int x=0; x<tamXTablero; x++) {
                System.out.print(tablero[x][y]);
            }
            System.out.println("");
        }    
    }
}
