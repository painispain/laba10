package task2;

public interface AbstractChairFactory
{
    MagicChair createMagicChair();
    FunctionalChair createFunctionalChair();
    VictorianChair createVictorianChair();
}