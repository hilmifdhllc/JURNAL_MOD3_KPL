/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Hilmi Fadhillah C
 */
public class mainPosisiKarakterGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PosisiKarakterGame gerak = new PosisiKarakterGame();
        System.out.println(gerak.getState());
        System.out.print("Perintah : ");
        String c = input.nextLine();
        gerak.gerak(c);
        System.out.println(gerak.getState());
        System.out.print("Perintah : ");
        c = input.nextLine();
        gerak.gerak(c);
        System.out.println(gerak.getState());
        input.close();
    }
}
