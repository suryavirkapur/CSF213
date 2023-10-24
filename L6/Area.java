
class Area {
    private double area;


    public void calc_Area(int side) {
        area = side * side;
    }

    public void calc_Area(float radius) {
        area = 3.14 * radius * radius;
    }

    public void calc_Area(float side1, float side2) {
        area = side1 * side2;
    }

    public void display() {
        System.out.println("Calculated Area: " + area);
    }
}
