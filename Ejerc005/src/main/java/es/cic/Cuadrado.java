package es.cic;


public class Cuadrado extends Figura {

    private double diagonal;
    private String color;

    public Cuadrado(int id, double diagonal, String color,Posicion posicion) {
        super(id,posicion,color);
        this.diagonal = diagonal;
        this.color = color;
    }
    public double getDiagonal() {
        return diagonal;
    }
    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public FiguraEnum getTipo() {
        return FiguraEnum.Cuadrado;
    }
    @Override
    public void cambiarTamano(T nuevoTamano) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cambiarTamano'");
    }
    

}
