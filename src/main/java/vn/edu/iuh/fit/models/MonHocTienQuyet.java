package vn.edu.iuh.fit.models;

import jakarta.persistence.*;
import lombok.*;
import vn.edu.iuh.fit.enums.LoaiTienQuyet;

import java.io.Serializable;

@Entity
@Table(name = "mon_hoc_tien_quyets")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MonHocTienQuyet implements Serializable {
    @Id
    @ManyToOne
    @JoinColumn(name = "maMonHoc")
    private MonHoc monHoc;
    @Id
    @ManyToOne
    @JoinColumn(name = "maMonTienQuyet")
    private MonHoc monHocTienQuyet;
    @Enumerated(EnumType.ORDINAL)
    private LoaiTienQuyet loaiTienQuyet;
}
