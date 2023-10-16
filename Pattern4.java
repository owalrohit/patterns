package Patterns;
/*
11111
1111
111
11
1
 */

public class Pattern4 {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++){
            for (int j=5;j>=i;j--){
                System.out.print(1+" ");
            }
            System.out.println();
        }
    }
}
