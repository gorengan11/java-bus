/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.busrapid;

/**
 *
 * @author ABMEngine
 */
import java.util.ArrayList;

public class Halte {
    private String nama;
    private ArrayList<Penumpang> penumpangList = new ArrayList<>();

    public Halte(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public ArrayList<Penumpang> getPenumpangList() {
        return this.penumpangList;
    }
    public void berhenti(Halte halte) {
        System.out.println("Bus berhenti di halte " + halte.getNama());
        hapusPenumpang(halte);
        halte.updatePenumpangList(penumpangList);
        tambahPenumpang(halte);
    }

    public void updatePenumpangList(ArrayList<Penumpang> penumpangList) {
    ArrayList<Penumpang> penumpangList = new ArrayList<>();
    // kode untuk menambahkan penumpang ke dalam penumpangList
    this.updatePenumpangList(penumpangList);
    this.penumpangList = penumpangList;
    }
    
    public void tambahPenumpang(Penumpang penumpang) {
        penumpangList.add(penumpang);
    }

    @Override
    public String toString() {
        String str = "Halte " + nama + ": ";
        if (penumpangList.size() == 0) {
            str += "tidak ada penumpang";
        } else {
            str += "daftar penumpang: \n";
            for (Penumpang penumpang : penumpangList) {
                str += penumpang.toString() + "\n";
            }
        }
        return str;
    }
}
