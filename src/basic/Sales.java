package basic;

/**
 *
 * @author cahuc
 */
public class Sales {
    
    /*
    Escribe un algoritmo que determine el valor total con IVA (19%) de una 
    venta, si esta es mayor a 150.000 aplicar un
    descuento del 5% (antes de aplicar el IVA)
    */
    
    /**
    * @param productValue valor del producto
    * @return finalValue valor con IVA y descuento
    */
    public static double sellProduct( int productValue ){
        final float IVA = 1.19f;
        
        if ( productValue > 150000 ){
            productValue = (int)(productValue * 0.95);
        }
        
        double finalValue = productValue * IVA;
        return finalValue;
    }
    
    public static float transaction( String a, int b, float c, boolean d)
    {
        return 0.0f;
    }
    
}
