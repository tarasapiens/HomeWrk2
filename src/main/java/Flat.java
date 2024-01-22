 public class Flat {
    String city;
    String area;
    String house;
    String floor;
    int rooms;
    int square;
    boolean encumbrance;
    Room room;


    public Flat(String city, String area, String house, String floor, int rooms, int square, boolean encumbrance){
        this.city = city;
        this.area = area;
        this.house = house;
        this.floor = floor;
        this.rooms = rooms;
        this.square = square;
        this.encumbrance = encumbrance;
    }
public Flat(String city, String area, String house, String floor, int rooms, int square, boolean encumbrance, Room room) {
    this.city = city;
    this.area = area;
    this.house = house;
    this.floor = floor;
    this.rooms = rooms;
    this.square = square;
    this.encumbrance = encumbrance;
    this.room = room;

}

}