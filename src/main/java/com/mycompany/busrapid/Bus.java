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

public class Bus {
    private int kapasitas;
    private ArrayList<Penumpang> penumpangList;
    public Bus(int kapasitas) {
    this.kapasitas = kapasitas;
    this.penumpangList = new ArrayList<>();
}

public int getJumlahPenumpang() {
    return this.penumpangList.size();
}

public boolean tambahPenumpang(Penumpang penumpang) {
    if (this.penumpangList.size() < this.kapasitas) {
        this.penumpangList.add(penumpang);
        return true;
    } else {
        return false;
    }
}

public boolean hapusPenumpang(String nama) {
    for (Penumpang penumpang : this.penumpangList) {
        if (penumpang.getNama().equals(nama)) {
            this.penumpangList.remove(penumpang);
            return true;
        }
    }
    return false;
}

public void berhenti(Halte halte) {
    System.out.println("Bus sampai di " + halte.getNama());
    
    ArrayList<Penumpang> turun = new ArrayList<>();
    ArrayList<Penumpang> naik = halte.getPenumpangList();
    
    // mencari penumpang yang turun
    for (Penumpang penumpang : this.penumpangList) {
        if (penumpang.getTujuan().equals(halte.getNama())) {
            turun.add(penumpang);
        }
    }
    
    // menghapus penumpang yang turun dari bus
    for (Penumpang penumpang : turun) {
        this.penumpangList.remove(penumpang);
    }
    
    // menambahkan penumpang yang naik ke dalam bus
    for (Penumpang penumpang : naik) {
        if (this.penumpangList.size() < this.kapasitas) {
            this.penumpangList.add(penumpang);
        } else {
            System.out.println("Bus sudah penuh");
            break;
        }
    }
    
    // menampilkan status bus
    System.out.println("- " + turun.size() + " Penumpang turun");
    System.out.println("- " + naik.size() + " Penumpang naik");
    System.out.println("- Jumlah penumpang : " + this.penumpangList.size() + " Penumpang");
    
    // menampilkan status penumpang di halte
    halte.updatePenumpangList();
    System.out.println(halte.toString());
    System.out.println("===========================");
}

@Override
public String toString() {
    String result = "- Penumpang : ";
    if (this.penumpangList.size() == 0) {
        result += "Tidak ada penumpang";
    } else {
        for (Penumpang penumpang : this.penumpangList) {
            result += "\n  - " + penumpang.getNama() + " (Tujuan : " + penumpang.getTujuan() + ")";
        }
    }
    return result;
}
public ArrayList<Penumpang> getPenumpangList(){
    return this.penumpangList;
}
}