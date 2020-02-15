package warmUp;
import java.util.Random;
public class saturday15 {
    public static void main(String[] args) {
        Random random=new Random();
        int[] array1=new int[5];
        int[] array2=new int[5];
        int[] array3=new int[10];
        for(int i=0;i<5;i++){
            array1[i]=(int)(Math.random()*100);
            array2[i]=(int)(Math.random()*100);
        }int a=0;
        for(int i:array1){
            array3[a]=i;
            a+=2;
        }
        int b=1;
        for(int i:array2){
            array3[b]=i;
            b+=2;
        }
        for(int i=0;i<5;i++){
            System.out.print(array1[i]+"  ");
        }
        System.out.println();
        for(int i=0;i<5;i++){
            System.out.print(array2[i]+"  ");
        }
        System.out.println();
        for(int i:array3){
            System.out.print(i+" ");
        }
    }
}
