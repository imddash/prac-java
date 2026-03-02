package prac1;

public class Main {
    public static void main(String[] args) {
        // tricky like i=(1)i++(1->2) + (2+1)++i(3) = 1 + 3 = 4
        int i = 1;
        i = i++ + ++i;
        System.out.println(i);

        System.out.println(1 + 2 + "3" + 4 + 5); //1+2 = 3 , 3 + "3" = "33", "33"+4 = "334", "334"+5 = "3345"
    }
}
