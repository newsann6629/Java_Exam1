public class Computer {
    private String brand;
    private String series;

    public void setBrand(String b){
        this.brand = b;
    }
    public String getBrand(){
        return this.brand;
    }
    public void setSeries(String s){
        this.series = s;
    }
    public  String getSeries(){
        return this.series;
    }


    public void powerOn(){
        System.out.println("computer is power on");
    }
    public void powerOff(){
        System.out.println("computer is power off");
    }
    public void restart(){
        System.out.println("computer is restarting");
    }
}