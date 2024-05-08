package vn.edu.iuh.fit.models;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Table(name = "mon_hocs")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MonHoc implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "maMonHoc")
    private Long id;
    private String tenMon;
    private int soChiLT;
    private int soChiTH;

    private Khoa khoa;

}
