/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.busrapid;

import java.util.ArrayList;

/**
 *
 * @author ABMEngine
 */
public class Main {

    public static void main(String[] args) {
          // membuat objek halte
        Halte porong = new Halte("Porong");
        Halte surabaya = new Halte("Surabaya");
        Halte gresik = new Halte("Gresik");

        // membuat objek bus
        Bus bus = new Bus(20);

        // menambahkan penumpang ke dalam bus
        Penumpang p1 = new Penumpang("Agus", porong, surabaya);
        Penumpang p2 = new Penumpang("Budi", porong, gresik);
        Penumpang p3 = new Penumpang("Cici", surabaya, gresik);
        Penumpang p4 = new Penumpang("Dedi", porong, gresik);
        Penumpang p5 = new Penumpang("Eno", gresik, surabaya);
        bus.tambahPenumpang(p1);
        bus.tambahPenumpang(p2);
        bus.tambahPenumpang(p3);
        bus.tambahPenumpang(p4);
        bus.tambahPenumpang(p5);

        // menampilkan status awal bus
        System.out.println("Bus Berangkat dari PULL/Kantor");
        System.out.println("- Jumlah penumpang " + bus.getJumlahPenumpang());
        System.out.println(bus.toString());
        System.out.println("===========================");

        // berhenti di halte Porong
        System.out.println(porong.toString());
        bus.berhenti(porong);
        porong.updatePenumpangList(new ArrayList<>(bus.getPenumpangList()));
        System.out.println(bus.toString());
        System.out.println(porong.toString());
        System.out.println("===========================");

        // berhenti di halte Surabaya
        System.out.println(surabaya.toString());
        bus.berhenti(surabaya);
        surabaya.updatePenumpangList(new ArrayList(bus.getPenumpangList()));
        System.out.println(bus.toString());
        System.out.println(surabaya.toString());
        System.out.println("===========================");

        // berhenti di halte Gresik
        System.out.println(gresik.toString());
        bus.berhenti(gresik);
        gresik.updatePenumpangList(new ArrayList(bus.getPenumpangList()));
        System.out.println(bus.toString());
        System.out.println(gresik.toString());

    }
}