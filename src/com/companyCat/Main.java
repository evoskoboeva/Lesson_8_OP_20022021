package com.companyCat;

public class Main {

    public static void main(String[] args) {
//Создать класс Автомобиль
//Указать поля: марка, год выпуска, цвет, объём двигателя, состояние, тип топлива, пробег.
//Реализовать проверки в свойствах: год выпуска меньше чем текущий год, объём двигателя больше 0 и
// меньше какого-то значения, пробег больше 0 и меньше 10000000.
//Реализовать методы: toString(), equals(), IsSuspicios() // год выпуска давний, а пробег малый
//Создать несколько экземпляров класса и продемонстрировать работу методов.
        Auto auto02 = new Auto("honda", 2019, "black", 2.5,"petrol", 3000);
        Auto auto1 = new Auto("nissan", 2000, "white", 3, "petrol", 100);
        Auto auto2 =new Auto("honda", 2019, "black", 2.5,"petrol", 3000);
        Auto auto3 = new Auto("bmw", 1999, "green", -4, "diesel fuel", -10000);
        System.out.println(auto02);
        System.out.println(auto1);
        System.out.println(auto2);
        System.out.println(auto3);

        if (auto02.equals(auto2)){
            System.out.println("This car are the same");
        }
        else if (auto02.getYear() == auto2.getYear()){}
        else if (auto02.getYear() < auto2.getYear()){
            System.out.println("first car older");
                    }
        else {
            System.out.println("Second car older");
        }

}
// не придумала как перебрать автоматически все создаваемые объекты класса - например чтоб сделать метод
// автоподбора машины
 // public void AutoIdeal(){
     //}

}
