package warmUp.tuesday25.t1;

public class FormatterApp1 {
  public static void main(String[] args) {
    Formatter0 fmt1 = new Formatter1();
    Formatter0 fmt2 = new Formatter2();
    Formatter0 fmt3 = new Formatter3();

    // task1
    print("Hello", fmt1); // hello
    print("Hello", fmt2); // HELLO
    print("Hello", fmt3); // ***********
                          // *  Hello  *
                          // ***********
  }
  public static void print(String s,Formatter0 f){
    f.print(s);
  }
}
