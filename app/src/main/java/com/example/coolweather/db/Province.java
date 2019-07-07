package com.example.coolweather.db;

import org.litepal.crud.LitePalSupport;

/**
 * @创建者 李琛
 * 2019/6/25 23:09
 */
public class Province extends LitePalSupport {

    private int id;

    private String provinceName;

    private Integer provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public Integer getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(Integer provinceCode) {
        this.provinceCode = provinceCode;
    }
}
