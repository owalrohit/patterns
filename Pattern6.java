package Patterns;

/*
1
11
111
1111
111
11
1
 */

public class Pattern6 {
    public static void main(String[] args) {
        for (int i=1;i<=7;i++){
            if (i<=4){
                for (int j=1;j<=i;j++)
                    System.out.print(1+" ");
            }
            else{
                for (int j=7;j>=i;j--){
                    System.out.print(1+" ");
                }

            }System.out.println();
        }
    }
}
