package task2;

public class VictorianChair implements Chair
{
    private int age;
    public int getAge()
    {
        return age;
    }
    VictorianChair(int age)
    {
        this.age=age;
    }
    public String toString() {
        return "|The VictorianChair|";
    }
    @Override
    public void sit()
    {
        System.out.println("Попробуем сесть на этот стул");
        System.out.println("Возраст этого стула "+getAge()+" лет");
    }
}