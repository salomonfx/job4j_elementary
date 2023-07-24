package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        return ab + ac > bc && ac + bc > ab && ab + bc > ac;
    }

    public static boolean isFalse(double ab, double ac, double bc) {
        return !exist(ab, ac, bc);
    }

    public static void main(String[] args) {
        boolean result = Triangle.exist(2, 2, 2);
        boolean rsl = Triangle.isFalse(4, 2, 2);
        System.out.println(result);
        System.out.println(rsl);
    }
}
