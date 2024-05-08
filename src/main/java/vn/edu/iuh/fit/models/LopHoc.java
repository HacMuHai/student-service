package vn.edu.iuh.fit.models;

import jakarta.persistence.*;
import lombok.*;
import vn.edu.iuh.fit.enums.LoaiHinhDaoTao;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "lop_hocs")
@Builder
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class LopHoc implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "maLop")
    private Long id;
    private String tenLop;
    @Enumerated(EnumType.ORDINAL)
    private LoaiHinhDaoTao loaiHinhDaoTao;

    @OneToMany(mappedBy = "lopHoc", cascade = CascadeType.ALL)
    private List<SinhVien> sinhViens;

    @ManyToOne
    private GiaoVien giaoVien;
    @ManyToOne
    private KhoaHoc khoaHoc;
    @ManyToOne
    private NganhHoc nganhHoc;
}
