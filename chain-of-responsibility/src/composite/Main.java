package composite;

import java.util.ArrayList;

/**
 * Created by milabobo on 8:42 PM.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<ChainEmployee> employees = new ArrayList<>();
        employees.add(new Boss());
        employees.add(new DepartManager());
        employees.add(new TeamManager());
        employees.add(new TeamMember());
        Task task = new Task(new Chain(employees));

        task.makeRequest(RequestType.PAY_PRICE);
        System.out.println();
        task.makeRequest(RequestType.HOLD_MEETING);
        System.out.println();
        task.makeRequest(RequestType.MANAGE_CHART);
        System.out.println();
        task.makeRequest(RequestType.FIX_COMPUTER);
    }
}
