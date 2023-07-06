package models;
/**
 *
 * @author Deimer Hernandez
 */
public abstract class Transaccion {
    private String numero;
    public abstract void ingresar();
    public  abstract void retirar();
    public abstract void  pagar();

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
