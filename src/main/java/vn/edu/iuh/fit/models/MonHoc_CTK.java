package vn.edu.iuh.fit.models;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
@Entity
@Table(name = "mon_hoc_CTKs")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MonHoc_CTK implements Serializable {
    @Id
    @ManyToOne
    @JoinColumn(name = "maCTK")
    private ChuongTrinhKhung chuongTrinhKhung;
    @Id
    @ManyToOne
    @JoinColumn(name = "maMonHoc")
    private MonHoc monHoc;

    private int hocKi;
    private boolean isBatBuoc;

}
