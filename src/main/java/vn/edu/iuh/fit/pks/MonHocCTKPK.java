package vn.edu.iuh.fit.pks;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class MonHocCTKPK {
    private long monHoc;
    private long chuongTrinhKhung;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MonHocCTKPK that = (MonHocCTKPK) o;
        return monHoc == that.monHoc && chuongTrinhKhung == that.chuongTrinhKhung;
    }

    @Override
    public int hashCode() {
        return Objects.hash(monHoc, chuongTrinhKhung);
    }
}
