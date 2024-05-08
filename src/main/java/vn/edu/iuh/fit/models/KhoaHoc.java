package vn.edu.iuh.fit.models;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "khoa_hocs")
@Builder
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class KhoaHoc implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "maKhoaHoc")
    private Long id;
    private String tenKhoaHoc;

    @OneToMany(mappedBy = "khoaHoc",cascade = CascadeType.ALL)
    private List<LopHoc> lopHocs;
}
