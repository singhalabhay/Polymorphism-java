

public class Overloading {
    static int add(int a,int b){

        return a+b;
    }

    static double add(double a,double b){

        return a+b;
    }

    public static void main(String[] args) {
       add(7,8);
       add(7.5,6.5);

    }

}
