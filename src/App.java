
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault( Locale.US );
        Scanner sc = new Scanner( System.in );

        Bill bill = new Bill();

        System.out.print( "Gender: " );
        bill.setGender( Character.toLowerCase( sc.next().charAt( 0 ) ) );

        System.out.print( "Quantity of beers: " );
        bill.setBeer( sc.nextInt() );

        System.out.print( "Quantity of soft drinks: " );
        bill.setSoftDrink( sc.nextInt() );

        System.out.print( "Quantity of barbecues: " );
        bill.setBarbecue( sc.nextInt() );

        System.out.println( "\nREPORT:" );
        System.out.printf( "\tConsume %.2f\n", bill.feeding() );
        if ( bill.cover() > 0 ) {
            System.out.printf( "\tCover charge %.2f\n", bill.cover() );
        } else {
            System.out.println( "\tNo cover charge" );
        }
        System.out.printf( "\tTicket %.2f\n", bill.ticket() );

        System.out.printf( "\nTotal: %.2f\n", bill.total() );

        sc.close();
    }
}
