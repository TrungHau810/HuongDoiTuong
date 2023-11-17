/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tth.diem;

/**
 *
 * @author TH
 */
public class DoanThang {

    private Diem diemDau;
    private Diem diemCuoi;

    public DoanThang(Diem diemDau, Diem diemCuoi) {
        this.diemDau = diemDau;
        this.diemCuoi = diemCuoi;
    }

    public void hienThi() {
        System.out.printf("[(%.1f;%.1f),(%.1f;%.1f)]",
                this.diemDau.getHoanhDo(),
                this.diemDau.getTungDo(),
                this.diemCuoi.getHoanhDo(),
                this.diemCuoi.getTungDo());
    }
    public double doDai(){
        return this.diemDau.khoangCach(this.diemCuoi);
    }
    public void trungDiemDoanThang(){
        double x = (this.diemDau.getHoanhDo()+this.diemCuoi.getHoanhDo())/2;
        double y = (this.diemDau.getTungDo()+this.diemCuoi.getTungDo())/2;
        System.out.printf("Toa do trung diem doan thang: (%.1f;%.1f)\n", x,y);
    }
    public Diem getDiemDau() {
        return diemDau;
    }

    public Diem getDiemCuoi() {
        return diemCuoi;
    }

    /**
     * @param diemDau the diemDau to set
     */
    public void setDiemDau(Diem diemDau) {
        this.diemDau = diemDau;
    }

    /**
     * @param diemCuoi the diemCuoi to set
     */
    public void setDiemCuoi(Diem diemCuoi) {
        this.diemCuoi = diemCuoi;
    }
}
