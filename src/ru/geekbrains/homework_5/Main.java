package ru.geekbrains.homework_5;

public class Main {

    public static void main(String[] args) {
        Employee empPer = new Employee(); // Создание объекта с присвоением ему параметров по-умолчанию
        empPer.info(); // Отображение объекта в консоли
        Employee[] empEach = new Employee[5]; // Создание массива и заполнение массива объектами с определёнными параметрами
        empEach[0] = new Employee("Мартынов Клемент Вениаминович", "техник", "kleven@mailbox.com", "89231231245", 30000, 30);
        empEach[1] = new Employee("Брагин Юрий Германнович", "техник", "yuger@mailbox.com", "89376453647", 24000, 27);
        empEach[2] = new Employee("Симонов Корней Тихонович", "механик", "kortih@mailbox.com", "82316475837", 34600, 43);
        empEach[3] = new Employee("Кондратьев Захар Федосеевич", "старший механик", "zafed@mailbox.com", "82314658473", 38400, 52);
        empEach[4] = new Employee("Щукин Рубен Авксентьевич", "инженер", "rubavk@mailbox.com", "87649548375", 44300, 39);

        for (int i = 0; i < empEach.length; i++) { // Цикл прохода по массиву
            if (empEach[i].getAge() > 40) { // Условие выбора возраста больше 40 лет
                empEach[i].info(); // Вывод полученных объектов в консоль
            }
        }
    }
}
