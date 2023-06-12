import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        int[] list = {5,8,-9,-45,25,33,-41,-22};

        System.out.println("Dizi :" + Arrays.toString(list));


        Arrays.sort(list);
        System.out.println("Sıralı liste : " + Arrays.toString(list));

        Scanner scan = new Scanner(System.in);
        System.out.print("lütfen sayı giriniz : ");
        int sayi = scan.nextInt();
        int min = sayi;
        int max = sayi;

        for(int i = list.length-1; i>=0; i--){
            if(list[i] < sayi){
                min = list[i];
                break;
            }
        }
        for (int i : list){
            if(i > sayi ){
                max = i;
                break;
            }
        }
        System.out.println("en yakın küçük sayı : " + min);
        System.out.println("en yakın büyük sayı :" + max);

    }
}
