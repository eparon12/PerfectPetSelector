import java.util.*;
public class PetSelector{
    
    public static boolean checkForSpecial(String word) {
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
        String pet;
        Scanner scan = new Scanner(System.in);
        System.out.println("Whats is your favorite color?");
        String favColor = scan.nextLine();
        favColor = favColor.toLowerCase();
        if(checkForSpecial(favColor)){
            System.out.println("Invalid Color.");
            break;
        }
        else{
            switch (favColor){
                case "blue":
                    pet = blueColor();
                case "red":
                    redColor();
                case "green":
                    greenColor();
                default:
                    System.out.println("Only color options are blue red or green");
                    break;
            }

            
            
        }
        scan.close();

    }
        public static String greenColor(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your favorite season? ");
        String favSeason = scan.nextLine();
        favSeason = favSeason.toLowerCase();
        if(checkForSpecial(favSeason)){
            System.out.println("Invalid Season.");
            break;
        }
        switch(favSeason){
            case "fall":
                return "rock";
            case "spring":
                return "dog";
            case "summer":
                return "dog";
            case "winter":
                if(!"aeiou".contains(name.substring(0, 1))){
                    return "giraffe";
                    boolean giraffe = true;
                }
                else{
                    return "rock";
                }
            default:
                System.out.println("Not a valid season.");
                break;
        }
    }
    public static String redColor(String [] args){
        Scanner scan = new Scanner(System.in);
        if("aeiou".contains(name.substring(0, 1))){
            return "porcupine";
        }
        else{
            return "panda";
        }
        
    }
    public static String blueColor(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your favorite season? ");
        String favSeason = scan.nextLine();
        favSeason = favSeason.toLowerCase();
        if(checkForSpecial(favSeason)){
            System.out.println("Invalid Season.");
            break;
        }
        switch(favSeason){
            case "fall":
                return "alligator";
            case "spring":
                return "ostrich";
            case "summer":
                return "ponie";
            case "winter":
                System.out.println("Whats your name?");
                String name = scan.nextLine();
                name = name.toLowerCase();
                if(checkForSpecial(name)){
                    System.out.println("Thats not a name");
                    break;
                }
                else{
                    //if(name.substring(0,1) != "a" || name.substring(0,1) != "e" || name.substring(0,1) != "o" || name.substring(0,1) !="u" || name.substring(0,1) != "i" ){}
                    if("aeiou".contains(name.substring(0, 1))){
                        return "rock";
                    }
                    else{
                        return "axolotl";
                    }
                }
                
            default:
                System.out.println("Not a valid season.");
                break;
        }

    }
}
