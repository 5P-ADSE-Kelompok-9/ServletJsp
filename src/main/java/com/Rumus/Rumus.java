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
    public static void main(String[] args) {
        int panjang = 10;
        int lebar = 5;
        System.out.println("Luas Persegi Panjang: " + luasPersegiPanjang(panjang, lebar));
        System.out.println("Keliling Persegi Panjang: " + kelilingPersegiPanjang(panjang, lebar));
        System.out.println("Kuadrat Persegi Panjang: " + Kuadrat(panjang, lebar));
        System.out.println("Apakah Persegi? " + validatePersegi(panjang, lebar));
    }
}
