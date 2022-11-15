package prj.proy_cs;

public class cls_rutina {
    
    private String NombreRutina;
    private String DeporteAsignado;
    private String Descripcion;
    private String Duracion;
    private boolean Status;
    
    public cls_rutina(){
        this.NombreRutina="";
        this.DeporteAsignado="";
        this.Descripcion="";
        this.Duracion="";
        this.Status=true;
    }

    public String getNombreRutina() {
        return NombreRutina;
    }

    public void setNombreRutina(String NombreRutina) {
        this.NombreRutina = NombreRutina;
    }

    public String getDeporteAsignado() {
        return DeporteAsignado;
    }

    public void setDeporteAsignado(String DeporteAsignado) {
        this.DeporteAsignado = DeporteAsignado;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getDuracion() {
        return Duracion;
    }

    public void setDuracion(String Duracion) {
        this.Duracion = Duracion;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean Status) {
        this.Status = Status;
    }

}
