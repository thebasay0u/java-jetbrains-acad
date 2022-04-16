package basa.com.company;
import java.io.PrintStream;
import java.util.Scanner;

 class CollatzConjecture {
    Scanner input;
    PrintStream output;
    int userNum;

    CollatzConjecture (){
        input = new Scanner(System.in);
        output = new PrintStream(System.out);
        userNum = 0;

    }
    void getUserInput() {
        do {
            output.printf("Please enter a positive number: ");
            while(!input.hasNextInt()) {
                String userString = input.next();
                  output.printf("\"%s\" is not a valid number.%n", userString);
                  break;
            }
            this.userNum = input.nextInt();



        } while(userNum < 0);

    }
    void calculateCollatz(){
        int firstInSeries = this.userNum;

        output.printf("%d ", userNum);
        while(firstInSeries != 1){
            int nextInSeries = firstInSeries % 2;

            if(nextInSeries == 0) {
                firstInSeries = (firstInSeries / 2);
            } else {
                firstInSeries = (3 * firstInSeries + 1);
            }
            output.printf("%d ", firstInSeries);
        }




    }





    public static void main(String[] args) {
	// write your code here
        CollatzConjecture myCollatz = new CollatzConjecture();
        myCollatz.getUserInput();
        myCollatz.calculateCollatz();









    }
}
