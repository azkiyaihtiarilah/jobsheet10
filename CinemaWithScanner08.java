import java.util.Scanner;
/**
 * CinemaWithScanner08
 */
public class CinemaWithScanner08 {

    public static void main(String[] args) {
        Scanner sc08 = new Scanner(System.in);

        int row, colum;
        String name, next;

        String[][] audience = new String[4][2];

        while(true){
            System.out.print("Enter a name: ");
            name = sc08.nextLine();
            System.out.print("Enter a row: ");
            row = sc08.nextInt();
            System.out.print("Enter a column: ");
            colum = sc08.nextInt();
            sc08.nextLine();

            audience[row - 1][colum -1] = name;
            System.out.println("Are there any other audiences to be added? (y/n): ");
            next = sc08.nextLine();

            if (next.equalsIgnoreCase("n")){
                break;
            } 
        } 
    } 
}