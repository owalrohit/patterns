package Patterns;
/*
1
2 3
4 5 6
7 8 9 10
 */

public class Pattern3 {
    public static void main(String[] args) {
        int x=1;  //value of increasing on each iteration
        for (int i=1;i<=4;i++){
            for (int j=1;j<=i;j++){
                System.out.print(x+" ");
                x++;
            }
            System.out.println();
        }
    }
}
