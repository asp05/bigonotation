public class on2 {
    public static void main(String[] args) {
        /**
         * O(n2) alias O(n * n) Quadratic berarti effort yang dibutuhkan lebih besar dua
         * kali lipat daripada O(n). Semakin besar total input, semakin lebih besar lagi
         * effort yang dibutuhkan hingga dua kali lipat. Jika total inputnya 2 maka
         * total operasinya nanti 4, jika total inputnya 6 maka total operasinya 36, dan
         * seterusnya.
         */
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println("ini perulangan i ke-" + i + " dan j ke-" + j);
            }
        }
    }
}
