/**
 * Created by tianu on 7/10/17.
 */
public class Array implements Iterable<Integer> {
    int[] array;
    int count;

    public Array(int[] array, int count) {
        this.array = array;
        this.count = count;
    }

    @Override
    public Iterator<Integer> getIterator() {
        return new ArrayIterator(this);
    }

    static class ArrayIterator implements Iterator<Integer> {
        Array array;
        int position = 0;
        public ArrayIterator(Array array) {
            this.array = array;
        }

        @Override
        public boolean hasNext() {
            return position != array.count;
        }

        @Override
        public Integer next() {
            return array.array[position++];
        }
    }
}
