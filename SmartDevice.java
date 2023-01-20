public class SmartDevice {

    String modelo;
    long anio;
    int periodoUtil;

    public SmartDevice(){
    }

    public SmartDevice(String modelo, long anio, int periodoUtil){
        this.modelo      = modelo;
        this.anio        = anio;
        this.periodoUtil = periodoUtil;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "modelo='" + modelo + '\'' +
                ", anio=" + anio +
                ", periodoUtil=" + periodoUtil +
                '}';
    }
}
