public class Room {
    private Furniture getFurn;
    private Curtons getCur;
    private Doors getDoor;
    private Pillow getPill;


    public Room(Furniture getFurn, Curtons getCur, Doors getDoor, Pillow getPill) {
        this.getFurn = getFurn;
        this.getCur = getCur;
        this.getDoor = getDoor;
        this.getPill = getPill;
    }

    public Furniture getGetFurn() {
        return getFurn;
    }

    public Curtons getGetCur() {
        return getCur;
    }

    public Doors getGetDoor() {
        return getDoor;
    }

    public Pillow getGetPill() {
        return getPill;
    }
}
