package src.Basics_02;

/**
 * Author - Piyush
 * Print_a_diagonal_array
 */
public class TestRun9_Print_a_diagonal_array {
    public static void main(String[] args) {
      int[][] arry_2d = new int[3][3];
        arry_2d[0][0]= 1;
        arry_2d[0][1]= 2;
        arry_2d[0][2]= 3;
        arry_2d[1][0]= 4;
        arry_2d[1][1]= 5;
        arry_2d[1][2]= 6;
        arry_2d[2][0]= 7;
        arry_2d[2][1]= 8;
        arry_2d[2][2]= 9;
        //        | 1 2 3 |
        //        | 4 5 6 |
        //        | 7 8 9 |

        for(int i = 0; i < arry_2d.length; i++){
            System.out.println(arry_2d[i][i]); }

        System.out.println("");

        for (int i = 0; i < arry_2d.length; i++) {   // Second method
            for (int j = 0; j < arry_2d[i].length; j++) {
                if (i == j) {
                    System.out.println(arry_2d[i][j]);
                }

            }
        }

        for (int i = 0; i < arry_2d.length; i++) {   // to print complete array
            for (int j = 0; j < arry_2d[i].length; j++) {
                System.out.print("\t" + arry_2d[i][j]);
            }
            System.out.println("");
        }

    }
}
