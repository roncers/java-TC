package repo.ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        

        System.out.println("Ingrese palbra");
        String str = scn.nextLine();
        boolean res = true;
        int len = str.length();

        str = str.toLowerCase();
        for(int i = 0; i < len/2 && res ; i++){
            if (str.charAt(i) != str.charAt(len-1-i)) {
                res = false;
            }
        }

        if(res){
            System.out.println(str +": Es palíndromo");
        } else {
            System.out.println(str +": No es palíndromo");
        }

        scn.close();
        
    }
}
