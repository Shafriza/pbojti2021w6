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
public class MainTugas {
    public static void main(String[] args) {
    Dosen dosen1 = new Dosen("1001", "Shafriza", "Nganjuk");
    dosen1.setSKS(12);
    
    Pegawai pegawai1 = new Pegawai();
    pegawai1.nama = "mario";
    
        DaftarGaji dg = new DaftarGaji(2);
        dg.addPegawai(dosen1);
        dg.addPegawai(pegawai1);
        dg.printSemuaGaji();
    }
    
}
