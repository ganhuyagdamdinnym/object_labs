class Computer {
    public String brand;
    private int ram;

    public Computer(String brand, int ram) {
        this.brand = brand;
        this.ram = ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getRam() {
        return ram;
    }

    public void showInfo() {
        System.out.println("Computer brand: " + brand);
        System.out.println("RAM: " + ram);
    }
}

class Printer {

    public String model;
    private int speed;

    public Printer(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void printInfo() {
        System.out.println("Printer model: " + model);
        System.out.println("Speed: " + speed);
    }
}

public class work_with_object {

    public static void main(String[] args) {
        Computer pc = new Computer("Dell", 16);
        Printer pr = new Printer("HP", 20);

        pc.showInfo();
        pr.printInfo();

        pc.setRam(32);
        pr.setSpeed(25);
         
        System.out.println("New RAM: " + pc.getRam());
        System.out.println("New Speed: " + pr.getSpeed());
    }
}