package composite;

import java.util.ArrayList;

/**
 * Created by tianu on 7/10/17.
 */
public class Chain {

    // the last one is to fix computer
    ArrayList<ChainEmployee> employees;
    int currentPerson;
    boolean requestMade;

    public Chain(ArrayList<ChainEmployee> employees) {
        this.employees = employees;
    }

    ArrayList<ChainEmployee> getEmployees() {
        return new ArrayList<>(employees);
    }

    public void makeRequest(RequestType type) {
        ChainEmployee employee;

        if (currentPerson != employees.size()) {
            employee = employees.get(currentPerson++);
            if (employee.canMakeRequest(type)) {
                employee.makeRequest(this, type);
                requestMade = true;
            }
        }

        if (currentPerson == employees.size() && !requestMade) {
            throw new IllegalArgumentException("No one can do this type");
        } else if (requestMade) {
            requestMade = false;
            currentPerson = 0;
        }
    }
}
