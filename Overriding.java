

class Bike{
    void run(){
        System.out.println("waiting");

    }
}

public class Overriding extends Bike {
    void run() {
        System.out.println("starting");}

    public static void main(String[] args) {
        Overriding b=new Overriding();
        b.run();

    }
}