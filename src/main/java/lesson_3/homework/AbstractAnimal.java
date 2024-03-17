package lesson_3.homework;

public abstract class AbstractAnimal implements Animal{
    protected String breed; //порода
    protected String name; //имя
    protected Double cost; //стоимость
    protected String character; //характер

    public AbstractAnimal(String breed, String name, Double cost, String character) {
        this.breed = breed;
        this.name = name;
        this.cost = cost;
        this.character = character;
    }

    @Override
    public String toString() {
        return "Created animal: " + getBreed() + "; " + getName() + "; " + getCost()  + "; " + getCharacter();
    }

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
