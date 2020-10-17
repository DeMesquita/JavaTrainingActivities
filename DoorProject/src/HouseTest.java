public class HouseTest {
    public static void main(String[] args) {
        House firstHouse = new House();

        firstHouse.colorIt("red");
        firstHouse.secondDoor.colorIt("blue");
        firstHouse.thirdDoor.colorIt("pink");
        firstHouse.thirdDoor.close();

        System.out.println(firstHouse.howManyDoorsAreOpen());
    }
}
