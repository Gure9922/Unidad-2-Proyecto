package U2_Proyecto;
/**
 * @author Isaias
 */
public class Punto {
     private int x, y;
    /**
     * Generar un punto en las coordenadas (0,0)
    */
    public Punto(){
        this.x = 0;
        this.y = 0;
    }
    /**
     * Generar un punto en las coordenadas (x, y)
     * @param x Coordenadas en x del punto
     * @param y Coordenadas en y del punto
     */
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    /**
     * Asignar valor de la coordenada x
     * @param x Coordenada en x
     */
    public void setX(int x){
        this.x = x;
    }
    
    /**
     * Obtener el valor de la coordenada en x
     * @return Coordenada en x del punto
     */
    public int getX(){
        return this.x;
    }
    
    /**
     * Asignar valor de la coordenada y
     * @param y Coordenada en y
     */
    public void setY(int y){
        this.y = y;
    }
    
    /**
     * Obtener el valor de la coordenada en y
     * @return Coordenada en y del punto
     */
    public int getY(){
        return this.y;
    }
}







