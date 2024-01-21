public class Task2 {

    public static void main(String[] args) {

        Room childrensRoom  = new Room("children", "pink", 25);

Flat flat1 = new Flat("Kazan", "Oldcity", "monolith", "20", 5, 118, true, childrensRoom);
        System.out.println(flat1.city);
        System.out.println(flat1.area);
        System.out.println(flat1.house);
        System.out.println(flat1.floor);
        System.out.println(flat1.rooms);
        System.out.println(flat1.square);
        System.out.println(flat1.encumbrance);
        System.out.println(flat1.room.appointment + " " + flat1.room.color_spectrum + " " + flat1.room.square);
    }
}