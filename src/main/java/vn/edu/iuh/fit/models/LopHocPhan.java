package vn.edu.iuh.fit.models;

import jakarta.persistence.*;
import lombok.*;
import vn.edu.iuh.fit.enums.HocKy;
import vn.edu.iuh.fit.enums.TrangThaiLHP;

import java.io.Serializable;

@Entity
@Table(name = "lop_hoc_phans")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LopHocPhan  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "maLHP")
    private Long id;
    private String tenLHP;
    private String namHoc;
    private HocKy hocKy;
    private TrangThaiLHP trangThaiLHP;
    private MonHoc monHoc;
}
