/**
 * Created by tianu on 7/10/17.
 */
public class Main {
    public static void main(String[] args) {
        Array array = new Array(new int[]{1,2,3,4,5}, 5);
        List list = new List(1,2,3,4,5);

        Iterator<Integer> arrayIterator = array.getIterator();
        Iterator<Integer> listIterator = list.getIterator();

        while (arrayIterator.hasNext()) {
            System.out.println(arrayIterator.next());
        }
        System.out.println();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
    }
}
