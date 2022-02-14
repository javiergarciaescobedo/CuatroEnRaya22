package es.javiergarciaescobedo.cuatroenraya;

public class CuatroEnRaya {

    short tamXTablero;
    short tamYTablero;
    char[][] tablero;
    
    final char JUGADOR1 = '1';
    final char JUGADOR2 = '2';
    final char VACIO = '.';
    
    // Método constructor
    public CuatroEnRaya() {  
        tamXTablero = 7;
        tamYTablero = 6;
        tablero = new char[tamXTablero][tamYTablero];
        for(int x=0; x<tamXTablero; x++) {
            for(int y=0; y<tamYTablero; y++) {
                tablero[x][y] = VACIO;
            }
        }
    }   
    
    public CuatroEnRaya(short tamX, short tamY) {  
        tamXTablero = tamX;
        tamYTablero = tamY;
        tablero = new char[tamXTablero][tamYTablero];
        for(int x=0; x<tamXTablero; x++) {
            for(int y=0; y<tamYTablero; y++) {
                tablero[x][y] = VACIO;
            }
        }
    } 
    
    public void mostrarTableroConsola() {
        for(int y=0; y<tamYTablero; y++) {
            for(int x=0; x<tamXTablero; x++) {
                System.out.print(tablero[x][y]);
            }
            System.out.println();
        }    
        System.out.println();
    }
    
    public boolean colocarFicha(int columna, int fila, int jugador) {
        if(columna >= 0 && columna < tamXTablero) {
            switch(jugador) {
                case 1:
                    tablero[columna][fila] = JUGADOR1;
                    break;
                case 2:
                    tablero[columna][fila] = JUGADOR2;
                    break;
            }
            return true;
        } else {
            return false;
        }
    }
    
    /**
     *
     * @param columna
     * @return Fila en la que se debe colocar la ficha, 
     * ó -1 si no se puede colocar
     */
    public int buscarFila(int columna) {
        int fila = 0;
        while(fila < tamYTablero && tablero[columna][fila] == VACIO) {
            fila++;
        }
        return fila-1;
    }
    
    public boolean comprobar4EnRaya(int columna, int fila, char jugador) {
        int contador = 0;
        int pos = 1;
        while(columna-pos >= 0 && tablero[columna-pos][fila]==jugador) {
            contador++;
            pos++;
        }
        System.out.println("contador: " + contador);
        if(contador >= 3) {
            return true;
        } else {
            return false;
        }
    }
}
