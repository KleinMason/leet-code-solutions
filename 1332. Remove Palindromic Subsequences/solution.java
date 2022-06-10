public class solution {
    public int removePalindromeSub(String s) {
        if (s.equals(new StringBuilder(s).reverse().toString())) return 1;
        return 2;        
    }
}
