package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (Exception e) {
            if(args.length<1)
		    System.out.println("Please enter any amount of positive integers.");
	    else 
		    System.out.println("Error in input: wrong character"); 
        }
    }

    private static int addArguments(String[] args) {
	int result = 0;
	for(int i =0;i<args.length;i++){
		result += Integer.valueOf(args[i]);	
	}	
        return result;
    }
}
