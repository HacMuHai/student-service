package vn.edu.iuh.fit.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import vn.edu.iuh.fit.enums.LoaiHinhDaoTao;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LopHocResponse {
    private Long id;
    private String tenLop;
    private LoaiHinhDaoTao loaiHinhDaoTao;
    private Long maNganh;
    private Long maKhoa;
    private Long maGVCN;
}
