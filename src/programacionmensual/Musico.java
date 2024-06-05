package programacionmensual;

public class Musico {
    private String nombreCompleto;
    private String alias;
    private String instrumento;
    private boolean activo;
    private int fechasLimite;
    private int fechasActuales;

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public int getFechasLimite() {
        return fechasLimite;
    }

    public void setFechasLimite(int fechasLimite) {
        this.fechasLimite = fechasLimite;
    }

    public int getFechasActuales() {
        return fechasActuales;
    }

    public void setFechasActuales(int fechasActuales) {
        this.fechasActuales = fechasActuales;
    }
    
}
