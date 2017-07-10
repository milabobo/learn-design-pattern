import java.util.ArrayList;

/**
 * Created by tianu on 7/10/17.
 */
public class List implements Iterable<Integer> {
    java.util.List<Integer> list;

    public List(int... args) {
        list = new ArrayList<>(args.length * 2);
        for (int i = 0; i < args.length; i++) {
            list.add(args[i]);
        }
    }

    @Override
    public Iterator<Integer> getIterator() {
        return new ListIterator(this);
    }

    static class ListIterator implements Iterator<Integer> {
        List list;
        int position = 0;
        public ListIterator(List list) {
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            return position != list.list.size();
        }

        @Override
        public Integer next() {
            return list.list.get(position++);
        }
    }
}
