/**
 * Created by tianu on 7/10/17.
 */
public class Main {
    public static void main(String[] args) {
        Target target = new Target();
        target.value = 2;

        AddCommand addCommand = new AddCommand();
        MinusCommand minusCommand = new MinusCommand();
        MultiplyCommand multiplyCommand = new MultiplyCommand();

        addCommand.exec(2, target);
        minusCommand.exec(5, target);
        multiplyCommand.exec(6, target);

        System.out.println(target.value);

        multiplyCommand.undo();
        minusCommand.undo();
        addCommand.undo();

        System.out.println(target.value);
    }
}
