package es.cic;

public interface Figura {
    public Figura aniadir(double parametro,String color,Posicion pos);// cambiar posx posY por Posicion
    public Figura modificar(double nuevaDiagonal);
    public void mover(Posicion pos);   
    
}
