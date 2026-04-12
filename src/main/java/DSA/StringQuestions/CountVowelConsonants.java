public class CountVowelConsonants {
    public static void main (String[] args){
        String str = "aeiou d d";
        String strLowerCase = str.toLowerCase();
        int vowels=0, consonants = 0;

        for(char ch :strLowerCase.toCharArray()){
            if(ch == 'a' || ch == 'e' || ch =='i' || ch == 'o' || ch == 'u' ){
                vowels ++;
            }
            else if (ch == ' '){
                continue;
            }
            else{
                consonants++;
            }

        }

        System.out.println("Vowerls are: " + vowels + " Consonants are: " + consonants);
    }
}
