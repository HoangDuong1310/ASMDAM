package Dto;

import java.util.UUID;

public class MauSacDTO {
    private String id;
    private String ma;
    private String ten;

    public String getId() {
        return id;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public MauSacDTO(String id, String ma, String ten) {
        this.id = String.valueOf(id);
        this.ma = ma;
        this.ten = ten;
    }

    public MauSacDTO() {
    }

    @Override
    public String toString() {
        return "FromMauSac{" +
                "id=" + id +
                ", ma='" + ma + '\'' +
                ", ten='" + ten + '\'' +
                '}';
    }
}
