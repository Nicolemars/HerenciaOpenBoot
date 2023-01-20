public class SmartWatch extends SmartDevice {

    int tamanioCm;
    String fabricante, sistemaOp;
    double precio;

    public SmartWatch(){
    }

    public SmartWatch(String sistemaOp,String fabricante, int tamanioCm, double precio){

        this.tamanioCm = tamanioCm;
        this.sistemaOp = sistemaOp;
        this.precio    = precio;
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "tamanioCm=" + tamanioCm +
                ", fabricante='" + fabricante + '\'' +
                ", sistemaOp='" + sistemaOp + '\'' +
                ", precio=" + precio +
                '}';
    }
}
