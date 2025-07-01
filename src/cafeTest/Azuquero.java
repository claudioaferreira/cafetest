package cafeTest;

public class Azuquero {
	 private int cantidadDeAzucar;

	    public Azuquero(int cantidadDeAzucar) {
	        this.cantidadDeAzucar = cantidadDeAzucar;
	    }

	    public int getCantidadAzucar() {
	        return this.cantidadDeAzucar;
	    }

	    public void setCantidadDeAzucar(int cantidad) {
	        this.cantidadDeAzucar = cantidad;
	    }


	    public boolean hasAzucar(int cantidad) {
	        return this.cantidadDeAzucar >= cantidad;
	    }


	    public void giveAzucar(int cantidad) {
	        this.cantidadDeAzucar -= cantidad;
	    }
}
