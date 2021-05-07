import java.util.Arrays;

public class MainAnagrama {

    public static boolean isAnagram(String s1, String s2) {

        if ( s1.length() != s2.length() ) {
            System.out.println("NÃO É UM ANAGRAMA");
            return false;
        }else {
            System.out.println("É UM ANAGRAMA");
        }

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        String sc1 = new String(c1);
        String sc2 = new String(c2);
        return sc1.equals(sc2);
    }

    public static void main(String[] args) {
        isAnagram("AMOR","ROMA");
    }
}
