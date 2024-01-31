package less3;

import java.util.List;

/*2. (Код пишется на основе задачек из презентации.) Опишите класс руководителя,
наследник от сотрудника. Перенесите статический метод повышения зарплаты в класс
руководителя, модифицируйте метод таким образом, чтобы он мог поднять заработную
плату всем, кроме руководителей (использовать instanceof). В основной программе
создайте руководителя и поместите его в общий массив сотрудников. Повысьте зарплату
всем сотрудникам и проследите, чтобы зарплата руководителя не повысилась.
 */
public class Leader extends Employee{
    public Leader(String name, String midName, String surName, String phone,
                  String position, int salary, int birth) {
        super(name, midName, surName, phone, position, salary, birth);
    }
    public static void increaser(List<Employee> list, int increment) {
        int age = 0;
        for (Employee employee : list) {
            if (!(employee instanceof Leader)) {
                employee.incSalary(increment);
            }
        }
        }



}
