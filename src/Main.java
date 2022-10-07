import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        File file = new File("src\\a.txt");
        File fileW = new File("src\\cincoA.txt");
        try {
            RandomAccessFile rafW = new RandomAccessFile(fileW, "rw");
            RandomAccessFile rafR = new RandomAccessFile(file, "r");

            /*
            Mejor que lo lea en entero porque
            si recoge los bytes y se mueve a la siguiente posición se moverá a donde necesitamos
            En cambio, si lo hacemos con Char machacará la segunda posición del byte[] que lo compone
             */


            int apoyo = 0;
            int a;
            int j = 0;
            int i = 0;

            while ((a = rafR.read()) != -1) {
                rafW.write(a);
                if(a != 10) {


                        rafW.write(a);




                }

              while((apoyo = rafW.read()) != -1){
                  if (apoyo > a || apoyo == 0){
                      rafW.write(apoyo);
                      rafW.write(a);
                  }
              }




            }
















/*
            while (j >= 0 ) {
                i= rafW.readByte();
                rafR.seek(j);
                int a = rafR.read();
                apoyo = rafW.read();
                if(a == apoyo){

                }
                if((j%2) != 0){

                    byte[] ff = "\n".getBytes();
                    rafW.writeByte(ff[0]);
                    j++;


                }

                    rafW.write(a);
                    j++;

            }
*/
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}