public class TestComputer {
    public static void main(String[] args){
        Computer computer = new Computer();

        computer.powerOn();

        computer.setBrand("Hp");
        System.out.println("คอมพิวเตอร์ยี่ห้อ : " + computer.getBrand());
        computer.setSeries("a67");
        System.out.println(computer.getSeries());

        computer.powerOff();
        computer.restart();
    }
}
