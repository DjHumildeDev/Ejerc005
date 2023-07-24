package es.cic;

import java.util.ArrayList;

public class Lienzo {
    private ArrayList<Figura> figuras;
    private static final int LIENZO_MAX_X=1000000,LIENZO_MAX_Y=1000000;

    public Lienzo() {
        this.figuras = new ArrayList<>();
        
    }

    public void pintar(Figura figura){
        if(!(estaDentro(figura.getPosicion()))){
            throw new LienzoException("Esta fuera la figura",figura);
            
        }if(comprobarIdDuplicado(figura)){
            throw new LienzoException("id de figura duplicado",figura);
        }
        figuras.add(figura);
    }

    

    public void modificarPosFigura(Posicion posNueva,Figura figura){
       if(!estaDentro(figura.getPosicion())){
            throw new LienzoException("FIgura fuera de los limites",figura);
       }

       figura.setPosicion(posNueva);
    }

    public void modificarTamano(){
          
    }

    
    public void eliminarFigura(int figuraId){
        figuras.remove(figuraId);
    }

    public ArrayList<Figura> getFiguras() {
        return figuras;
    }

    public void setFiguras(ArrayList<Figura> figuras) {
        this.figuras = figuras;
    }

    private boolean comprobarIdDuplicado(Figura figura){
        for(int i = 0; i< figuras.size();i++){
            if(figuras.get(i).getId() == figura.getId()){
                return true;
            }
        }
            return false;
    }

    private boolean estaDentro(Posicion posicion){
        if(posicion.getPosX()<LIENZO_MAX_X || posicion.getPosY()<LIENZO_MAX_Y){
            return true;
        }
        return false;
    }
}
