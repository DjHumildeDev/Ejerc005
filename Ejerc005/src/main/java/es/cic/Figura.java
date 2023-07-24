package es.cic;

public abstract class Figura {
    private int id;
    private Posicion posicion;
    private String color;

    public Figura(){

    }
   
   
    public Figura(int id,Posicion posicion,String color){
        this.id = id;
        this.posicion = posicion;
        this.color = color;
    }

    public abstract FiguraEnum getTipo();
   
    public  void setId(int id){
        this.id = id;
    }

    public abstract void cambiarTamano(T nuevoTamano){
        
    }
    public int getId(){
        return id;
    }
   
    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
