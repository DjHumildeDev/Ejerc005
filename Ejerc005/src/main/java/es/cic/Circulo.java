package es.cic;

import org.apache.poi.ss.formula.functions.T;

public class Circulo extends Figura {

    private double radio;
    private String color;
  
    private double perimetro;
   
 
    public Circulo(int id,Posicion posicion,double radio, String color) {
        super(id,posicion,color);
        this.radio = radio;
        this.color = color;
        
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

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double radio){
        this.perimetro = 2*Math.PI*radio;
    }

    @Override
    public FiguraEnum getTipo() {
        return FiguraEnum.Circulo;
    }

    @Override
    public void cambiarTamano(T nuevoTamano) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cambiarTamano'");
    }

   

}