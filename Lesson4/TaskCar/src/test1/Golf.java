package test1;

public class Golf extends  VW {

    private String tank = "tank";
    private double tankPrice = 0;

    public Golf() {
        System.out.println("Golf constructor");
        this.model = "Golf";
        this.body = "HB";
        this.priseBody = 3500;
        this.box = "Manual";
        this.priseBox = 1000;
    }

    public void changeTank() {
        tankPrice = 100;
    }

    public void printCost(){
        double allPrise = priseWheels + priseAudio + priseEngine + priseBox + priseBody + tankPrice;
        System.out.println("totlCost " + allPrise);

    }

    @Override
    public void changeEngine() {
        this.engine = this.engine + 2000;
    }
}
