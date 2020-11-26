package task2;

public class MagicChair implements Chair
{
    public void doMagic()
    {
        System.out.println("Этот стул предсказывает будущее");
    }
    @Override
    public String toString() {
        return "|The MagicChair|";
    }
    @Override
    public void sit()
    {
        System.out.println("Попробуем сесть на этот стул");
        doMagic();
    }
}