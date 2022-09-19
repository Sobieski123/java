package zad4;

public class zad4 {
    public static void main(String[] args) {
        RetailItem item[] = new RetailItem[3];
        item[0] = new RetailItem("Kurtka", 12, 159.95);
        item[1] = new RetailItem("Markowe dzinsy", 40, 134.95);
        item[2] = new RetailItem("Woda toaletowa LUCA BOOSSI", 20, 124.95);
        for(int i = 0; i<3;i++){
            System.out.println(item[i].getDescription() + " " + item[i].getUnitsOnHand() + " " + item[i].getPrice());
        }

    }
}
