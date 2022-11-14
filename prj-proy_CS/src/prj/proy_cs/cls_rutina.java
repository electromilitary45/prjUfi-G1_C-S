package prj.proy_cs;

public class cls_rutina {
    
    private String nombreRutina;
    private String deporteAsignado;
    private String descripcion;
    private String duracion;
    private boolean status;
    
    public cls_rutina(){
        this.nombreRutina="";
        this.deporteAsignado="";
        this.descripcion="";
        this.duracion="";
        this.status=true;
    }

        public String getNombreRutina() {
                return nombreRutina;
        }

        public void setNombreRutina(String nombreRutina) {
                this.nombreRutina = nombreRutina;
        }

        public String getDeporteAsignado() {
                return deporteAsignado;
        }

        public void setDeporteAsignado(String deporteAsignado) {
                this.deporteAsignado = deporteAsignado;
        }

        public String getDescripcion() {
                return descripcion;
        }

        public void setDescripcion(String descripcion) {
                this.descripcion = descripcion;
        }

        public String getDuracion() {
                return duracion;
        }

        public void setDuracion(String duracion) {
                this.duracion = duracion;
        }

        public boolean isStatus() {
                return status;
        }

        public void setStatus(boolean status) {
                this.status = status;
        }
    
    
}
