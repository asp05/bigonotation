public class o2n {
    public static void main(String[] args) {
        /**
         * O(2n) Exponential Effort operasinya bertambah 2 kali lebih besar setiap
         * pertambahan total input. Untuk lebih jelasnya liat contohnya aja, gw juga
         * bingung mendefinisikannya
         */

        int n = 4;
        for (int i = 1; i <= Math.pow(2, n); i++) {
            System.out.println("ini adalah data ke-" + i);
        }

    }
}
