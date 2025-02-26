package src;

public class VetorObjeto {
    public Object[] elementos;
    public int tamanho;

    public VetorObjeto(int capacidade) {
        this.elementos = new Object[capacidade];
        this.tamanho = 0;
    }

    @Override
    public String toString() {
        return "VetorObjeto{}";
    }
}
