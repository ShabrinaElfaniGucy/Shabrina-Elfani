import java.util.ArrayList;

public class nomor5c {
    public static void main(String[] args) throws Exception {
        //String[] nama = {"G","U","C","Y"}
        ArrayList <String> nama = new ArrayList <String>();
        nama.add("G");
        nama.add("U");
        nama.add("C");
        nama.add("Y");

        System.out.println("ArrayList sebelum remove:");
        for(String var: nama){
            System.out.println(var);
        }
        //Tentukan hasil yang didapatkan ketika dilakukan perintah remove(0)

        nama.remove(2);
        System.out.println("ArrayList setelah remove:");
        for(String var2: nama){
            System.out.println(var2);
        }
    }
}