/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TUGAS;

/**
 *
 * @author shafriza
 */
public class Dosen extends Pegawai {
    public int jumlahSKS;
    public int TARIF_SKS = 100000;

    public Dosen( String nip, String nama, String alamat) {
        super(nip, nama, alamat);
    }
    public void setSKS(int setSKS){
        this.jumlahSKS = setSKS;
    }
    @Override
    public int getGaji(){
        int total_gaji = jumlahSKS*TARIF_SKS;
        return total_gaji+super.getGaji();
    }

    
}

