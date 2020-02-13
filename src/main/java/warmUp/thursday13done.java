//package warmUp;
//
//public class thursday13done {
//    public static boolean isCapital(char c){
//        return c >= 'A' && c <= 'Z';
//    }
//    public static boolean isSmall(char c){
//        return c >= 'a' && c <= 'z';
//    }
//    public static boolean isLetter(char c){
//        return isCapital(c) || isSmall(c);
//    }
//    public static boolean isVowel(char c){
//        return "aeiouAOIUE".indexOf(c) != -1; // if c is inside them (one of them)
////        return c=='a' || c== 'e' || c=='o' || c=='u' || c=='i';
//    }
//    public static boolean isConsonant(char c){
//        return !(isVowel(c));
//    }
//    public static String alphabetSmall(){
//        StringBuilder alpha = new StringBuilder();
//        for(char i='a';i<='z';i++){
//            alpha.append(i);
//        }
//        return alpha.toString();
//    }
//    public static String alphabetCapital(){
//        return alphabetSmall().toUpperCase();
//    }
//    public static void main(String[] args) {
//        StringBuilder smallLetter=new StringBuilder();
//        int a=0;
//        for(int i=0;i<30;i++){
//            a=(int)(Math.random()*150);
//            if(isSmall( (char)(a) ) ){
//                smallLetter.append((char)(a));
//            }
//
//        }
//    }
//}
