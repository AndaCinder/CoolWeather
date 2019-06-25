package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * @创建者 李琛
 * 2019/6/25 23:16
 */
public class County extends DataSupport {
    private int id;
    private String countryName;  //记录县的名字
    private String weatherId;   //记录县对应所对应的天气ID
    private int cityId;         //当前县所属市的id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
