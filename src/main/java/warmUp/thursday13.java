package warmUp;
import java.util.*;
import java.lang.Math;
public class thursday13 {
    public static void main(String[] args) {
        StringBuilder smallLetters=new StringBuilder();//97-122
        for(int i=0;i<30;i++){
            smallLetters.append((char)((int)(Math.random()*25+97+1))+" ");
        }
        System.out.println(smallLetters);


        StringBuilder capitalLetters=new StringBuilder();//65-90
        for(int i=0;i<25;i++){
            capitalLetters.append((char)((int)(Math.random()*25+65+1))+" ");
        }
        System.out.println(capitalLetters);


        StringBuilder mixedLetters=new StringBuilder();//65-90 || 97-122
        for(int i=0;i<35;i++){
            if(Math.random()>=0.5){
                mixedLetters.append((char)((int)(Math.random()*25+65+1))+" ");
            }
            else{
                mixedLetters.append((char)((int)(Math.random()*25+97+1))+" ");
            }
        }
        System.out.println(mixedLetters);

//        int[] smallVowelsArray={97,101,105,111,117};
        int a=0;

        StringBuilder smallConsonant=new StringBuilder();//97-122
        int c=0; //for making it twenty
        StringBuilder smallVowels=new StringBuilder();//97-122
        for(int i=0;i<20;i++){
            a=(int)(Math.random()*25+97+1);
            while((int)(a)!=97&(int)(a)!=101&(int)(a)!=105&(int)(a)!=111&(int)(a)!=117) {
                c++;
                if(c<=20)
                smallConsonant.append((char)(a)+" ");
                a = (int) (Math.random() * 25 + 97 + 1);
            }
            smallVowels.append((char)(a)+" ");
        }
        System.out.println(smallVowels);
        System.out.println(smallConsonant);


        a=0;
        StringBuilder capitalConsonant=new StringBuilder();//65-90
        c=0; //for making it twenty
        StringBuilder capitalVowels=new StringBuilder();//65-90
        for(int i=0;i<20;i++){
            a=(int)(Math.random()*25+65+1);
            while((int)(a)!=65&(int)(a)!=69&(int)(a)!=73&(int)(a)!=79&(int)(a)!=85) {
                c++;
                if(c<=20)
                    capitalConsonant.append((char)(a)+" ");
                a = (int) (Math.random() * 25 + 65 + 1);
            }
            capitalVowels.append((char)(a)+" ");
        }
        System.out.println(capitalVowels);
        System.out.println(capitalConsonant);



    }
}
