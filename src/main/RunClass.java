package main;

import basic.Sales;
import model.CoffeeMachine;
import model.User;
import utility.MessageGenerator;
import utility.ScannerReader;

/**
 *
 * @author cahuc
 */
public class RunClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int option;
        int cupSize;
        int price;
        int money;
        int change;

        CoffeeMachine cm = new CoffeeMachine(350, 400);

        do {
            
            cm.reset();
            money = 0;
            
            option = MessageGenerator.readInt("Bienvenido: "
                    + "\n 1. Comprar café \n 2. Salir");
            
            if (option== 2){
                break;
            }

            cupSize = MessageGenerator.readInt("Seleccione su bebida:"
                    + "\n 1. Vaso 7 oz \n 2. Vaso 9 oz \n 3. Vaso de 12 oz");
            
            switch( cupSize ){
                
                case 1:
                    cm.receiveOunceQuantity( 7 );
                    break;
                case 2:
                    cm.receiveOunceQuantity( 9 );
                    break;
                case 3:
                    cm.receiveOunceQuantity( 12 );
                    break;
                
                default:
                    MessageGenerator.showMessage("Opción incorrecta");
                    break;
            }
            
            price = cm.price();
            MessageGenerator.showMessage("El valor a pagar es: "+price);
                
            if ( cm.verifyCoffeLevel() == false ){
                MessageGenerator.showMessage("Lo sentimos no hay disponibilidad de este producto");
            }else{
                
                do{
                    money = money + MessageGenerator.readInt("Ingrese su dinero. Actual "+money +" falta: "+ (price-money));
                
                }while( money < price);
                
                cm.receiveMoney(money);
                change = cm.sell();
                
                MessageGenerator.showMessage("Su café ha sido preparado, su cambio es: "+change);
                
            }
            

        } while (option != 2);

    }

}
