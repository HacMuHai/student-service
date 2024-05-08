package vn.edu.iuh.fit.models;

import jakarta.persistence.*;
import lombok.*;
import vn.edu.iuh.fit.enums.LoaiSinhVien;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "sinh_viens")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SinhVien implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mssv")
    private long id;
    private String hoTen;
    private LocalDate ngaySinh;
    private String urlImage;
    private LoaiSinhVien loaiSinhVien;
    private boolean isMale;

    @ManyToOne
    private LopHoc lopHoc;
}
