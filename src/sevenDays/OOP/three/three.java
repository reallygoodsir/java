package sevenDays.OOP.three;

class Rectangle {
    private int width;
    private int height;

    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    void calculateArea(int width, int height){
        System.out.println("Area = " + (width * height));
    }
    void calculatePerimeter(int width, int height){
        int w = width * 2;
        int h = height * 2;
        int sum = w + h;
        System.out.println("Area = " + sum);
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        rectangle1.setHeight(10);
        rectangle1.setWidth(25);
        rectangle1.calculateArea(rectangle1.getWidth(), rectangle1.getHeight());
        Rectangle rectangle2 = new Rectangle();
        rectangle2.setHeight(30);
        rectangle2.setWidth(12);
        rectangle2.calculatePerimeter(rectangle2.getWidth(), rectangle2.getHeight());
    }
}
