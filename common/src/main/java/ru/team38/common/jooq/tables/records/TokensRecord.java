/*
 * This file is generated by jOOQ.
 */
package ru.team38.common.jooq.tables.records;


import java.time.LocalDateTime;
import java.util.UUID;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;

import ru.team38.common.jooq.tables.Tokens;


/**
 * Таблица для хранения токенов
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TokensRecord extends UpdatableRecordImpl<TokensRecord> implements Record7<Long, UUID, String, String, Boolean, LocalDateTime, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>socialnet.tokens.id</code>. Уникальный идентификатор
     * токена
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>socialnet.tokens.id</code>. Уникальный идентификатор
     * токена
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>socialnet.tokens.account_id</code>. Уникальный
     * идентификатор аккаунта пользователя
     */
    public void setAccountId(UUID value) {
        set(1, value);
    }

    /**
     * Getter for <code>socialnet.tokens.account_id</code>. Уникальный
     * идентификатор аккаунта пользователя
     */
    public UUID getAccountId() {
        return (UUID) get(1);
    }

    /**
     * Setter for <code>socialnet.tokens.token_type</code>. Тип токена (access
     * или refresh)
     */
    public void setTokenType(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>socialnet.tokens.token_type</code>. Тип токена (access
     * или refresh)
     */
    public String getTokenType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>socialnet.tokens.token</code>. Закодированный токен
     */
    public void setToken(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>socialnet.tokens.token</code>. Закодированный токен
     */
    public String getToken() {
        return (String) get(3);
    }

    /**
     * Setter for <code>socialnet.tokens.validity</code>. Валиден ли токен
     */
    public void setValidity(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>socialnet.tokens.validity</code>. Валиден ли токен
     */
    public Boolean getValidity() {
        return (Boolean) get(4);
    }

    /**
     * Setter for <code>socialnet.tokens.expiration</code>. Дата истечения срока
     * годности токена
     */
    public void setExpiration(LocalDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>socialnet.tokens.expiration</code>. Дата истечения срока
     * годности токена
     */
    public LocalDateTime getExpiration() {
        return (LocalDateTime) get(5);
    }

    /**
     * Setter for <code>socialnet.tokens.device_uuid</code>. Идентификатор,
     * объединяющий refresh токен с соответствующими access токенами
     */
    public void setDeviceUuid(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>socialnet.tokens.device_uuid</code>. Идентификатор,
     * объединяющий refresh токен с соответствующими access токенами
     */
    public String getDeviceUuid() {
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
    public Row7<Long, UUID, String, String, Boolean, LocalDateTime, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<Long, UUID, String, String, Boolean, LocalDateTime, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Tokens.TOKENS.ID;
    }

    @Override
    public Field<UUID> field2() {
        return Tokens.TOKENS.ACCOUNT_ID;
    }

    @Override
    public Field<String> field3() {
        return Tokens.TOKENS.TOKEN_TYPE;
    }

    @Override
    public Field<String> field4() {
        return Tokens.TOKENS.TOKEN;
    }

    @Override
    public Field<Boolean> field5() {
        return Tokens.TOKENS.VALIDITY;
    }

    @Override
    public Field<LocalDateTime> field6() {
        return Tokens.TOKENS.EXPIRATION;
    }

    @Override
    public Field<String> field7() {
        return Tokens.TOKENS.DEVICE_UUID;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public UUID component2() {
        return getAccountId();
    }

    @Override
    public String component3() {
        return getTokenType();
    }

    @Override
    public String component4() {
        return getToken();
    }

    @Override
    public Boolean component5() {
        return getValidity();
    }

    @Override
    public LocalDateTime component6() {
        return getExpiration();
    }

    @Override
    public String component7() {
        return getDeviceUuid();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public UUID value2() {
        return getAccountId();
    }

    @Override
    public String value3() {
        return getTokenType();
    }

    @Override
    public String value4() {
        return getToken();
    }

    @Override
    public Boolean value5() {
        return getValidity();
    }

    @Override
    public LocalDateTime value6() {
        return getExpiration();
    }

    @Override
    public String value7() {
        return getDeviceUuid();
    }

    @Override
    public TokensRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public TokensRecord value2(UUID value) {
        setAccountId(value);
        return this;
    }

    @Override
    public TokensRecord value3(String value) {
        setTokenType(value);
        return this;
    }

    @Override
    public TokensRecord value4(String value) {
        setToken(value);
        return this;
    }

    @Override
    public TokensRecord value5(Boolean value) {
        setValidity(value);
        return this;
    }

    @Override
    public TokensRecord value6(LocalDateTime value) {
        setExpiration(value);
        return this;
    }

    @Override
    public TokensRecord value7(String value) {
        setDeviceUuid(value);
        return this;
    }

    @Override
    public TokensRecord values(Long value1, UUID value2, String value3, String value4, Boolean value5, LocalDateTime value6, String value7) {
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
     * Create a detached TokensRecord
     */
    public TokensRecord() {
        super(Tokens.TOKENS);
    }

    /**
     * Create a detached, initialised TokensRecord
     */
    public TokensRecord(Long id, UUID accountId, String tokenType, String token, Boolean validity, LocalDateTime expiration, String deviceUuid) {
        super(Tokens.TOKENS);

        setId(id);
        setAccountId(accountId);
        setTokenType(tokenType);
        setToken(token);
        setValidity(validity);
        setExpiration(expiration);
        setDeviceUuid(deviceUuid);
        resetChangedOnNotNull();
    }
}
