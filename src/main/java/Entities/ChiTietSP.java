package Entities;

import org.hibernate.annotations.Nationalized;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
public class ChiTietSP {
    @Id
    @Column(name = "Id", nullable = false)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdSP")
    private Product idSP;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdNsx")
    private Nsx idNsx;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdMauSac")
    private MauSac idMauSac;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdDongSP")
    private DongSP idDongSP;

    @Column(name = "NamBH")
    private Integer namBH;

    @Nationalized
    @Column(name = "MoTa", length = 50)
    private String moTa;

    @Column(name = "SoLuongTon")
    private Integer soLuongTon;

    @Column(name = "GiaNhap", precision = 20)
    private BigDecimal giaNhap;

    @Column(name = "GiaBan", precision = 20)
    private BigDecimal giaBan;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Product getIdSP() {
        return idSP;
    }

    public void setIdSP(Product idSP) {
        this.idSP = idSP;
    }

    public Nsx getIdNsx() {
        return idNsx;
    }

    public void setIdNsx(Nsx idNsx) {
        this.idNsx = idNsx;
    }

    public MauSac getIdMauSac() {
        return idMauSac;
    }

    public void setIdMauSac(MauSac idMauSac) {
        this.idMauSac = idMauSac;
    }

    public DongSP getIdDongSP() {
        return idDongSP;
    }

    public void setIdDongSP(DongSP idDongSP) {
        this.idDongSP = idDongSP;
    }

    public Integer getNamBH() {
        return namBH;
    }

    public void setNamBH(Integer namBH) {
        this.namBH = namBH;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public Integer getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(Integer soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public BigDecimal getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(BigDecimal giaNhap) {
        this.giaNhap = giaNhap;
    }

    public BigDecimal getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(BigDecimal giaBan) {
        this.giaBan = giaBan;
    }

}