package test1;

public class JettaMax extends Jetta{

    public JettaMax (){
        this.engine = "TSI";
        this.priseEngine = 3000;
        this.box = "Automation";
        this.priseBox = 2000;
    }
    public JettaMax (double priceEngine){
        this();
        this.priseEngine = priceEngine;
    }
}
