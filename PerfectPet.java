import java.util.*;
public class PetSelector{
    public boolean checkForSpecial(String word) {
        // final Char[]  _specialChars = new Char[] {";", " ", "-", "_", "*", "!", "@", "#", "$", "%", " ^"}
        word = word.toLowerCase();
        for(i = 0; i <= word.length(); i++){
            if ((int)word.charAt(i) < 97 || (int)word.charAt(i) > 122){
                
                return false;
                break;
            }
        }
        return true;
    }
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Whats is your favorite color?");
        String favColor = scan.nextLine();

    }
}
