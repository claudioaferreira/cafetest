package cafeTest;

public class Vaso {
    private int cantidadVasos;
    private int contenido; 

    public Vaso(int cantidadVasos, int contenido) {
        this.cantidadVasos = cantidadVasos;
        this.contenido = contenido;
    }

    public int getCantidadVasos() {
        return this.cantidadVasos;
    }

    public void setCantidadVasos(int cantidad) {
        this.cantidadVasos = cantidad;
    }

  
    public boolean hasVasos(int cantidad) {
        return this.cantidadVasos >= cantidad;
    }


    public void giveVasos(int cantidad) {
        this.cantidadVasos -= cantidad;
    }


    public int getContenido() {
        return contenido;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }
}