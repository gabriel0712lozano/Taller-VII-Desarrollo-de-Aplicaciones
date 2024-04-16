
package CEjemplo;

/**
 *
 * @author Gabriel
 */
public class Operaciones {
    
    public float suma(float num1, float num2){
        float suma;
        suma=num1+num2;
        return suma;
    }
    
    public float resta(float num1, float num2){
        float resta;
        resta=num1-num2;
        return resta;
    }
    
    public float producto(float num1, float num2){
        float prod;
        prod=num1*num2;
        return prod;
    }
    
    public float division(float num1, float num2){
        float div;
        if(num1==0){
            div=0;
        }else{
            div=num1/num2;
        }
        //div=num1/num2;
        return div;
    }
    public float raizCuadrada(float num1){ //num1
        float rc;
        rc= (float) Math.sqrt(num1);
        return rc;
    }
    public float potencia(float num1, float num2){ 
        float pot;
        pot=(float) Math. pow(num1, num2);
        return pot;
    }
    public float seno(float num1){
        float seno;
        seno=(float) Math.sin(num1);
        return seno;
    }
    public float coseno(float num1){
        float coseno;
        coseno=(float) Math.cos(num1);
        return coseno;
    }
    public float raizCubica(float num1){
        float rcu;
        rcu= (float) Math.cbrt(num1);
        return rcu;
    }
    public float numeroMayor(float num1, float num2){
        float nm;
        if(num1>num2){
            nm=num1;
        }else{
            nm=num2;
        }
        return nm;
    }
    
}
