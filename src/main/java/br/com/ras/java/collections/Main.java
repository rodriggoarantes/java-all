package br.com.ras.java.collections;

import br.com.ras.java.shared.LogUtil;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main extends LogUtil {

    public static void main(String[] args) {
        interateList();
        sortList();

        sortSet();
    }

    private static void interateList() {
        final List<Element> list =
                IntStream.iterate(0, n -> n+1).limit(50000).boxed()
                        .map(numb -> new Element(String.valueOf(numb), numb)).collect(Collectors.toList());

        final AtomicInteger contador = new AtomicInteger(0);

        outln("--------");
        outTime("Foreach");
        contador.set(0);
        executeTime(() -> {
            for (final Element item : list) {
                contador.addAndGet(item.value);
            }
        });
        outln("contador : " + contador.get());
        outln("--------");

        outln("--------");
        outTime("Foreach collection");
        contador.set(0);
        executeTime(() ->
                list.forEach(item -> contador.addAndGet(item.value))
        );
        outln("contador : " + contador.get());
        outln("--------");

        outln("--------");
        outTime("Foreach stream");
        contador.set(0);
        executeTime(() ->
            list.stream().forEach(item -> contador.addAndGet(item.value))
        );
        outln("contador : " + contador.get());
        outln("--------");
    }

    private static void sortList() {
        final List<String> lista = Arrays.asList("T", "A", "R", "D", "Y", "B", "E", "C", "O", "F");

        outln("-----");
        lista.sort(Comparator.comparing(s -> s));
        lista.forEach(Main::outln);
        outln("-----");
        lista.stream().sorted().forEach(Main::outln);
    }


    private static void sortSet() {
        final var valores = Set.of(Element.of("1", 2),
                                   Element.of("9", 9),
                                   Element.of("5", 5),
                                   Element.of("2", 2),
                                   Element.of("1", 1));

        outln("----- list sort -----");
        final var list = new ArrayList<>(valores);
        list.sort(Comparator.comparing(e -> e.id));
        list.forEach(e -> outln(e.toString()));

        outln("----- tree sort -----");
        final var arvoreValores = unmodifiableSorted(valores);
        arvoreValores.forEach(e -> outln(e.toString()));
        outln("-----");
    }

    private static Set<Element> unmodifiableSorted(Set<Element> valores) {
        final var nullSafeSet = unmodifiable(valores);
        final var orderedList = new ArrayList<>(nullSafeSet);
        Collections.sort(orderedList);
        return new TreeSet<>(orderedList);
    }

    public static <T> Set<T> unmodifiable(Set<T> collection) {
        return collection == null ? Collections.emptySet() : Collections.unmodifiableSet(collection);
    }

    private static class Element implements Comparable<Element> {
        private final String id;
        private final Integer value;

        public static Element of(String id, Integer value) {
            return new Element(id, value);
        }

        public Element(String id, Integer value) {
            this.id = id;
            this.value = value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Element)) return false;
            Element element = (Element) o;
            return Objects.equals(id, element.id)
                    && Objects.equals(value, element.value);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id, value);
        }

        @Override
        public String toString() {
            return "Element{" +
                    "id='" + id + '\'' +
                    ", value=" + value +
                    '}';
        }

        @Override
        public int compareTo(Element o) {
            final var compareId = this.id.compareTo(o.id);
            if (compareId != 0) return compareId;
            return this.value.compareTo(o.value);
        }
    }

}
