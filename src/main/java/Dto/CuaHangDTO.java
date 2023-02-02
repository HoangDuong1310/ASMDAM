/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dto;

/**
 *
 * @author hrska
 */
public class CuaHangDTO {
    private String id;
    private String ma;
    private String ten;
    private String DiaChi;
    private String ThanhPho;
    private String QuocGia;

    public CuaHangDTO() {
    }

    public CuaHangDTO(String id, String ma, String ten, String DiaChi, String ThanhPho, String QuocGia) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.DiaChi = DiaChi;
        this.ThanhPho = ThanhPho;
        this.QuocGia = QuocGia;
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

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getThanhPho() {
        return ThanhPho;
    }

    public void setThanhPho(String ThanhPho) {
        this.ThanhPho = ThanhPho;
    }

    public String getQuocGia() {
        return QuocGia;
    }

    public void setQuocGia(String QuocGia) {
        this.QuocGia = QuocGia;
    }

    @Override
    public String toString() {
        return "CuaHangDTO{" + "id=" + id + ", ma=" + ma + ", ten=" + ten + ", DiaChi=" + DiaChi + ", ThanhPho=" + ThanhPho + ", QuocGia=" + QuocGia + '}';
    }
    
    
    
}
