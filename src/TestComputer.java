import java.util.Scanner;

public class TestComputer {
    public static void main(String[] args){
        Computer computer = new Computer();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enther your brand : ");
        computer.setBrand(sc.next());

        System.out.print("Enther your series : ");
        computer.setSeries(sc.next());

        System.out.print("Enther your cpuname : ");
        computer.setCpuname(sc.next());

        System.out.print("Enther your cpuspeed : ");
        computer.setCpuspeed(sc.nextFloat());


        System.out.println("Computer brand : " + computer.getBrand());
        System.out.println("Computer Series : " + computer.getSeries());
        System.out.println(computer.getCpuname() + " " + computer.getCpuspeed() + "GHZ");

    }
}
