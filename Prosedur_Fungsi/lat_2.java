package Prosedur_Fungsi;

import java.util.Scanner;

public class lat_2 {

  public static String siswa(String nama, int umur) {
    return nama + " berumur " + umur + " tahun";
  }

  public static void main(String[] args) {
    String nm;
    int umr;
    Scanner input = new Scanner(System.in);
    System.out.print("Nama : ");
    nm = input.nextLine();
    System.out.print("Umur : ");
    umr = input.nextInt();
    System.out.println("Output : ");
    System.out.println(siswa(nm, umr));
    input.close();
  }
}
