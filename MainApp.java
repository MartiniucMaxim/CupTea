package OOP_Part_1.CupApp;

public class MainApp {
    public static void main(String[]args){
        Cup cupA = new Cup("Tea",300);
        System.out.println(cupA.getLiquidName());
        System.out.println(cupA.getLiquidVolume());
        cupA.setLiquidName("Vodka");
        cupA.pourOutLiquid(50);
        System.out.println();
        Cup cupB = new Cup("Milk",500);
        System.out.println(cupB.getLiquidName());
        System.out.println(cupB.getLiquidVolume());
        cupA.setLiquidName("Liquor");
        cupB.poorInLiquid(150);


    }
}
