package Cat;
public class Cat {
    private String species;
    private int age;
    private String colorOfFur;


    public Cat(String species, int age, String colorOfFur){
        this.species = species;
        this.age = age;
        this.colorOfFur = colorOfFur;


    }

    //setters
    public void setSpecies(String species){
        this.species = species;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setColorOfFur(String colorOfFur){
        this.colorOfFur = colorOfFur;
    }

    //getters
    public  String getSpecies(){
        return species;
    }
    public int getAge(){
        return age;
    }
    public String getColorOfFur(){
        return colorOfFur;
    }
}
