package cafeTest;

public class Cafetera {
    private int cantidadCafe; // 

    public Cafetera(int cantidadCafe) {
        this.cantidadCafe = cantidadCafe;
    }

    public int getCantidadCafe() {
        return this.cantidadCafe;
    }

    public void setCantidadDeCafe(int cantidad) {
        this.cantidadCafe = cantidad;
    }


    public boolean hasCafe(int cantidad) {
        return this.cantidadCafe >= cantidad;
    }


    public void giveCafe(int cantidad) {
        this.cantidadCafe -= cantidad;
    }
}