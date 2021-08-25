package OOP_Part_1.CupApp;

public class Cup {
    private String liquidName;
    private int liquidVolume;

    public Cup() {
    }

    public Cup(String liquidName, int liquidVolume) {
        setLiquidName(liquidName);
        setLiquidVolume(liquidVolume);
    }


    public void setLiquidName(String liquidName) {
        if(!liquidName.equals("Water") && !liquidName.equals("Milk") && !liquidName.equals("Tea")){
            this.liquidName=null;
            System.out.println("Only tea,milk and water required for setting liquid Name");
        }else
            this.liquidName=liquidName;
    }

    public void setLiquidVolume(int liquidVolume) {
        this.liquidVolume = liquidVolume;
        if(liquidVolume<=0){
            System.out.println("The volume of liquid doesn't should set on negative value.");
        }
        if(liquidVolume>=600){
            System.out.println("The volume is to much for cup. Please, set value less then 600ml");
        }
    }

    public String getLiquidName() {
        return liquidName;
    }

    public int getLiquidVolume() {
        return liquidVolume;
    }

    public void pourOutLiquid(int someLiquidVolume){
        this.liquidVolume-=someLiquidVolume;
        System.out.println("We had poured out from this cup " + someLiquidVolume + "ml and now remained " + liquidVolume+ "ml");
    }

    public void poorInLiquid(int someLiquidVolume){
        this.liquidVolume+=someLiquidVolume;
        System.out.println("We had poured in this cup " + someLiquidVolume + "ml and now it's" + liquidVolume+"ml");
        if(this.liquidVolume>=600)
            System.out.println("Great,u had poured to much liquid on cup. Congratulation, pov !!!");

    }


}
