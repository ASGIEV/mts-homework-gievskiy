package lesson_3.homework;

public abstract class AbstractAnimal implements Animal{
    protected String breed; //порода
    protected String name; //имя
    protected Double cost; //стоимость
    protected String character; //характер

    /*public AbstractAnimal(String breed, String name, Double cost, String character){
        this.breed = breed;
        this.name = name;
        this.cost = cost;
        this.character = character;
    }*/
    public String getBreed(){
        return breed;
    }
    public String getName(){
        return name;
    }
    public Double getCost(){
        return cost;
    }
    public String getCharacter(){
        return character;
    }
}
