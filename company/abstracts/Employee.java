package company.abstracts;

import company.interfaces.Employable;

public abstract class Employee implements Employable {
    private String name;
    private double salary;
    private String hireDate;
    private String position;
    private int id;

    public Employee(String name, double salary, int id, String hireDate, String position) {
        this.name = name;
        this.salary = salary;
        this.id = id;
        this.hireDate = hireDate;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getHireDate() {
        return hireDate;
    }

    public String getPosition() {
        return position;
    }

    public int getId() {
        return id;
    }
}