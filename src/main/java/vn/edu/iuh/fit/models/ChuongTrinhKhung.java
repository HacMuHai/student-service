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
public class ChuongTrinhKhung implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "maCTK")
    private Long id;

    private NganhHoc nganhHoc;
    private KhoaHoc khoaHoc;
}
