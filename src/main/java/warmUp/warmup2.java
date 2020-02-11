package warmUp;
import java.util.Scanner;
public class warmup2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int row,column;
        System.out.print("Enter row: ");
        row=in.nextInt();
        System.out.print("Enter column: ");
        column=in.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(i==0||i==(row-1)){
                    System.out.print("*");
                }if(j==0||j==(column-1)){
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }
}
