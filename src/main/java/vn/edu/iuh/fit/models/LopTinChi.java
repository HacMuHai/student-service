package vn.edu.iuh.fit.models;

import jakarta.persistence.*;
import lombok.*;
import vn.edu.iuh.fit.enums.TietHoc;

import java.io.Serializable;
@Entity
@Table(name = "lop_tin_chis")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LopTinChi implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "maLTC")
    private Long id;
    private int soLuongToiDa;
    private int nhom;
    private boolean isLyThuyet;
    private int tietBatDau;
    private int tietKetThuc;
    private String phong;
    private String ghiChu;
    private GiaoVien giaoVien;
    private LopHocPhan lopHocPhan;
}
