import java.util.*; 

public class string{
    public static void reverse(String str1){
        char[] arr = str1.toCharArray();
        //List<Character> arr = new ArrayList<Character>(Arrays.asList(str1.split("")));
        //System.out.println(arr);
        
        int len = arr.length;
        
        
        int tracker2 = len - 1;
        for(int i = 0; i <= len/2; i++){
            char holder = arr[i];
            arr[i] = arr[tracker2];
            
            arr[tracker2] = holder;
        
            tracker2--;

        }
        String tostr = String.valueOf(arr);
        System.out.println(tostr); 
    }
    public static void main(String[] args){
        //System.out.print(typeof(args[0]));
        if(args.length == 0){
            System.out.print("please enter a argument");
           
        }
        else{
            reverse(args[0]);
        }
        
    }
}
