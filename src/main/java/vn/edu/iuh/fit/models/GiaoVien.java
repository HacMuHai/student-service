package vn.edu.iuh.fit.models;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "giao_viens")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GiaoVien implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "maGV")
    private Long id;
    private String hoTen;
    private LocalDate ngaySinh;

    @ManyToOne
    private Khoa khoa;

    @OneToMany(mappedBy = "giaoVien",cascade = CascadeType.ALL)
    private List<LopHoc> lopHocs;
}
