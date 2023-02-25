
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoGMR2223 miVehiculoGMR2223;
        int stockActual;
        
        miVehiculoGMR2223 = new VehiculoGMR2223("Seat",18000,100);
        operativaVehiculosGMR2223(miVehiculoGMR2223, 50); 
        stockActual = miVehiculoGMR2223.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

    private static void operativaVehiculosGMR2223(VehiculoGMR2223 miVehiculoGMR2223, int cantidad) {
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoGMR2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoGMR2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
    }

}
    
