
public class FirstNonRepeatingChar {
    public static void main (String[] args){
        String str = "swiss";

        Character result = firstNonRepeatingChar(str);

        if(result == null){
            System.out.println("No non-repeated character found");
        } else{
            System.out.println(result);
        }
    }
    public static Character firstNonRepeatingChar(String str){
        int[] freq = new int[256];

        // Count frequency
        for(char ch : str.toCharArray()){
            freq[ch]++;
        }

        // Find first non-repeating character
        for(char ch: str.toCharArray()){
            if(freq[ch]==1){
                return ch;
            }
        }
        return null;
    }
}
