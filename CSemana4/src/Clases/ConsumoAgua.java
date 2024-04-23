package Clases;

/**
 * author Gabriel
 */
public class ConsumoAgua {
    private double consumo; 

    // Constructor vacío
    public ConsumoAgua() {
    }

    // Constructor con parámetro
    public ConsumoAgua(double consumo) {
        this.consumo = consumo;
    }
    
    // Métodos getter y setter para el consumo
    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }
    
    // Método para calcular el monto del consumo de agua
    public double hallarConsumo(){
        double monto=0;
        if(consumo<100){
            monto= 0.15* consumo;
        }else if(consumo>=100 && consumo<=499){
            monto = 0.20 * consumo;
        }else if(consumo>=500 && consumo<=1000){
            monto = 0.35 * consumo;
        }else if(consumo>1000){
            monto = 0.80 * consumo;
        }
        return monto;
    }
    
    // Método para calcular el impuesto asociado al consumo
    public double hallarImpuesto(){
        double impuesto = 0;
        if(hallarConsumo()>600){
            impuesto = 2.5/100*hallarConsumo();
        }
        return impuesto;
    }
    
    // Método para calcular el monto total (consumo + impuesto)
    public double hallarMontoTotal(){
        double total=0;
        total=hallarConsumo() + hallarImpuesto();
        return total;
    }
}
