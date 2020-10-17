public class House {
    public String color;
    public Door firstDoor = new Door();
    public Door secondDoor = new Door();
    public Door thirdDoor = new Door();

    public House() {
    }

    void colorIt(String color){
        this.color = color;
    }

    int howManyDoorsAreOpen(){
        int countOpenDoors = 0;

        if (firstDoor.isOpen()){
            countOpenDoors += 1;
        }
        if (secondDoor.isOpen()){
            countOpenDoors += 1;
        }
        if (thirdDoor.isOpen()){
            countOpenDoors += 1;
        }
        return countOpenDoors;
    }

    @Override
    public String toString() {
        return "House{" +
                "color='" + color + '\'' +
                ", \nfirstDoor status and color : " + firstDoor.isOpen() + " - "+ firstDoor.getColor() +
                ", \nsecondDoor status and color=" + secondDoor.isOpen() + " -  "+ secondDoor.getColor()+
                ", \nthirdDoor status and color=" + thirdDoor.isOpen() + " - " + thirdDoor.getColor() +
                '}';
    }
}
