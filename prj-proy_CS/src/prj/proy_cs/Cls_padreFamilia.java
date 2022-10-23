
package prj.proy_cs;

public class Cls_padreFamilia extends cls_usuarioM2{
    private int tipo;
    private String nomNino;

    public Cls_padreFamilia() {
    }
    
    public Cls_padreFamilia(int tipo, String nomNino, String nombre, String apellido, String cedula, String mail, String telefono, Boolean status) {
        super(nombre, apellido, cedula, mail, telefono, status);
        this.tipo = 2;
        this.nomNino = " ";
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getNomNino() {
        return nomNino;
    }

    public void setNomNino(String nomNino) {
        this.nomNino = nomNino;
    }
    

    
}
