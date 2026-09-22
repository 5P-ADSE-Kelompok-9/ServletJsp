package com.Rumus;

public class Rumus {
    public static int luasPersegiPanjang(int panjang,int  lebar){
        int luas  = panjang*lebar;
        return luas;
    }
    public static int kelilingPersegiPanjang(int panjang,int  lebar){
        int keliling = 2*(panjang+lebar);
        return keliling;
    }
    public static boolean validatePersegi(int panjang,int lebar){
        if(panjang == lebar){
            return true;
        }else{
            return false;
        }
    }
    public static int Kuadrat(int panjang, int lebar){
        int kuadrat = panjang*lebar;
        return kuadrat;
    }
}
