package models;

/**
 *
 * @author Deimer Hernandez
 */
public class Cuenta extends Transaccion {
    private String entidad;
    private String sucursal;


    @Override
    public void ingresar() {

    }

    @Override
    public void retirar() {

    }

    @Override
    public void pagar() {

    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }
}
