package es.cic;

public class CirculoImpl  implements Figura {

    private int id;
    private double radio;
    private String color;
  
    private double perimetro;
    private Posicion pos;
   
   
    public CirculoImpl() {
       
    }

    
 
    public CirculoImpl(double radio, String color,  Posicion pos) {
        this.radio = radio;
        this.color = color;
        
        this.pos = pos;
    }



    @Override
    public Figura aniadirFigura(double radio, String color,Posicion pos) {
        this.radio = radio;
        perimetro = 2*Math.PI*radio;
        this.color = color;
        this.pos = pos;

        return this;
    }

    @Override
    public Figura modificarFigura(double radio) {
        this.radio = radio;
        this.perimetro = 2*Math.PI*radio;

        return this;
    }

    @Override
    public void moverFigura(Posicion pos) {
        this.setPos(pos);
    }
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }    

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double radio){
        this.perimetro = 2*Math.PI*radio;
    }

    public Posicion getPos() {
        return pos;
    }

    public void setPos(Posicion pos) {
        this.pos = pos;
    }

}