import java.util.ArrayList;

public class nomor4 {
    //Tentukan hasil yang didapatkan ketika dilakukan perintah indexOf(a), indexOf(c), indexOf(q)
    public static void main(String[] args) throws Exception {
    //String[] nama = {"G","U","C","Y"};
    ArrayList <String> nama = new ArrayList<String>();
    nama.add("G"); 
    nama.add("U"); 
    nama.add("C");
    nama.add("Y");

    System.out.println(nama.indexOf("a"));
    System.out.println(nama.indexOf("c"));
    System.out.println(nama.indexOf("q"));

    }
}
