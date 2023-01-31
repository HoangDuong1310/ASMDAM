package Entities;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class GioHangChiTiet {
    @EmbeddedId
    private GioHangChiTietId id;

    @MapsId("idGioHang")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IdGioHang", nullable = false)
    private GioHang idGioHang;

    @MapsId("idChiTietSP")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "IdChiTietSP", nullable = false)
    private ChiTietSP idChiTietSP;

    @Column(name = "SoLuong")
    private Integer soLuong;

    @Column(name = "DonGia", precision = 20)
    private BigDecimal donGia;

    @Column(name = "DonGiaKhiGiam", precision = 20)
    private BigDecimal donGiaKhiGiam;

    public GioHangChiTietId getId() {
        return id;
    }

    public void setId(GioHangChiTietId id) {
        this.id = id;
    }

    public GioHang getIdGioHang() {
        return idGioHang;
    }

    public void setIdGioHang(GioHang idGioHang) {
        this.idGioHang = idGioHang;
    }

    public ChiTietSP getIdChiTietSP() {
        return idChiTietSP;
    }

    public void setIdChiTietSP(ChiTietSP idChiTietSP) {
        this.idChiTietSP = idChiTietSP;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public BigDecimal getDonGia() {
        return donGia;
    }

    public void setDonGia(BigDecimal donGia) {
        this.donGia = donGia;
    }

    public BigDecimal getDonGiaKhiGiam() {
        return donGiaKhiGiam;
    }

    public void setDonGiaKhiGiam(BigDecimal donGiaKhiGiam) {
        this.donGiaKhiGiam = donGiaKhiGiam;
    }

}