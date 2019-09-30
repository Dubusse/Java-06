public class Classroom {

    public static void main(String[] args) {

        
        Wilder Leo  = new Wilder(" Leo ", true); 
        // utilisation de getters      
        System.out.println( Leo.WhoAmI());
        
        Wilder Jason  = new Wilder (" Jason ", false);  
        System.out.println(Jason.WhoAmI());
        
    }
}

