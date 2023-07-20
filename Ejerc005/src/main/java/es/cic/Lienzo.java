package es.cic;

import java.util.ArrayList;

public class Lienzo {
    private ArrayList<Circulo> circulosLienzo;
  

    private static final int LIENZO_MAX_X=1000000,LIENZO_MAX_Y=1000000;


    public Lienzo() {
        this.circulosLienzo = new ArrayList<Circulo>();
        
    }

    public void CrearFigura(Figura figura,FiguraEnum tipo){
        
        switch(tipo){
            case Circulo:
                Circulo circulo = (Circulo)figura;
                if(estaDentro(circulo.getPos())){
                    circulo.setId(circulosLienzo.size());
                    circulosLienzo.add((Circulo)circulo.aniadir(circulo.getRadio(),circulo.getColor(),circulo.getPos()));
                }
                break;
            case Cuadrado:
            case Punto:
            case Linea:
                throw new UnsupportedOperationException("no implementado aun");
        }
    }

    public boolean estaDentro(Posicion posicion){
        if(posicion.getPosX()<LIENZO_MAX_X || posicion.getPosY()<LIENZO_MAX_Y){
            return true;
        }else{
            return false;
        }
    }

    public void modificarPosFigura(Posicion posNueva,Figura figura,FiguraEnum tipo){
        switch(tipo){
            case Circulo:
                Circulo circulo = (Circulo)figura;
                circulo.mover(posNueva);
                circulosLienzo.get(circulo.getId()).setPos(posNueva);
                 
                break;
            case Cuadrado:              
            case Punto:                  
            case Linea:
                throw new UnsupportedOperationException("no implementado aun");
               
            }
    }

    public void modificarTamanoFigura(Figura figura,double parametro,FiguraEnum tipo){
            switch(tipo){
                case Circulo:
                    Circulo circulo = (Circulo)figura;
                    Circulo cir=(Circulo)circulo.modificar(parametro);
                    circulosLienzo.get(cir.getId()).setPerimetro(parametro);
                   // figurasLienzo.get(cir.getId()).setPerimetro();
                    break;
                case Cuadrado:             
                case Punto:                  
                case Linea:
                    throw new UnsupportedOperationException("no implementado aun");
            }
    }

    
    public void eliminarFigura(int figuraId){
        circulosLienzo.remove(figuraId);
    }

    public ArrayList<Circulo> getCirculosLienzo() {
        return circulosLienzo;
    }

    public void setCirculosLienzo(ArrayList<Circulo> figurasLienzo) {
        this.circulosLienzo = figurasLienzo;
    }
}
