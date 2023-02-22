package Entities;

import org.hibernate.annotations.Nationalized;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class HoaDon {
    @Id
    @GenericGenerator(name = "generator", strategy = "guid", parameters = {})
    @GeneratedValue(generator = "generator")
    @Column(name = "Id", columnDefinition = "uniqueidentifier")
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdKH")
    private KhachHang idKH;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdNV")
    private NhanVien idNV;

    @Column(name = "Ma", length = 20)
    private String ma;

    @Convert(disableConversion = true)
    @Column(name = "NgayTao")
    private LocalDate ngayTao;

    @Convert(disableConversion = true)
    @Column(name = "NgayThanhToan")
    private LocalDate ngayThanhToan;

    @Convert(disableConversion = true)
    @Column(name = "NgayShip")
    private LocalDate ngayShip;

    @Convert(disableConversion = true)
    @Column(name = "NgayNhan")
    private LocalDate ngayNhan;

    @Column(name = "TinhTrang")
    private Integer tinhTrang;

    @Nationalized
    @Column(name = "TenNguoiNhan", length = 50)
    private String tenNguoiNhan;

    @Nationalized
    @Column(name = "DiaChi", length = 100)
    private String diaChi;

    @Column(name = "Sdt", length = 30)
    private String sdt;

    public HoaDon() {
    }

    public HoaDon(String id, KhachHang idKH, NhanVien idNV, String ma, LocalDate ngayTao, LocalDate ngayThanhToan, LocalDate ngayShip, LocalDate ngayNhan, Integer tinhTrang, String tenNguoiNhan, String diaChi, String sdt) {
        this.id = id;
        this.idKH = idKH;
        this.idNV = idNV;
        this.ma = ma;
        this.ngayTao = ngayTao;
        this.ngayThanhToan = ngayThanhToan;
        this.ngayShip = ngayShip;
        this.ngayNhan = ngayNhan;
        this.tinhTrang = tinhTrang;
        this.tenNguoiNhan = tenNguoiNhan;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public KhachHang getIdKH() {
        return idKH;
    }

    public void setIdKH(KhachHang idKH) {
        this.idKH = idKH;
    }

    public NhanVien getIdNV() {
        return idNV;
    }

    public void setIdNV(NhanVien idNV) {
        this.idNV = idNV;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public LocalDate getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(LocalDate ngayTao) {
        this.ngayTao = ngayTao;
    }

    public LocalDate getNgayThanhToan() {
        return ngayThanhToan;
    }

    public void setNgayThanhToan(LocalDate ngayThanhToan) {
        this.ngayThanhToan = ngayThanhToan;
    }

    public LocalDate getNgayShip() {
        return ngayShip;
    }

    public void setNgayShip(LocalDate ngayShip) {
        this.ngayShip = ngayShip;
    }

    public LocalDate getNgayNhan() {
        return ngayNhan;
    }

    public void setNgayNhan(LocalDate ngayNhan) {
        this.ngayNhan = ngayNhan;
    }

    public Integer getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(Integer tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public String getTenNguoiNhan() {
        return tenNguoiNhan;
    }

    public void setTenNguoiNhan(String tenNguoiNhan) {
        this.tenNguoiNhan = tenNguoiNhan;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "id=" + id + ", idKH=" + idKH + ", idNV=" + idNV + ", ma=" + ma + ", ngayTao=" + ngayTao + ", ngayThanhToan=" + ngayThanhToan + ", ngayShip=" + ngayShip + ", ngayNhan=" + ngayNhan + ", tinhTrang=" + tinhTrang + ", tenNguoiNhan=" + tenNguoiNhan + ", diaChi=" + diaChi + ", sdt=" + sdt + '}';
    }

   

}