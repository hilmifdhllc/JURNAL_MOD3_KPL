/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hilmi Fadhillah C
 */
public class PosisiKarakterGame {
    private String state = "Masukkan Perintah";
    public void gerak(String command) { //1302200124 % 3 == 0
        switch (command) {
            case "TombolS":
                this.state = "Tombol Arah Bawah Ditekan";
                break;
            case "TombolW":
                this.state = "Tombol Arah Atas Ditekan";
                break;
        }
    }
    public String getState(){
        return this.state;

    }
}
