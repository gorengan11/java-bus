/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.busrapid;

import java.util.ArrayList;

/**
 *
 * @author ABMEngine
 */
    public class Penumpang {
    private String nama;
    private Halte halteAsal;
    private Halte halteTujuan;
    private String tujuan;

    public Penumpang(String nama, Halte halteAsal, Halte halteTujuan) {
        this.nama = nama;
        this.halteAsal = halteAsal;
        this.halteTujuan = halteTujuan;
    }

    public String getNama() {
        return nama;
    }

    public Halte getHalteAsal() {
        return halteAsal;
    }

    public Halte getHalteTujuan() {
        return halteTujuan;
    }
    public String getTujuan() {
    return this.tujuan;
}
    public ArrayList<penumpang> getPenumpangList(){
        // get the list of passengers on the bus
    ArrayList<Penumpang> penumpangList = bus.getPenumpangList();
    // update the list of passengers at the current halte
    halte.updatePenumpangList(penumpangList);

    }

    private static class penumpang {

        public penumpang() {
        }
    }
}
