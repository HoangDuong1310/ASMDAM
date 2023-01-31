package Entities;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

@Embeddable
public class HoaDonChiTietId implements Serializable {
    private static final long serialVersionUID = -7952500235312375463L;
    @Column(name = "IdHoaDon", nullable = false)
    private UUID idHoaDon;

    @Column(name = "IdChiTietSP", nullable = false)
    private UUID idChiTietSP;

    public UUID getIdHoaDon() {
        return idHoaDon;
    }

    public void setIdHoaDon(UUID idHoaDon) {
        this.idHoaDon = idHoaDon;
    }

    public UUID getIdChiTietSP() {
        return idChiTietSP;
    }

    public void setIdChiTietSP(UUID idChiTietSP) {
        this.idChiTietSP = idChiTietSP;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        HoaDonChiTietId entity = (HoaDonChiTietId) o;
        return Objects.equals(this.idHoaDon, entity.idHoaDon) &&
                Objects.equals(this.idChiTietSP, entity.idChiTietSP);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idHoaDon, idChiTietSP);
    }

}