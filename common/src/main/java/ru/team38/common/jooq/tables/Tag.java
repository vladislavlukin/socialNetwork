/*
 * This file is generated by jOOQ.
 */
package ru.team38.common.jooq.tables;


import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function3;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row3;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;

import ru.team38.common.jooq.Keys;
import ru.team38.common.jooq.Socialnet;
import ru.team38.common.jooq.tables.records.TagRecord;


/**
 * Таблица для хранения тегов
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tag extends TableImpl<TagRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>socialnet.tag</code>
     */
    public static final Tag TAG = new Tag();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TagRecord> getRecordType() {
        return TagRecord.class;
    }

    /**
     * The column <code>socialnet.tag.id</code>. Уникальный идентификатор записи
     * журнала изменений
     */
    public final TableField<TagRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "Уникальный идентификатор записи журнала изменений");

    /**
     * The column <code>socialnet.tag.is_deleted</code>. Флаг, указывающий,
     * удалена ли запись журнала изменений
     */
    public final TableField<TagRecord, Boolean> IS_DELETED = createField(DSL.name("is_deleted"), SQLDataType.BOOLEAN, this, "Флаг, указывающий, удалена ли запись журнала изменений");

    /**
     * The column <code>socialnet.tag.name</code>. Значение тега
     */
    public final TableField<TagRecord, String> NAME = createField(DSL.name("name"), SQLDataType.CLOB, this, "Значение тега");

    private Tag(Name alias, Table<TagRecord> aliased) {
        this(alias, aliased, null);
    }

    private Tag(Name alias, Table<TagRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Таблица для хранения тегов"), TableOptions.table());
    }

    /**
     * Create an aliased <code>socialnet.tag</code> table reference
     */
    public Tag(String alias) {
        this(DSL.name(alias), TAG);
    }

    /**
     * Create an aliased <code>socialnet.tag</code> table reference
     */
    public Tag(Name alias) {
        this(alias, TAG);
    }

    /**
     * Create a <code>socialnet.tag</code> table reference
     */
    public Tag() {
        this(DSL.name("tag"), null);
    }

    public <O extends Record> Tag(Table<O> child, ForeignKey<O, TagRecord> key) {
        super(child, key, TAG);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Socialnet.SOCIALNET;
    }

    @Override
    public Identity<TagRecord, Long> getIdentity() {
        return (Identity<TagRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<TagRecord> getPrimaryKey() {
        return Keys.TAGS_PKEY;
    }

    @Override
    public Tag as(String alias) {
        return new Tag(DSL.name(alias), this);
    }

    @Override
    public Tag as(Name alias) {
        return new Tag(alias, this);
    }

    @Override
    public Tag as(Table<?> alias) {
        return new Tag(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Tag rename(String name) {
        return new Tag(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Tag rename(Name name) {
        return new Tag(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Tag rename(Table<?> name) {
        return new Tag(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Long, Boolean, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function3<? super Long, ? super Boolean, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function3<? super Long, ? super Boolean, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}