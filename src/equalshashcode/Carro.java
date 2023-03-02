package equalshashcode;

import java.util.Objects;

public class Carro implements Comparable<Carro>{

    String marca;

    public Carro(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        marca = marca;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Carro carro = (Carro) o;
//        return Objects.equals(this.carro, carro);
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro1 = (Carro) o;
        return Objects.equals(marca, carro1.marca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca);
    }

    @Override
    public String toString() {
        return "Carro{" +
                "Carro='" + marca + '\'' +
                '}';
    }

//    @Override
//    public int compareTo(Carro carro) {
//        if (this.marca.length() < carro.marca.length()) {
//            return -1;
//        } else if (this.marca.length() > carro.marca.length()) {
//            return 1;
//        }
//        return 0;
//    }

    @Override
    public int compareTo(Carro carro) {
        return this.marca.compareTo(carro.marca);
    }
}
