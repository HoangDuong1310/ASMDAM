package Entities;

import org.hibernate.annotations.Nationalized;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Entity
public class KhachHang {
    @Id
    @Column(name = "Id", nullable = false)
    private UUID id;

    @Column(name = "Ma", length = 20)
    private String ma;

    @Nationalized
    @Column(name = "Ten", length = 30)
    private String ten;

    @Nationalized
    @Column(name = "TenDem", length = 30)
    private String tenDem;

    @Nationalized
    @Column(name = "Ho", length = 30)
    private String ho;

    @Convert(disableConversion = true)
    @Column(name = "NgaySinh")
    private LocalDate ngaySinh;

    @Column(name = "Sdt", length = 30)
    private String sdt;

    @Nationalized
    @Column(name = "DiaChi", length = 100)
    private String diaChi;

    @Nationalized
    @Column(name = "ThanhPho", length = 50)
    private String thanhPho;

    @Nationalized
    @Column(name = "QuocGia", length = 50)
    private String quocGia;

    @Lob
    @Column(name = "MatKhau")
    private String matKhau;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTenDem() {
        return tenDem;
    }

    public void setTenDem(String tenDem) {
        this.tenDem = tenDem;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getThanhPho() {
        return thanhPho;
    }

    public void setThanhPho(String thanhPho) {
        this.thanhPho = thanhPho;
    }

    public String getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

}