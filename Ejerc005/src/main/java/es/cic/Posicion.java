package es.cic;

import java.util.Objects;

public class Posicion {
    private double posX,posY;

    public Posicion(double posX, double posY) {
        this.posX = posX;
        this.posY = posY;
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

    @Override
    public int hashCode() {
        return Objects.hash(posX,posY);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Posicion other = (Posicion) obj;
        if (Double.doubleToLongBits(posX) != Double.doubleToLongBits(other.posX))
            return false;
        if (Double.doubleToLongBits(posY) != Double.doubleToLongBits(other.posY))
            return false;
        return true;
    }

    
}
