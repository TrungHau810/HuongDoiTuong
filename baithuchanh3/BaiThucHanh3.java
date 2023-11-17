/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.tth.baithuchanh3;

import com.tth.PhanSo.PhanSo;
import com.tth.diem.Diem;
import com.tth.diem.DoanThang;

/**
 *
 * @author TH
 */
public class BaiThucHanh3 {

    public static void main(String[] args) {
        Diem d1 = new Diem(2, 3);
        Diem d2 = new Diem(-1, 8);
        d1.hienThi();
        d2.hienThi();
        double khoangCach = d1.khoangCach(d2);
        System.out.printf("\nKhoang cach = %.1f\n", khoangCach);
        DoanThang dt = new DoanThang(d1, d2);
        dt.hienThi();
        double doDai = dt.doDai();
        System.out.printf("\nDo dai = %.1f\n", doDai);
        dt.trungDiemDoanThang();
        PhanSo ps1 = new PhanSo(1, 2);
        PhanSo ps2 = new PhanSo(1, 2);
        ps1.hienThi();
        ps1.soSanh(ps2);
    }
}
