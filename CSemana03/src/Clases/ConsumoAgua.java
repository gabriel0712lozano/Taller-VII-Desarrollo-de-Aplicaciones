
package Clases;

/**
 *
 * @author Gabriel
 */
public class ConsumoAgua {
    private double consumo; //ALCANCE - TIPO - NOMBRE //protected
    
    //CONSTRUCTOR VACIO: inicializa el objeto
    public ConsumoAgua() {
    }

    public ConsumoAgua(double consumo) {
        this.consumo = consumo;
    }
    
    //METODOS
    public double getConsumo() { //retorna valor
        return consumo;
    }

    public void setConsumo(double consumo) { //asigna valor
        this.consumo = consumo;
    }
    
    public double hallarConsumo(){
        double monto=0;
        if(consumo<100){
            monto= 0.15* consumo;
        }else if(consumo>=100 & consumo<=499){
            monto = 0.20 * consumo;
        }else if(consumo>=500 & consumo<=1000){
            monto = 0.35 * consumo;
        }else if(consumo>1000){
            monto = 0.80 * consumo;
        }
        return monto;
    }
    
    public double hallarImpuesto(){
        double impuesto = 0;
        if(hallarConsumo()>600){
            impuesto = 2.5/100*hallarConsumo();
        }
        return impuesto;
    }
    
    public double hallarMontoTotal(){
        double total=0;
        total=hallarConsumo() + hallarImpuesto();
        return total;
    }
}
