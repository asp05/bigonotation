public class oNLogN {

    public static void main(String[] args) {
        /**
         * O(n * log(n)) Linearithmic Effortnya lebih besar dari O(n) tapi masih lebih
         * baik dari O(n2). Biasanya terjadi ketika memproses masing-masing input tanpa
         * harus membandingkannya dengan yang lain satu-persatu. Tidak seperti O(n2)
         * yang memproses dan membandingkannya masing-masing satu-persatu.
         */
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j *= 2) {
                System.out.println("ini perulangan i ke-" + i + " dan j ke-" + j);
            }
        }
    }
}
