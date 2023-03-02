package pilha03;

public class Pilha {

    private No refNoEntradaPilha;

    public No top(){
        return refNoEntradaPilha;
    }

    public void push(No novoNo) {
        No noAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        novoNo.setRefNo(noAuxiliar);
    }

    public No pop() {
        if (!isEmpty()) {
            No noRetirado = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noRetirado;
        }
        return null;
    }
    public boolean isEmpty() {
        return refNoEntradaPilha == null;
    }

    @Override
    public String toString() {

        String stringRetorno = "------------\n";
        stringRetorno += "    Pilha\n";
        stringRetorno += "------------\n";

        No noAuxiliar = refNoEntradaPilha;

        while (true) {
            if (noAuxiliar != null) {
                stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            } else {
                break;
            }
        }
        stringRetorno += "============\n";
        return stringRetorno;
    }
}
