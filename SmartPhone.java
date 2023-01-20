public class SmartPhone extends SmartDevice {

    String fabricante, marca, sistemaOperativo;
    double precio;

    public SmartPhone(){
    }

    public SmartPhone(String fabricante,String marca, String sistemaOperativo, double precio){
        this.fabricante = fabricante;
        this.marca = marca;
        this.sistemaOperativo = sistemaOperativo;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "fabricante='" + fabricante + '\'' +
                ", marca='" + marca + '\'' +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", precio=" + precio +
                '}';
    }
}
