/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dto;


/**
 *
 * @author Duong
 */
public class ProductDTO {
   private String id;
 private String Ma;
 private String Ten;

    public ProductDTO() {
    }

    public ProductDTO(String id, String Ma, String Ten) {
        this.id = id;
        this.Ma = Ma;
        this.Ten = Ten;
    }

    public String getId() {
        return id;
    }

    public String getMa() {
        return Ma;
    }

    public String getTen() {
        return Ten;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setMa(String Ma) {
        this.Ma = Ma;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    @Override
    public String toString() {
        return "ProductS{" + "id=" + id + ", Ma=" + Ma + ", Ten=" + Ten + '}';
    }

    public Object getName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
