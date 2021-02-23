import java.util.Random;

public class Homework2 {
    static void homeworkFunction(int maxRow, int maxCol){
        /**
        * This function accepts two integers as input - a number of rows and a
        * number of columns and then displays a multiplication table, which is
        * in accordance with the input guidelines.

        * @version 1.0

        * @author Jan Bieniek
        */
        int j = 0;
        for (int i=0;i<maxRow+1;i++) {
            while (j<maxCol) {
                if (i==0 && j==0)
                    System.out.print("\t");
                else if (i==0)
                    System.out.print("<"+j+">\t");
                else if (j==0)
                    System.out.print("<"+i+">\t");
                else
                    System.out.print(" "+i*j+"\t");

                j++;
            }
            j = 0;
            System.out.println();
        }
    }

    public static void main(String[] args) {

        homeworkFunction(10, 10);
        System.out.println();
        Random rand = new Random();
        int randomRow = rand.nextInt(10)+1;
        int randomCol = rand.nextInt(10)+1;

        homeworkFunction(randomRow, randomCol);

    }
}
