package es.cic;



public class Linea extends Figura {
    public Linea(){}
    public Linea(int id,Posicion posicion, String color, Posicion puntoFinal){
        super(0, posicion, color);

    }
    @Override
    public FiguraEnum getTipo() {
        return FiguraEnum.Linea;
    }
}
