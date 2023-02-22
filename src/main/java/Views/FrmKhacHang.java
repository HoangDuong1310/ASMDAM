/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Views;

import Dto.KhachHangDTO;
import Services.KhachHangService;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hrska
 */
public class FrmKhacHang extends javax.swing.JFrame {
private KhachHangService service = new KhachHangService();
    /**
     * Creates new form FrmKhacHang
     */
    public FrmKhacHang() {
        initComponents();
        loadTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtInputMa = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtInputTen = new javax.swing.JTextField();
        txtInputTenDem = new javax.swing.JTextField();
        txtInputHo = new javax.swing.JTextField();
        txtInputSDT = new javax.swing.JTextField();
        txtInputDiaChi = new javax.swing.JTextField();
        txtInputThanhPho = new javax.swing.JTextField();
        txtInputQuocGia = new javax.swing.JTextField();
        txtInputMatKhau = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Khách hàng");

        jLabel2.setText("Ma");

        jLabel3.setText("Ten");

        jLabel4.setText("Tên Đệm");

        jLabel5.setText("Họ");

        jLabel6.setText("Ngày Sinh");

        jLabel7.setText("Sđt");

        jLabel8.setText("Địa Chỉ");

        jLabel9.setText("Thành Phố");

        jLabel10.setText("Quốc Gia");

        jLabel11.setText("Mật Khẩu");

        txtInputMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInputMaActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã", "Tên", "Tên Đệm", "Họ", "Ngày Sinh ", "SĐT", "Địa Chỉ", "Thành Phố", "Quốc Gia", "Mật Khẩu"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        txtInputTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInputTenActionPerformed(evt);
            }
        });

        txtInputTenDem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInputTenDemActionPerformed(evt);
            }
        });

        txtInputHo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInputHoActionPerformed(evt);
            }
        });

        txtInputSDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInputSDTActionPerformed(evt);
            }
        });

        txtInputDiaChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInputDiaChiActionPerformed(evt);
            }
        });

        txtInputThanhPho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInputThanhPhoActionPerformed(evt);
            }
        });

        txtInputQuocGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInputQuocGiaActionPerformed(evt);
            }
        });

        txtInputMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInputMatKhauActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtInputMa, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInputTen, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInputTenDem, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInputHo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtInputQuocGia, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtInputMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtInputSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtInputDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtInputThanhPho, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(86, 86, 86))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtInputMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtInputTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtInputTenDem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtInputHo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtInputSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtInputDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtInputThanhPho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtInputQuocGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtInputMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void loadTable(){
    List<KhachHangDTO> list = service.getAll();
    DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
    dtm.setRowCount(0);
    System.out.println(list.size());
    for (KhachHangDTO khachHang : list) {
        
        Object[] rowData = {
            khachHang.getMa(),
            khachHang.getTen(),
            khachHang.getTenDem(),
            khachHang.getHo(),
            khachHang.getNgaySinh(),
            khachHang.getMatKhau(),
            khachHang.getDiaChi(),
            khachHang.getThanhPho(),
            khachHang.getQuocGia()
        };
        dtm.addRow(rowData);
    }
}

private String getIDSelectRow(){
    int selectRow = jTable1.getSelectedRow();
    return jTable1.getValueAt(selectRow, 0).toString();
}

private KhachHangDTO getFormInput(){
    KhachHangDTO khachHangDTO = new KhachHangDTO();
    String ma = txtInputMa.getText();
    String ten = txtInputTen.getName();
    String tenDem = txtInputTenDem.getText();
    String ho = txtInputHo.getText();
    Date ngaySinh = jDateChooser1.getDate();
    String matKhau = txtInputMatKhau.getText();
    String diaChi = txtInputDiaChi.getText();
    String thanhPho = txtInputThanhPho.getText();
    String quocGia = txtInputQuocGia.getText();
    
    khachHangDTO.setMa(ma);
    khachHangDTO.setTen(ten);
    khachHangDTO.setTenDem(tenDem);
    khachHangDTO.setHo(ho);
    khachHangDTO.setNgaySinh(ngaySinh);
    khachHangDTO.setMatKhau(matKhau);
    khachHangDTO.setDiaChi(diaChi);
    khachHangDTO.setThanhPho(thanhPho);
    khachHangDTO.setQuocGia(quocGia);
    return khachHangDTO;
}
    private void txtInputMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInputMaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInputMaActionPerformed

    private void txtInputTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInputTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInputTenActionPerformed

    private void txtInputTenDemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInputTenDemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInputTenDemActionPerformed

    private void txtInputHoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInputHoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInputHoActionPerformed

    private void txtInputSDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInputSDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInputSDTActionPerformed

    private void txtInputDiaChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInputDiaChiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInputDiaChiActionPerformed

    private void txtInputThanhPhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInputThanhPhoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInputThanhPhoActionPerformed

    private void txtInputQuocGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInputQuocGiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInputQuocGiaActionPerformed

    private void txtInputMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInputMatKhauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInputMatKhauActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
     
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtInputDiaChi;
    private javax.swing.JTextField txtInputHo;
    private javax.swing.JTextField txtInputMa;
    private javax.swing.JTextField txtInputMatKhau;
    private javax.swing.JTextField txtInputQuocGia;
    private javax.swing.JTextField txtInputSDT;
    private javax.swing.JTextField txtInputTen;
    private javax.swing.JTextField txtInputTenDem;
    private javax.swing.JTextField txtInputThanhPho;
    // End of variables declaration//GEN-END:variables
}
