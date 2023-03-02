package atribuicaomemoria01;

public class MeuObj {

    private Integer a;

    public MeuObj(int a) {
        this.a = a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return a.toString();
    }
}
