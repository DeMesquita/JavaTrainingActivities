public class Door {

    public boolean open;
    public String color;
    public double dimensionX;
    public double dimensionY;
    public double dimensionZ;

    public Door( ) {
        this.open = true;
        this.color = "sem cor";
        this.dimensionX = 5;
        this.dimensionY = 5;
        this.dimensionZ = 5;
    }

    void open(){
        if (!this.open){
            this.open = true;
        }else{
            System.out.println("The door is already opened.");
        }
    }

    void close(){
        if (this.open){
            this.open = false;
        }else{
            System.out.println("The door is already closed.");
        }
    }

    void colorIt(String color){
        this.color = color;
    }

    boolean isOpen(){
        return open;
    }


    public String getColor() {
        return color;
    }

    public double getDimensionX() {
        return dimensionX;
    }

    public void setDimensionX(double dimensionX) {
        this.dimensionX = dimensionX;
    }

    public double getDimensionY() {
        return dimensionY;
    }

    public void setDimensionY(double dimensionY) {
        this.dimensionY = dimensionY;
    }

    public double getDimensionZ() {
        return dimensionZ;
    }

    public void setDimensionZ(double dimensionZ) {
        this.dimensionZ = dimensionZ;
    }

    @Override
    public String toString() {
        return "Door{" +
                "\nopen=" + open +
                ",\ncolor='" + color + '\'' +
                ",\ndimensionX=" + dimensionX +
                ",\ndimensionY=" + dimensionY +
                ",\ndimensionZ=" + dimensionZ +
                '}';
    }
}
