package Patterns;

/*
1
11
111
1111
11111
 */



public class Pattern1 {
    public static void main(String[] args) {
        for (int i=0;i<=4;i++){
            for (int j=0;j<=i;j++){
                System.out.print("1 ");
            }
            System.out.println();
        }
    }
}
