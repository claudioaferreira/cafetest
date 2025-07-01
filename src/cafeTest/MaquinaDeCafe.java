package cafeTest;

public class MaquinaDeCafe {
	
//TEST nueva funcionalidad
	
    private Cafetera cafetera;
    public Vaso vasosPequeno;
    public Vaso vasosMediano;
    public Vaso vasosGrande;
    private Azuquero Azuquero;

    
    public Cafetera getCafetera() {
        return cafetera;
    }

    public void setCafetera(Cafetera cafetera) {
        this.cafetera = cafetera;
    }

    public Vaso getVasosPequeno() {
        return vasosPequeno;
    }

    public void setVasosPequeno(Vaso vasosPequeno) {
        this.vasosPequeno = vasosPequeno;
    }

    public Vaso getVasosMediano() {
        return vasosMediano;
    }

    public void setVasosMediano(Vaso vasosMediano) {
        this.vasosMediano = vasosMediano;
    }

    public Vaso getVasosGrande() {
        return vasosGrande;
    }

    public void setVasosGrande(Vaso vasosGrande) {
        this.vasosGrande = vasosGrande;
    }

    public Azuquero getAzucarero() {
        return Azuquero;
    }

    public void setAzucarero(Azuquero azucarero) {
        this.Azuquero = azucarero;
    }

 
    public Vaso getTipoDeVaso(String tipoDeVaso) {
        switch (tipoDeVaso.toLowerCase()) {
            case "pequeno":
                return this.vasosPequeno;
            case "mediano":
                return this.vasosMediano;
            case "grande":
                return this.vasosGrande;
            default:
                return null;
        }
    }


    public String getVasoDeCafe(Vaso tipoDeVaso, int cantidadDeVasos, int cantidadDeAzucar) {
        
        if (!tipoDeVaso.hasVasos(cantidadDeVasos)) {
            return "No hay Vasos";
        }
        if (!cafetera.hasCafe(tipoDeVaso.getContenido())) {
            return "No hay Cafe"; 
        }
        if (!Azuquero.hasAzucar(cantidadDeAzucar)) {
            return "No hay Azucar"; 
        }

     
        tipoDeVaso.giveVasos(cantidadDeVasos); 
        cafetera.giveCafe(tipoDeVaso.getContenido()); 
        Azuquero.giveAzucar(cantidadDeAzucar); 

        return "Felicitaciones";
    }
}