package ex_07062024;

public class Lab013 {
    public static void main(String[] args) {
        char c='\n';
        char c1='\t';
        char c2='\b';
        char c3='\r';
        System.out.println(c);
//        new line/next line
        System.out.println("onkar"+c+"turankar");
        System.out.println(c1);
        System.out.println("onkar"+c1+"turankar");
//        add tab
        System.out.println(c2);
        System.out.println("onkar"+"Turankar");
        System.out.println("onkar" +c2+ "Turankar");
//        backslash, delete 1 character
        System.out.println(c3);
        System.out.println("onkar"+c3+"turankar");
        System.out.println("onkar"+"turankar"+c3);
//        backslash, delete 1 word
    }
}
