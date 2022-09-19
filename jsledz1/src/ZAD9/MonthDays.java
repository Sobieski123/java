package ZAD9;

public class MonthDays {
     int[] numerMiesiaca = new int[12];
     int rok;
    int miesiac;

     public void setMiesiac(int miesiac, int rok){
         this.miesiac = miesiac - 1;
         this.rok = rok;

     }
    public void WYPISUJ() {

            numerMiesiaca[0] = 31;
            numerMiesiaca[2] = 31;
            numerMiesiaca[3] = 30;
            numerMiesiaca[4] = 31;
            numerMiesiaca[5] = 30;
            numerMiesiaca[6] = 31;
            numerMiesiaca[7] = 31;
            numerMiesiaca[8] = 30;
            numerMiesiaca[9] = 31;
            numerMiesiaca[10] = 30;
            numerMiesiaca[11] = 31;
            if(this.rok%100 == 0 && this.rok%400 == 0){
                numerMiesiaca[1] = 29;
            } else if(this.rok%100!=0 && this.rok%4 ==0){
                numerMiesiaca[1] = 29;

            } else numerMiesiaca[1] = 28;

        System.out.println("Ten miesiac ma:" + numerMiesiaca[miesiac]+ "dni");
        }
}
