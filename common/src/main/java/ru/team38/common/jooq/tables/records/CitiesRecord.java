/*
 * This file is generated by jOOQ.
 */
package ru.team38.common.jooq.tables.records;


import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;

import ru.team38.common.jooq.tables.Cities;


/**
 * Таблица для хранения городов
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CitiesRecord extends UpdatableRecordImpl<CitiesRecord> implements Record7<Long, String, Long, Boolean, Double, Double, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>socialnet.cities.id</code>. Уникальный идентификатор
     * города
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>socialnet.cities.id</code>. Уникальный идентификатор
     * города
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>socialnet.cities.city_name</code>. Название города
     */
    public void setCityName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>socialnet.cities.city_name</code>. Название города
     */
    public String getCityName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>socialnet.cities.country_id</code>. ID страны
     */
    public void setCountryId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>socialnet.cities.country_id</code>. ID страны
     */
    public Long getCountryId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>socialnet.cities.is_deleted</code>. Флаг, указывающий,
     * удален ли город
     */
    public void setIsDeleted(Boolean value) {
        set(3, value);
    }

    /**
     * Getter for <code>socialnet.cities.is_deleted</code>. Флаг, указывающий,
     * удален ли город
     */
    public Boolean getIsDeleted() {
        return (Boolean) get(3);
    }

    /**
     * Setter for <code>socialnet.cities.latitude</code>. Широта
     */
    public void setLatitude(Double value) {
        set(4, value);
    }

    /**
     * Getter for <code>socialnet.cities.latitude</code>. Широта
     */
    public Double getLatitude() {
        return (Double) get(4);
    }

    /**
     * Setter for <code>socialnet.cities.longitude</code>. Долгота
     */
    public void setLongitude(Double value) {
        set(5, value);
    }

    /**
     * Getter for <code>socialnet.cities.longitude</code>. Долгота
     */
    public Double getLongitude() {
        return (Double) get(5);
    }

    /**
     * Setter for <code>socialnet.cities.zone_id</code>. Временная зона города
     */
    public void setZoneId(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>socialnet.cities.zone_id</code>. Временная зона города
     */
    public String getZoneId() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<Long, String, Long, Boolean, Double, Double, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<Long, String, Long, Boolean, Double, Double, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Cities.CITIES.ID;
    }

    @Override
    public Field<String> field2() {
        return Cities.CITIES.CITY_NAME;
    }

    @Override
    public Field<Long> field3() {
        return Cities.CITIES.COUNTRY_ID;
    }

    @Override
    public Field<Boolean> field4() {
        return Cities.CITIES.IS_DELETED;
    }

    @Override
    public Field<Double> field5() {
        return Cities.CITIES.LATITUDE;
    }

    @Override
    public Field<Double> field6() {
        return Cities.CITIES.LONGITUDE;
    }

    @Override
    public Field<String> field7() {
        return Cities.CITIES.ZONE_ID;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getCityName();
    }

    @Override
    public Long component3() {
        return getCountryId();
    }

    @Override
    public Boolean component4() {
        return getIsDeleted();
    }

    @Override
    public Double component5() {
        return getLatitude();
    }

    @Override
    public Double component6() {
        return getLongitude();
    }

    @Override
    public String component7() {
        return getZoneId();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getCityName();
    }

    @Override
    public Long value3() {
        return getCountryId();
    }

    @Override
    public Boolean value4() {
        return getIsDeleted();
    }

    @Override
    public Double value5() {
        return getLatitude();
    }

    @Override
    public Double value6() {
        return getLongitude();
    }

    @Override
    public String value7() {
        return getZoneId();
    }

    @Override
    public CitiesRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public CitiesRecord value2(String value) {
        setCityName(value);
        return this;
    }

    @Override
    public CitiesRecord value3(Long value) {
        setCountryId(value);
        return this;
    }

    @Override
    public CitiesRecord value4(Boolean value) {
        setIsDeleted(value);
        return this;
    }

    @Override
    public CitiesRecord value5(Double value) {
        setLatitude(value);
        return this;
    }

    @Override
    public CitiesRecord value6(Double value) {
        setLongitude(value);
        return this;
    }

    @Override
    public CitiesRecord value7(String value) {
        setZoneId(value);
        return this;
    }

    @Override
    public CitiesRecord values(Long value1, String value2, Long value3, Boolean value4, Double value5, Double value6, String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CitiesRecord
     */
    public CitiesRecord() {
        super(Cities.CITIES);
    }

    /**
     * Create a detached, initialised CitiesRecord
     */
    public CitiesRecord(Long id, String cityName, Long countryId, Boolean isDeleted, Double latitude, Double longitude, String zoneId) {
        super(Cities.CITIES);

        setId(id);
        setCityName(cityName);
        setCountryId(countryId);
        setIsDeleted(isDeleted);
        setLatitude(latitude);
        setLongitude(longitude);
        setZoneId(zoneId);
        resetChangedOnNotNull();
    }
}
