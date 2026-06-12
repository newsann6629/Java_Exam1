import java.util.Scanner;

public class TestComputer {
    public static void main(String[] args){
        Computer computer = new Computer();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enther your brand");
        computer.setBrand(sc.next());

        System.out.println("Enther your series");
        computer.setSeries(sc.next());


        System.out.println("Computer brand : " + computer.getBrand());
        System.out.println("Computer Series : " + computer.getSeries());
        computer.setCpuname("i5 7400f");
        computer.setCpuspeed(5.0f);
        System.out.println(computer.getCpuname() + " " + computer.getCpuspeed() + "GHZ");

    }
}
