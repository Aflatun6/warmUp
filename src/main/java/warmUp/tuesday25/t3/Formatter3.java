package warmUp.tuesday25.t3;


public class Formatter3{
    String s;
    Formatter3(String s){
        this.s=s;
    };


    public String toString() {
        StringBuilder print= new StringBuilder();
            print.append("********\n");
            print.append("* "+s+" *\n");
            print.append("********\n");
        return print.toString();
    }
}
