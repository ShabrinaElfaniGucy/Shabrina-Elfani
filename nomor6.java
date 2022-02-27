import java.util.ArrayList;

public class nomor6 {
    public static void main(String[] args) throws Exception {
    //String[] nama = {"G","U","C","Y"};
    ArrayList <String> nama = new ArrayList <String>();
    nama.add("G");     
    nama.add("U");
    nama.add("C");
    nama.add("Y");

    nama.add(0,"e");
    System.out.println("Element setelah menambahkan string e" + nama);

    nama.add(2,"f"); 
    System.out.println("Element setelah menambahkan string f" + nama);

    nama.add(3,"g"); 
    System.out.println("Element setelah menambahkan string g" + nama);

    nama.add(4,"h"); 
    System.out.println("Element setelah menambahkan string h" + nama);

    nama.add(6,"h"); 
    System.out.println("Element setelah menambahkan string h" + nama);

    nama.add(-3,"j"); 
    System.out.println("Element setelah menambahkan string j" + nama);
  
  }
}
