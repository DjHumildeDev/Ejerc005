package es.cic;


public class Cuadrado implements Figura {
    private int id;
    private double diagonal;
    private double posX,posY;
    private String color;


    
   
    public Cuadrado(int id, double diagonal, double posX, double posY, String color) {
        this.id = id;
        this.diagonal = diagonal;
        this.posX = posX;
        this.posY = posY;
        this.color = color;
    }


    @Override
    public Figura aniadir(double parametro, String color, Posicion pos) {
        
        return this;
    }
    
    @Override
    public Figura modificar(double nuevaDiagonal) {
        
        throw new UnsupportedOperationException("Unimplemented method 'modificarFigura'");
    }
    @Override
    public void mover(Posicion pos) {
        
        throw new UnsupportedOperationException("Unimplemented method 'moverFigura'");
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getDiagonal() {
        return diagonal;
    }
    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }
    public double getPosX() {
        return posX;
    }
    public void setPosX(double posX) {
        this.posX = posX;
    }
    public double getPosY() {
        return posY;
    }
    public void setPosY(double posY) {
        this.posY = posY;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    

}
