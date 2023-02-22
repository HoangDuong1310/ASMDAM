package Entities;

import org.hibernate.annotations.Nationalized;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class NhanVien {
    @Id
    @GenericGenerator(name = "generator", strategy = "guid", parameters = {})
    @GeneratedValue(generator = "generator")
    @Column(name = "Id", columnDefinition = "uniqueidentifier")
    private String id;

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

    @Nationalized
    @Column(name = "GioiTinh", length = 10)
    private String gioiTinh;

    @Convert(disableConversion = true)
    @Column(name = "NgaySinh")
    private LocalDate ngaySinh;

    @Nationalized
    @Column(name = "DiaChi", length = 100)
    private String diaChi;

    @Column(name = "Sdt", length = 30)
    private String sdt;

    @Lob
    @Column(name = "MatKhau")
    private String matKhau;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdCH")
    private CuaHang idCH;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdCV")
    private ChucVu idCV;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IdGuiBC")
    private NhanVien idGuiBC;

    @Column(name = "TrangThai")
    private Integer trangThai;

    public NhanVien(String id, String ma, String ten, String tenDem, String ho, String gioiTinh, LocalDate ngaySinh, String diaChi, String sdt, String matKhau, CuaHang idCH, ChucVu idCV, NhanVien idGuiBC, Integer trangThai) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.tenDem = tenDem;
        this.ho = ho;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.matKhau = matKhau;
        this.idCH = idCH;
        this.idCV = idCV;
        this.idGuiBC = idGuiBC;
        this.trangThai = trangThai;
    }

    public NhanVien() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
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

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public CuaHang getIdCH() {
        return idCH;
    }

    public void setIdCH(CuaHang idCH) {
        this.idCH = idCH;
    }

    public ChucVu getIdCV() {
        return idCV;
    }

    public void setIdCV(ChucVu idCV) {
        this.idCV = idCV;
    }

    public NhanVien getIdGuiBC() {
        return idGuiBC;
    }

    public void setIdGuiBC(NhanVien idGuiBC) {
        this.idGuiBC = idGuiBC;
    }

    public Integer getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Integer trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "id=" + id + ", ma=" + ma + ", ten=" + ten + ", tenDem=" + tenDem + ", ho=" + ho + ", gioiTinh=" + gioiTinh + ", ngaySinh=" + ngaySinh + ", diaChi=" + diaChi + ", sdt=" + sdt + ", matKhau=" + matKhau + ", idCH=" + idCH + ", idCV=" + idCV + ", idGuiBC=" + idGuiBC + ", trangThai=" + trangThai + '}';
    }

  

}