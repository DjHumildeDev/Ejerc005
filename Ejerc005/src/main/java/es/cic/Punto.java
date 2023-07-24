package es.cic;

public class Punto extends Figura{
    public Punto(){}

    public Punto(int id,Posicion posicion,String color){
        super(id, posicion, color);
    }

    @Override
    public FiguraEnum getTipo() {
        return FiguraEnum.Punto;
    }

    @Override
    public void cambiarTamano(T nuevoTamano) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cambiarTamano'");
    }
}
