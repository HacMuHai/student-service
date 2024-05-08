package vn.edu.iuh.fit.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import vn.edu.iuh.fit.enums.LoaiHinhDaoTao;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LopHocRequest {
    private String tenLop;
    private LoaiHinhDaoTao loaiHinhDaoTao;
    private Long maNganh;
    private Long maKhoa;
    private Long maGVCN;
}
