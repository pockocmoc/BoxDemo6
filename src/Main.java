class Box {
    double width;
    double height;
    double depth;

    Box() {
        System.out.println("Конструирование объекта Box");
        width = 10;
        height = 10;
        depth = 10;
    }
    double volume() {
        return width * height * depth;
    }
}
public class Main {
    public static void main(String[] args) {

        Box mybox1 = new Box();
        Box mybox2 = new Box();

        double vol;

        vol = mybox1.volume();
        System.out.println("Объём равен " + vol);

        vol = mybox1.volume();
        System.out.println("Объём равен " + vol);
    }
}