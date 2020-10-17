public class DoorTest {
    public static void main(String[] args) {
        Door firstDoor = new Door();
        System.out.println(firstDoor.toString());

        firstDoor.close();
        firstDoor.colorIt("blue");

        System.out.println(firstDoor.isOpen() + " " + firstDoor.getColor());


    }
}
