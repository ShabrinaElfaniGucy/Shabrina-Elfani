import java.util.ArrayList;

public class nomor3 {
    //Tentukan hasil yang didapatkan ketika dilakukan perintah get(0), get(2), get(6), get(-3)
    public static void main(String[] args) throws Exception {
    //String[] nama = {"G","U","C","Y"};
    ArrayList< String > nama = new ArrayList< String > ();
    nama.add("G");  
    nama.add("U");
    nama.add("C");
    nama.add("Y");  
    
    System.out.println(nama.get (0));
    System.out.println(nama.get (2));
    System.out.println(nama.get (6));
    System.out.println(nama.get (-3));
    }
}
