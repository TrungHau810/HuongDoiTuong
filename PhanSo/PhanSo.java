/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tth.PhanSo;

/**
 *
 * @author TH
 */
public class PhanSo {

    private int tuSo;
    private int mauSo;
    private static int soLuongPhanSo = 0;

    public PhanSo() {
        this.tuSo = 0;
        this.mauSo = 1;
    }

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public static int timUCLN(int a, int b) {
        if (a == 0 || b == 0) {
            return a + b;
        }
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    public void hienThi() {
        System.out.printf("%d/%d", this.getTuSo(), this.getMauSo());
    }

    public void rutGonPS() {
        int ucln = timUCLN(this.tuSo, this.mauSo);
        this.tuSo /= ucln;
        this.mauSo = this.mauSo / ucln;
    }

    public void congPS(PhanSo ps) {
        int newTuSo = (int) (this.tuSo * ps.mauSo) + (ps.tuSo * this.mauSo);
        int newMauSo = (this.mauSo * ps.mauSo);
        this.tuSo = newTuSo;
        this.mauSo = newMauSo;
        this.rutGonPS();
    }

    public void truPS(PhanSo ps) {
        int newTuSo = (this.tuSo * ps.mauSo) - (ps.tuSo * this.mauSo);
        int newMauSo = (this.mauSo * ps.mauSo);
        this.tuSo = newTuSo;
        this.mauSo = newMauSo;
        this.rutGonPS();
    }

    public void nhanPS(PhanSo ps) {
        int newTuSo = this.tuSo * ps.tuSo;
        int newMauSo = this.mauSo * ps.mauSo;
        this.tuSo = newTuSo;
        this.mauSo = newMauSo;
        this.rutGonPS();
    }

    public void chiaPS(PhanSo ps) {
        int newTuSo = this.tuSo * ps.mauSo;
        int newMauSo = this.mauSo * ps.tuSo;
        this.tuSo = newTuSo;
        this.mauSo = newMauSo;
        this.rutGonPS();
    }

    public void soSanh(PhanSo ps){
        int tuSo1 = this.tuSo*ps.mauSo;
        int tuSo2 = ps.tuSo*this.mauSo;
        if(tuSo1>tuSo2){
//            System.out.printf("%d/%d > %d/%d", this.tuSo,this.mauSo,ps.tuSo,ps.mauSo);
            this.hienThi();
            System.out.print(" > ");
            ps.hienThi();
        }
        else{
            if(tuSo1<tuSo2){
                this.hienThi();
            System.out.print(" < ");
            ps.hienThi();
            }
            else{
                this.hienThi();
            System.out.print(" = ");
            ps.hienThi();
            }
        }
    }
    public int getTuSo() {
        return tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    /**
     * @return the soLuongPhanSo
     */
    public static int getSoLuongPhanSo() {
        return soLuongPhanSo;
    }

    /**
     * @param aSoLuongPhanSo the soLuongPhanSo to set
     */
    public static void setSoLuongPhanSo(int aSoLuongPhanSo) {
        soLuongPhanSo = aSoLuongPhanSo;
    }

}
