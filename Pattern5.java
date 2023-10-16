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
public class Pattern5 {
    public static void main(String[] args) {
        for (int i=1;i<=4;i++){
            for (int j=1;j<=i;j++){
                System.out.print(1+" ");
            }
            System.out.println();
        }
        for (int i=1;i<=3;i++){
            for (int j=3;j>=i;j--){
                System.out.print(1+" ");
            }
            System.out.println();
        }
    }
}
