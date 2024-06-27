package Genericos;


import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetGenerico<T> implements Iterable<T> {
    private Set<T> elementos;

    public SetGenerico() {
        this.elementos = new LinkedHashSet<>();
    }

    public void add(T elemento) {
        elementos.add(elemento);
    }

    public void remove(T elemento) {
        elementos.remove(elemento);
    }



    public Set<T> getElementos() {
        return Collections.unmodifiableSet(elementos);
    }

    public boolean contains(T elemento) {
        return elementos.contains(elemento);
    }

    public Iterator<T> iterator() {
        return elementos.iterator();
    }


}
