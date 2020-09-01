package animalKingdom;

abstract class Animals {

    private static int maxId = 0;
    private int food;
    private String name;
    private int year;


    public Animals(String name, int year){
        food = 10;
        this.name = name;
        this.year = year;
    }

    static void eat() {
        food--;        
    }

    abstract String move();
    abstract String breath();
    abstract String reproduce();

}