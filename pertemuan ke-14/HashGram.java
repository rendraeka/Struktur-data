public class HashGram {
    public Long rollingHash(String sub) {
        long hash_value = 0;
        int ascii;
        int prev_hash = 0;
        int basis = 3;
        int c_awal = 0;
        int length = sub.length() - 1;
        System.out.println("k = "+sub.length());
        System.out.println("b = "+basis);
        if (prev_hash == 0) {
            for (int i = 0; i <= length; i++) {
                ascii = sub.charAt(i);
                hash_value += (long) (ascii * Math.pow(basis, length - i));
       System.out.println("c ke-"+(i+1)+" adalah huruf '"+sub.charAt(i)+"' bernilai ASCII = "+ascii);
            }
        } else {
          hash_value = prev_hash - (long) (c_awal * Math.pow(basis, length));
            hash_value *= basis;
            hash_value += sub.charAt(length);
        }
        c_awal = sub.charAt(0);
        prev_hash = (int) hash_value;
        System.out.println("Nilai hash pada kata = '"+sub+"' = "+hash_value);
        return hash_value;
    }

    public static void main(String[] args) {
        HashGram hg = new HashGram();
        String text = "STMIK Akakom";
        hg.rollingHash(text);
    }
}
