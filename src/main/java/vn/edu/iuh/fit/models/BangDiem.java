package vn.edu.iuh.fit.models;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Table(name = "giao_viens")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BangDiem implements Serializable {
    @Id
    @ManyToOne
    private SinhVien sinhVien;

    @Id
    @ManyToOne
    private LopHocPhan lopHocPhan;

    private float diemThuongKy1;
    private float diemThuongKy2;
    private float diemThuongKy3;
    private float diemThucHanh1;
    private float diemThucHanh2;
    private float diemThucHanh3;
    private float diemGK;
    private float diemGKChuyenCan;
    private float diemCuoiKy;
}
