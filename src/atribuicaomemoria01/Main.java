package atribuicaomemoria01;

public class Main {
    public static void main(String[] args) {

        int a = 1;
        int b = a;

        System.out.println("a = " + a + " b = " + b);
        a = 2;
        System.out.println("a = " + a + " b = " + b);

        MeuObj obj1 = new MeuObj(1);
        MeuObj obj2 = obj1;

        System.out.println("obj1 = " + obj1 + " obj2 = " + obj2);
        obj1.setA(2);
        System.out.println("obj1 = " + obj1 + " obj2 = " + obj2);


    }
}