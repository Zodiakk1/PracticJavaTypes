package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1. Інформація про примітивні типи
        System.out.println("=== Інфориація про примітивні типи ===");
        System.out.println("byte: " + Byte.SIZE + "біт, min=" + Byte.MIN_VALUE + "max=" + Byte.MAX_VALUE);
        System.out.println("short: " + Short.SIZE + " біт, min=" + Short.MIN_VALUE + ", max=" + Short.MAX_VALUE);
        System.out.println("int: " + Integer.SIZE + " біт, min=" + Integer.MIN_VALUE + ", max=" + Integer.MAX_VALUE);
        System.out.println("long: " + Long.SIZE + " біт, min=" + Long.MIN_VALUE + ", max=" + Long.MAX_VALUE);
        System.out.println("float: " + Float.SIZE + " біт, min=" + Float.MIN_VALUE + ", max=" + Float.MAX_VALUE);
        System.out.println("double: " + Double.SIZE + " біт, min=" + Double.MIN_VALUE + ", max=" + Double.MAX_VALUE);
        System.out.println("char: " + Character.SIZE + "бін, min=" +  (int) Character.MIN_VALUE + ", max=" + (int) Character.MAX_VALUE);
        System.out.println("boolean: true/false");

        //2. Зчитування значень
        Scanner sc = new Scanner(System.in);

        System.out.print("Введіть чісло типу int: ");
        int i = Integer.parseInt(sc.nextLine());
        System.out.println("Ви ввели int: " + i);

        System.out.print("Введіть чісло типу double: ");
        double d = Double.parseDouble(sc.nextLine());
        System.out.println("Ви ввели double: " + d);

        System.out.print("Введіть символ типу char: ");
        char c = sc.nextLine().charAt(0);
        System.out.println("Ви ввели char: " + c);

        System.out.print("Введіть true/false для boolean: ");
        boolean b = Boolean.parseBoolean(sc.nextLine());
        System.out.println("Ви ввели boolean: " + b);

        System.out.print("Дякую що спробували! код був написаний Герасименко Романом.");
    }
}