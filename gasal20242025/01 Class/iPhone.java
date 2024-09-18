class iPhone {
    // Properties
    /*
     * warna/color
     * storage/kapasistas penyimpanan
     */
    String color;
    String storage;

    // Methods
    /*
     * 1. Konstraktor() --> fungsinya sama dengan nama class
     *    kalau class iPhone --> iPhone(parameter parameter input)
     * 2. getColor()
     * 3. getStorage()
     */

    // Konstraktor
    /*
     * jadi setiap objek yang dibentuk dari class harus memberikan nilai/value
     * terhadap beberapa properties
     */
    iPhone(String color, String storage) {
        this.color = color;
        this.storage = storage;
    }

    // public -> bisa diakses dari umum
    // string --> output dari method getColor tipe datanya string
    // getColor() --> adalah nama method
    // return --> karena di definisi method ada outputnya, maka di dalam method harus
    // menggunakan return supaya punya keluaran/output.
    public String getColor() {
        return this.color;
    }

    public String getStorage() {
        return this.storage;
    }
}