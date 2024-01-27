package less3;

import java.util.*;
import java.util.List;

/*1. Написать компаратор - метод внутри класса сотрудника,
сравнивающий сотрудников по произвольному параметру.*/
public class Employee implements Comparable<Employee>{
private static final int CURRENT_YEAR = 2022;
String name;
String midName;
String surName;
String position;
String phone;
int salary;
int birth;

        public Employee(String name, String midName, String surName, String phone, String position, int salary, int birth) {
        this.name = name;
        this.midName = midName;
        this.surName = surName;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.birth = birth;
        }

        public String getName() {

        return name;
        }

        public String getMidName() {
        return midName;
        }

        public String getSurName() {
        return surName;
        }

        public String getPosition() {
        return position;
        }

        public void setPosition(String position) {
        this.position = position;
        }

        public String getPhone() {
        return phone;
        }

        public void setPhone(String phone) {
        this.phone = phone;
        }

        public int getSalary() {
        return salary;
        }

        public void setSalary(int salary) {
        this.salary = salary;
        }

        public int getAge() {
        return CURRENT_YEAR - birth;
        }



        protected void incSalary(int amount) {
                this.salary += amount;
        }

        @Override
        public String toString() {
                return getSalary() + " "
                        + getName() + " "
                        + getMidName() + " "
                        + getSurName() + " "
                        + getPosition() + " "
                        + getPhone() + " "
                        + getAge();
        }

        @Override
        public int compareTo(Employee o) {
                return this.getSalary() - o.getSalary();
        }

}
