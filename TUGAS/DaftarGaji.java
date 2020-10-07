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
public class DaftarGaji {
    public Pegawai[] listPegawai;
    public int jmlPegawai = 0;
    
    DaftarGaji(int jml){
        this.listPegawai= new Pegawai[jml];
    }
    public void addPegawai(Pegawai pegawai){
        listPegawai[jmlPegawai] = pegawai;
        jmlPegawai++;
    }
    public void printSemuaGaji(){
        for (int i=0;i<jmlPegawai;i++){
            System.out.print(listPegawai[i].getNama()+" mendapatkan gaji ");
            System.out.println(listPegawai[i].getGaji());
        }
    }
}