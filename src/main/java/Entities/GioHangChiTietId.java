package Entities;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class GioHangChiTietId implements Serializable {
    private static final long serialVersionUID = 7683475131705805993L;
    @Column(name = "IdGioHang", nullable = false)
    private String idGioHang;

    @Column(name = "IdChiTietSP", nullable = false)
    private String idChiTietSP;

    public String getIdGioHang() {
        return idGioHang;
    }

    public void setIdGioHang(String idGioHang) {
        this.idGioHang = idGioHang;
    }

    public String getIdChiTietSP() {
        return idChiTietSP;
    }

    public void setIdChiTietSP(String idChiTietSP) {
        this.idChiTietSP = idChiTietSP;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        GioHangChiTietId entity = (GioHangChiTietId) o;
        return Objects.equals(this.idChiTietSP, entity.idChiTietSP) &&
                Objects.equals(this.idGioHang, entity.idGioHang);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idChiTietSP, idGioHang);
    }

}