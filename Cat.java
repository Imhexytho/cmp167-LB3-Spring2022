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
    //equals method
    public boolean equals(Object obj) {
        if(obj == this) return true;

        if(obj == null) return false;

        if(obj instanceof Cat) {

            Cat otherCat = (Cat)obj;
            return otherCat.species.equals(this.species) && otherCat.species.equals(this.species) && otherCat.age == this.age && otherCat.colorOfFur.equals(this.colorOfFur);
        }
        return false;
    }
}
