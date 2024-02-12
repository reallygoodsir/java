public class Fruit {
    private String color;

    private int size;

    public Fruit(String color, int size) {
        this.color = color;
        this.size = size;
    }

    public Fruit() {

    }

    public String getColor() {
        return color;
    }

    public void setColor(String colorInput) {
        this.color = colorInput;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int sizeInput) {
        if (sizeInput <= 0) {
            return;
        } else {
            this.size = sizeInput;
        }
    }

    public void modifySize(int newSize) {
        size = newSize;
    }
}
