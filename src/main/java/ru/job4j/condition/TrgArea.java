package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double hm = (a + b + c) / 2;
        return Math.sqrt((hm - a) * (hm - b) * (hm - c) * hm);
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        double rsl2 = TrgArea.area(3, 3, 3);
        System.out.println("area (2, 2, 2) = " + rsl);
        System.out.println("area (3, 3, 3) = " + rsl2);
    }
}
