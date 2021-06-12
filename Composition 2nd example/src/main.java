public class main {

    public static void main(String[] args) {


        Curtons curtons = new Curtons("Red", 10, 4, new Pillow("Black", 4));
        Furniture furniture = new Furniture("Double bed", "small Table", "2ton", "63 inch led", curtons);
        Doors doors = new Doors("Brown", 20);
        Room room = new Room(furniture, curtons, doors, curtons.getPillow());
        room.getGetFurn().furn();
        room.getGetPill().pil();
    }
}
