public class Main {
    public static void main(String[] args) {
        int check = 250;
        int sumRefill = 1100;
        int bonus = sumRefill / 100;

        int newCheck;
        if (sumRefill > 1000) {
            newCheck = bonus + sumRefill + check;
        } else  {
            newCheck = sumRefill + check;
        }
        System.out.println("Итоговая сумма счета: " + newCheck);
    }
}