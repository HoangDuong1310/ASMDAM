/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Duong
 */
@Entity
@Table(name = "SanPham")
public class ProductS implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @Column
    private String Ma;
    @Column
    private String Ten;

    public ProductS() {
    }

    public ProductS(String id, String Ma, String Ten) {
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

}
