import java.util.*;
public class PetSelector{
    public boolean checkForSpecial(String word) {
        // final Char[]  _specialChars = new Char[] {";", " ", "-", "_", "*", "!", "@", "#", "$", "%", " ^"}
        word = word.toLowerCase();
        for(i = 0; i <= word.length(); i++){
            if ((int)word.charAt(i) < 97 || (int)word.charAt(i) > 122){
                
                return true;
                break;
            }
        }
        return false;
    }
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Whats is your favorite color?");
        String favColor = scan.nextLine();
        favColor = favColor.toLowerCase();
        if(favColor.checkForSpecial(favColor)){
            System.out.println("Invalid Color.");
            break;
        }
        else{
            switch (favColor){
                case "blue":
                    blueColor();
                case "red":
                    redColor();
                case "green":
                    greenColor();
                default:
                    colorNotQual();
            }

            
            
        }
        scan.close();

    }
    public static void blueColor(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your favorite season? ");
        String favSeason = scan.nextLine();
        favSeason = favSeason.toLowerCase();
        if(favSeason.checkForSpecial(favSeason)){
            System.out.println("Invalid Season.");
            break;
        }
        switch(favSeason){
            case "fall":
            
            case "autumn":
            case "summer":
            case "winter":
            default:
                System.out.println("Not a valid season.");
                break;
        }

    }
}
