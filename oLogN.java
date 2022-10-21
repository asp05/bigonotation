class OlogN {
    public static void main(String[] args) {
        /**
         * Logarithmic Time Algorithms atau O(log n) berarti tingkat kompleksitas akan
         * berbanding lurus dengan log dari banyaknya jumlah data. Apabila ada algoritma
         * dengan komplesitas ini maka algoritma yang digunakan sangat bagus.
         * 
         * Logarithmic Time artinya ketika kita memberikan input sebesar n terhadap
         * sebuah fungsi, jumlah tahapan yang dilakukan oleh fungsi tersebut berkurang
         * berdasarkan suatu faktor.
         * 
         * contoh :
         */
        int n = 17;
        for (int i = 1; i < n; i = i * 2) {
            System.out.println("Hey there!" + i);
        }
    }

}