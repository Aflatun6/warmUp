package warmUp;
import java.util.Scanner;
import java.util.*;
public class warmup2 {
    static public boolean isShoudBeFilled(int i,int j,int row,int column,double tan){
        return (i==1 || i==(row) || j==1 || j==(column) || (j==(int)(i*tan)) ||(column-j==(int)(i*tan)) );
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        final int row,column;
        System.out.print("Enter row: ");
        row=in.nextInt();
        System.out.print("Enter column: ");
        column=in.nextInt();
        StringBuilder envelope=new StringBuilder(); // IS TO REPLACE SOUT WITH SPEED CLASS!!
        double tan = ((double)column)/row;  //Take a good look at that
        for(int i=1;i<=row;i++){
            for(int j=1;j<=column;j++){
                if(isShoudBeFilled(i,j,row,column,tan)){
//                    System.out.print("*");
                    envelope.append("*");
                }
                else{
//                    System.out.print(" ");
                    envelope.append(" ");
                }

            }
            envelope.append("\n");
        }
        System.out.println(envelope);
    }
}
