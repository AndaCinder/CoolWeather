package com.example.coolweather.db;

import org.litepal.crud.LitePalSupport;

/**
 * @创建者 李琛
 * 2019/6/25 23:16
 */
public class County extends LitePalSupport {

    private int id;
    private String countyName;  //记录县的名字
    private String weatherId;   //记录县对应所对应的天气ID
    private int cityId;         //当前县所属市的id

    /**
     * 为什么不用流？
     * 直接封装上一级JavaBean
     * 序列化的时候这一项不进行序列化
     * @return
     */
    //transient City city;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
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
