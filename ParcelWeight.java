import java.util.Scanner;
public class ParcelWeight{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter parcel weight: ");
            double weight = Double.parseDouble(
                sc.nextLine()
            );
            System.out.println("Weight accepted: " + weight + "Kg"); 
        }
        finally {
                System.out.println("weight checking completed.");
        }
    }
}