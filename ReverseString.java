import java.util.*; 

public class ReverseString{
    /**
    * Method that is called to reverse the inputted string
    * should be only called if the input is 1 from scanner
    * @param stringToReverse the string to be reversed inputted by the user 
    */
    public static void reverse(String stringToReverse){
        char[] arr = stringToReverse.toCharArray();
        int len = arr.length; 
        int end = len - 1;
        /**
         * 1: algorithm: kept track of front and end pointers
         * 2: swaps places
         * 3: front incremented by 1, end decremented by 1
         * note: it doesn't matter what the length of string is since my condition only swaps
         * iff front is less than end (if length is odd number, front and end will be the same
         * in the last loop where they meet together which does not satisfy the condition to swap)
         */
        
        for(int front = 0; front < end; front++, end--){
            char holder = arr[front];
            arr[front] = arr[end];
            
            arr[end] = holder;
        }
        String tostr = String.valueOf(arr);
        System.out.println(tostr); 
        
    }

        /**
         * Main to handle cases of the input
         * @param args no argument needed from user
         */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean valid = true;
        /**
         * endless loop until option 2 is inputted
         * which then boolean variable "valid" is turned false
         * and other inputs other than "1" and "2" is handled using default case
         */
        while(valid){
            
            System.out.println("Enter a number from the options below\n1: reverse a string\n2: quit");
            switch(sc.next()){
                case "1":
                    System.out.println("Enter a string to reverse");
                    reverse(sc.next());
                    break;
                case "2":
                    valid = false;
                    sc.close();
                    break;
                default:
                    System.out.println("invalid input\n");
            }

        }

        
    }
}
