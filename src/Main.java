import less2.HW1;
import less2.HW2;
import less2.HW3;
import less3.Employee;
import less3.Leader;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee ivan = new Employee("Ivan", "Igorevich",
                "Ovchinnikov", "8(495)000-11-22",
                "developer", 50000, 1985);
        Employee andrey = new Employee("Andrey", "Viktorovich",
                 "Bezrukov", "8(495)111-22-33",
                 "fitter", 52000, 1973);
        Employee evgeniy = new Employee("Evgeniy", "Viktorovich",
                "Delfinov", "8(495)222-33-44",
                "project manager", 40000, 1963);
        Employee natalia = new Employee("Natalia", "Pavlovna",
                "Keks", "8(495)333-44-55",
                "senior developer", 90000, 1990);
        Employee tatiana = new Employee("Tatiana", "Sergeevna",
                "Krasotkina", "8(495)444-55-66",
                "accountant", 50000, 1983);
        Leader Viktor = new Leader("Viktor","Sergee","Krasotkin",
                "8(495)444-55-66","leader",1000000,1970);

        list.add(ivan);
        list.add(andrey);
        list.add(evgeniy);
        list.add(natalia);
        list.add(tatiana);
        list.add(Viktor);

        Leader.increaser(list, 1000);

        list.sort(Employee::compareTo);

        for (Employee e : list) {
            System.out.println(e.toString());
        }



    }
}