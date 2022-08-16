import java.util.Scanner;
public class L_Artik_Yil_Hesaplama {
    public static void main(String[] args) {

        int yil;

        Scanner input = new Scanner(System.in);

        System.out.print("Yil Giriniz :");
        yil = input.nextInt();

        if(yil % 4 == 0){
            if(yil % 400 == 0){
            System.out.print(yil + " artik bir yildir");
            }else{
                System.out.println(yil + " artik bir yil degildir");
            }
        }else{
            System.out.println(yil + " artik bir yil degildir");

        }
    }
}
