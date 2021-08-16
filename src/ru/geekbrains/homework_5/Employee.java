package ru.geekbrains.homework_5;

public class Employee { // Создание класса сотрудников
    private String fcs; // ФИО
    private String post; // Должность
    private String email; // Адрес email
    private String phone; // Номер телефона
    private int salary; // Зарплата
    private int age; // Возраст

    public Employee() { // Автозаполнение полей объектов класса при вызове класса без аргументов
        fcs = "Иванов Александр Петрович";
        post = "механик";
        email = "forexample1@gmail.com";
        phone = "12345678";
        salary = 35500;
        age = 45;
    }

    public Employee(String fcs, String post, String email, String phone, int salary, int age) { // Позволяет создавать объекты с присвоением ему определённых свойств
        this.fcs = fcs;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void setFcs(String fcs) { // Сеттер для изменения значения поля
        this.fcs = fcs;
    }

    public String getFcs() { // Геттер для получения содержимого поля
        return fcs;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setAge(int age) {
        if (age >= 0) { // Проверка на корректность ввода возраста
            this.age = age;
        } else {
            System.out.println("Введён некорректный возраст!");
        }
    }

    public int getAge() {
        return age;
    }

    public void info() { // Вывод информации об объектах в консоль
        System.out.printf("ФИО: %s. Должность: %s. Email: %s. Номер телефона: %s. Зарплата: %s. Возраст: %s.%n", fcs, post, email, phone, salary, age);
    }
}
