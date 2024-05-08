package vn.edu.iuh.fit.models;

import jakarta.persistence.*;
import lombok.*;
import vn.edu.iuh.fit.enums.TrangThaiSvLHP;

import java.io.Serializable;

@Entity
@Table(name = "giao_viens")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SinhVien_LHP implements Serializable {
    @Id
    @ManyToOne
    private SinhVien sinhVien;

    @Id
    @ManyToOne
    private LopHocPhan lopHocPhan;

    private TrangThaiSvLHP trangThaiSvLHP;
    private boolean isChinh;


}
