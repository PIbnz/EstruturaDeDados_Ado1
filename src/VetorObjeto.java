package src;

public class VetorObjeto {
    public Object[] elementos;
    public int tamanho;

    public VetorObjeto(Object[] elementos, int tamanho) {
        this.elementos = elementos;
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "VetorObjeto{}";
    }
}
