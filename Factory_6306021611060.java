import java.util.Scanner;

public class Factory_6306021611060 {
    Scanner scan = new Scanner(System.in);
    static Factory_6306021611060 data = new Factory_6306021611060();
    int water, sugar;
    public Factory_6306021611060() {
        water = 0;
        sugar = 0;
    }
    public static void main(String[] args) {
        data.InputWaterAndSugar();
    }
    
    public void InputWaterAndSugar() {
        int water, sugar;
        System.out.println("Please Enter Order of Water and Sugar of Factory in 7 day.");
        for (int i = 0; i < 7; i++) {
            do {
                System.out.print("Please Enter Number Water in Day " + (i + 1) + " : ");
                water = data.scan.nextInt();
                if (water < 1 || water > 9999) System.out.println("Incorrect input, please try again.");
            } while(water < 1 || water > 9999);
            data.water += water;

            do {
                System.out.print("Please Enter Number Sugar in Day " + (i + 1) + " : ");
                sugar = data.scan.nextInt();
                if (sugar < 1 || sugar > 9999) System.out.println("Incorrect input, please try again.");
            } while(sugar < 1 || sugar > 9999);
            data.sugar += sugar;

            data.Process(i + 1);
        }
    }

    public void Process(int day) {
        System.out.println("  Result Water in Day " + (day) + " : " + data.water);
        System.out.println("  Result Sugar in Day " + (day) + " : " + data.sugar);
        int tea = 0, water_n, sugar_n;
        water_n = data.water / 250;
        sugar_n = data.sugar / 15;
        if (water_n < sugar_n) tea = water_n;
        else if (sugar_n < water_n) tea = sugar_n;
        else tea = water_n = sugar_n;
        for (int i = 0; i < tea; i++) {
            data.water -= 250;
            data.sugar -= 15;
        }
        Show(tea, day);
    }

    public static void Show(int tea, int day) {
        System.out.println("  Result Production in Day " + day + " : " + tea);
        System.out.println("  Result Remaining Water in Day " + day + " : " + data.water);
        System.out.println("  Result Remaining Sugar in Day " + day + " : " + data.sugar);
        System.out.println();
    }
}