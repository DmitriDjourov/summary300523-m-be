package de.telran.lesson20230901;

public class Cat {

    protected int age;
    private String name;
    private boolean isHungry;

//    private Kitten kitten = new Kitten();

    private static int catCount = 0;

    public static void printCatCount(){
        // age++; impossible
        System.out.println("Total cat count: " + catCount);
    }

    public Cat(int catAge, String catName){
        catCount++;
        age = catAge;
        name = catName;
        isHungry = true;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public boolean isHungry() {
        return isHungry;
    }

    private void incrementAge(){
        age++;
    }

    public void feed(){
        isHungry = false;
    }

    public Kitten createKitten(){
        Kitten kitten = new Kitten();
        kitten.kittenName = "New name";
        return kitten;
    }

    public class Kitten {
        private String kittenName;

        public String getParentName(){
            return name;
        }
    }

}


