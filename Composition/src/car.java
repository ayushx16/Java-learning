public class car extends vehical{
    private int doors;
    private int capacity;

    public car(String name, int doors, int capacity) {
        super(name);
        this.doors = doors;
        this.capacity = capacity;
    }
    public car()
    {
        System.out.println("this is car class extended from vehical is called");
        System.out.println("name of company is "+ getName()+ " no of doors "+ doors + " capacity " + capacity);
    }


    public int getDoors() {
        return doors;
    }

    public int getCapacity() {
        return capacity;
    }
}
