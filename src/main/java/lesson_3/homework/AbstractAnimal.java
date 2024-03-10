package lesson_3.homework;

public abstract class AbstractAnimal implements Animal{
    protected String breed; //порода
    protected String name; //имя
    protected Double cost; //стоимость
    protected String character; //характер

    @Override
    public String getBreed(){
        return breed;
    }
    @Override
    public String getName(){
        return name;
    }
    @Override
    public Double getCost(){
        return cost;
    }
    @Override
    public String getCharacter(){
        return character;
    }
}
