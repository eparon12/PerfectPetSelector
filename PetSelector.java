
//amir maman, 16.10.25, this program is made to find your perfect pet based on your name, favorite color and season

import java.util.*;
public class PetSelector{
    
    public static boolean checkForSpecial(String word) {
        // final Char[]  _specialChars = new Char[] {";", " ", "-", "_", "*", "!", "@", "#", "$", "%", " ^", "&", "("}
        word = word.toLowerCase();
        for(int i = 0; i < word.length(); i++){
            if ((int)word.charAt(i) < 97 || (int)word.charAt(i) > 122) {
                
                return true;
            }
        }
        return false;
    }
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Whats is your favorite color?");
        String favColor = scan.nextLine();
        favColor = favColor.toLowerCase();
        if(checkForSpecial(favColor)){
            System.out.println("Invalid Color.");
        }
        else{
            String pet= "rock";
            switch (favColor){
                case "blue":{
                    pet = blueColor();
                    break;
                }
                case "red":{
                    pet = redColor();
                    break;
                }
                case "green":{
                    pet = greenColor();
                    break;
                }
                default:{
                    System.out.println("Only color options are blue red or green");
                    break;
                }
                
            }
            System.out.println("Your perfect pet is " + pet);

            
            
        }
        scan.close();

    }
        public static String greenColor(){
        String error = "you entered an invalid value and the method has failed";
        String pet = "rock";
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your favorite season? ");
        String favSeason = scan.nextLine();
        favSeason = favSeason.toLowerCase();
        if(checkForSpecial(favSeason)){
            System.out.println("Invalid Season.");
            return error;
        }
        switch(favSeason){
            case "fall":
                return pet;
            case "spring":
                pet = "dog";
                return pet;
            case "summer":
                pet =  "dog";
                return pet;
            case "winter":
                System.out.println("Whats your name?");
                String name = scan.nextLine();
                name = name.toLowerCase();
                if(!"aeiou".contains(name.substring(0, 1))){
                    pet = "giraffe";
                    return pet;
                }
                else{
                    return pet;
                }
            default:
                System.out.println("Not a valid season.");
                return error;
        }
    }
    public static String redColor(){
        String error = "you entered an invalid value and the method has failed";
        String pet = "rock";
        Scanner scan = new Scanner(System.in);
        System.out.println("Whats your name?");
        String name = scan.nextLine();
        name = name.toLowerCase();
        if(checkForSpecial(name)){
            System.out.println("Invalid Name.");
            return error;
        }
        if("aeiou".contains(name.substring(0, 1))){
            pet = "porcupine";
            return pet;
        }
        else{
            pet =  "panda";
            return pet;
        }
        
    }
    public static String blueColor(){
         System.out.println("entered blue");
        String error = "you entered an invalid value and the method has failed";
        String pet = "rock";
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your favorite season? ");
        String favSeason = scan.nextLine();
        favSeason = favSeason.toLowerCase();
        if(checkForSpecial(favSeason)){
            System.out.println("Invalid Season.");
            return error;
        }
        switch(favSeason){
            case "fall":
            {
                System.out.println("got here");
                pet = "alligator";
                return pet;
            
            }
            case "spring":
            {
                pet = "ostrich";
                return pet;
            }
            case "summer":
            {
                pet = "ponie";
                return pet;
            }
            case "winter":{
                System.out.println("Whats your name?");
                String name = scan.nextLine();
                name = name.toLowerCase();
                if(checkForSpecial(name)){
                    System.out.println("Thats not a name");
                    return error;
                }
                else{
                    if("aeiou".contains(name.substring(0, 1))){
                        return pet;
                    }
                    else{
                        pet = "axolotl";
                        return pet;
                    }
                }
            }
            default:{
                System.out.println("Not a valid season.");
                return error;
            }
        }

    }
}
