import java.util.Scanner;
/**
 * CinemaWithScanner08
 */
public class CinemaWithScanner08 {

    public static void main(String[] args) {
        Scanner sc08 = new Scanner(System.in);

        int row, column;
        String name, next;

        String[][] audience = new String[4][2];

        while(true) {
            System.out.println("-------Option-------");
            System.out.println("1.  Input audience data");
            System.out.println("2. Show audience list");
            System.out.println("3. Exit");
            System.out.print("Choose one the option (1/2/3):");
            int option = sc08.nextInt();
            sc08.nextLine(); 

            if (option == 1){
                System.out.print("Enter a name: ");
                name = sc08.nextLine();
                System.out.print("Enter a row: ");
                row = sc08.nextInt();
                System.out.print("Enter a column: ");
                column = sc08.nextInt();
                sc08.nextLine();

                audience[row-1][column-1] =  name;

                if (row >= 1 && row <= audience.length && column >= 1 && column <= audience[0].length){
                    // check the place available or no
                    if (audience[row-1][column-1] == null){
                        audience[row-1][column-1] = name;
                        System.out.println("Data input Successed!");
                    } else{
                        System.out.println("This Place is booked, choose another place.");
                        System.out.print("Input row again: ");
                        row = sc08.nextInt();
                        System.out.print("Input column again: ");
                        column = sc08.nextInt();
                        sc08.nextLine();

                        //check true or false the number of row and column after insert again
                        if (row >= 1 && row <= audience.length && column >= 1 && column <= audience[0].length){
                            if (audience[row-1][column-1] == null){
                            audience[row-1][column-1] = name;
                            System.out.println("Data input Successed!");
                            } else{
                                System.out.println("Number row or column not available. The data cannot inputed!");
                            }
                        } else{
                            System.out.println("Number row or column not available.");
                        }
                    }
                } else{
                    System.out.println("The number row or column place is not available.");
                }
            } else if(option == 2){
                System.out.println("Audience list:");
                for (int i = 0; i < audience.length; i++){
                    for (int j = 0; j < audience[i].length; j++){
                        if (audience[i][j] != null) {
                            System.out.printf("Row %s, column %d: %s\n", i+1, j+1, audience[i][j]);
                        }else{
                            System.out.printf("Row %d, column %d: *\n", i+1, j+1);
                        }
                    }
                }
                
            } else if (option == 3){
                break;
            } else{
                System.out.println("Menu invalid!");
            }
        }
    } 
}