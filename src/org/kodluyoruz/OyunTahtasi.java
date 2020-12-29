package org.kodluyoruz;
import java.util.Scanner;
public class OyunTahtasi {
    public Scanner=boyutAl;
    public static int boyut;
    char[][] board=new char[boyut][boyut];
    public OyunTahtasi(){
        // Board arrayini oluşturuyoruz.
        for(int i=0; i<=boyut; i++){
            for(int j=0; j<=boyut; j++){
            }
        }
    }
    //Board arrayi içine
    public OyunTahtasi(char[][] OynTahtasi){
        for(int i=0; i<boyut; i++){
            for(int j=0; j<boyut; j++){
                board[i][j]=OynTahtasi[i][j];
            }
        }
        oyunTahtasiGoster();
    }

    public char [][] oyunTahtasiAl(){
        boyutAl = new Scanner(System.in);
        System.out.println("3 ile 7 arasında tahta büyüklüğünü girin: ");
        boyut=boyutAl.nextInt();
        if(boyut<3 && boyut>7){
            oyunTahtasiAl();
        }
        char[][] tahta =new char [boyut][boyut];
        for(int i=0; i<boyut; i++){
            for(int j=0; j<boyut; j++){
                tahta[i][j]="_";
                board=tahta;

            }
        }
        return tahta;


    }
}

    }



            }