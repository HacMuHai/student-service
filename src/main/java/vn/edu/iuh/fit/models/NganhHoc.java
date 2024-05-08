package vn.edu.iuh.fit.models;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Entity
@Table(name = "nganh_hocs")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NganhHoc implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "maNganh")
    private Long id;
    private String tenNganh;

    @ManyToOne
    private Khoa khoa;
}
