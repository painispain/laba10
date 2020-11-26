package task2;

import java.util.*;

public class FunctionalChair implements Chair
{
    public int sum(int a, int b)
    {
        return a+b;
    }
    @Override
    public String toString() {
        return "|The FunctionalChair|";
    }
    @Override
    public void sit() {
        System.out.println("Попробуем сесть на этот стул");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Этот стул может считать сумму  двух целых чисел. Попробуйте:" +
                "\nВведите 2 числа: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(" Их сумма  " + sum(a, b));
    }
}