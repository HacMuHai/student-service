package vn.edu.iuh.fit.models;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "khoa")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Khoa implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "maKhoa")
    private Long id;
    private String tenKhoa;

    @OneToMany(mappedBy = "khoa",cascade = CascadeType.ALL)
    private List<GiaoVien> giaoViens;

    @OneToMany(mappedBy = "khoa",cascade = CascadeType.ALL)
    private List<NganhHoc> nganhHocs;
}
