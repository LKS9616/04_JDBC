package com.ohgiraffers.model.dto;

public class DepartmentDTO {

    //CamelCase
    //Class의 필드명과 데이터베이스의 컬럼병과 java에서는 카멜케이스를 sql에서는 슬레이트케이스 쓰는데 jdbc에서 자동변경시켜줌
    private String deptId;
    private String deptTitle;
    private String locationId;

    public DepartmentDTO () {

    }

    public DepartmentDTO(String deptId, String deptTitle, String locationId) {
        this.deptId = deptId;
        this.deptTitle = deptTitle;
        this.locationId = locationId;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getDeptTitle() {
        return deptTitle;
    }

    public void setDeptTitle(String deptTitle) {
        this.deptTitle = deptTitle;
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    @Override
    public String toString() {
        return "DepartmentDTO{" +
                "deptId='" + deptId + '\'' +
                ", deptTitle='" + deptTitle + '\'' +
                ", locationId='" + locationId + '\'' +
                '}';
    }
}
