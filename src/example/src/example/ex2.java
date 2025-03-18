package example;
public class ex2 {
    public static void main(String args[]) {
        String itemCode = "003"; 
        
        String num = switch(itemCode) {
            case "001" -> "Item 1";    
            case "002" -> "Item 2";    
            case "003" -> "Item 3";    
            default -> "Unknown Item"; 
        };
        
       
        System.out.println("The item is: " + num); 
    }
}
