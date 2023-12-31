/*
 * This file is generated by jOOQ.
 */
package ru.team38.common.jooq.tables;


import java.util.Arrays;
import java.util.List;
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
import ru.team38.common.jooq.tables.records.FileStorageRecord;


/**
 * Таблица ссылок на файлы
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FileStorage extends TableImpl<FileStorageRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>socialnet.file-storage</code>
     */
    public static final FileStorage FILE_STORAGE = new FileStorage();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FileStorageRecord> getRecordType() {
        return FileStorageRecord.class;
    }

    /**
     * The column <code>socialnet.file-storage.id</code>. ID файла
     */
    public final TableField<FileStorageRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "ID файла");

    /**
     * The column <code>socialnet.file-storage.filename</code>. Имя файла при
     * загрузке
     */
    public final TableField<FileStorageRecord, String> FILENAME = createField(DSL.name("filename"), SQLDataType.VARCHAR(255).nullable(false), this, "Имя файла при загрузке");

    /**
     * The column <code>socialnet.file-storage.path</code>. Путь к файлу в
     * хранилище
     */
    public final TableField<FileStorageRecord, String> PATH = createField(DSL.name("path"), SQLDataType.VARCHAR(255).nullable(false), this, "Путь к файлу в хранилище");

    private FileStorage(Name alias, Table<FileStorageRecord> aliased) {
        this(alias, aliased, null);
    }

    private FileStorage(Name alias, Table<FileStorageRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Таблица ссылок на файлы"), TableOptions.table());
    }

    /**
     * Create an aliased <code>socialnet.file-storage</code> table reference
     */
    public FileStorage(String alias) {
        this(DSL.name(alias), FILE_STORAGE);
    }

    /**
     * Create an aliased <code>socialnet.file-storage</code> table reference
     */
    public FileStorage(Name alias) {
        this(alias, FILE_STORAGE);
    }

    /**
     * Create a <code>socialnet.file-storage</code> table reference
     */
    public FileStorage() {
        this(DSL.name("file-storage"), null);
    }

    public <O extends Record> FileStorage(Table<O> child, ForeignKey<O, FileStorageRecord> key) {
        super(child, key, FILE_STORAGE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Socialnet.SOCIALNET;
    }

    @Override
    public Identity<FileStorageRecord, Long> getIdentity() {
        return (Identity<FileStorageRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<FileStorageRecord> getPrimaryKey() {
        return Keys.FILE_STORAGE_PKEY;
    }

    @Override
    public List<UniqueKey<FileStorageRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.FILE_STORAGE_PATH_KEY);
    }

    @Override
    public FileStorage as(String alias) {
        return new FileStorage(DSL.name(alias), this);
    }

    @Override
    public FileStorage as(Name alias) {
        return new FileStorage(alias, this);
    }

    @Override
    public FileStorage as(Table<?> alias) {
        return new FileStorage(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public FileStorage rename(String name) {
        return new FileStorage(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FileStorage rename(Name name) {
        return new FileStorage(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public FileStorage rename(Table<?> name) {
        return new FileStorage(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Long, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function3<? super Long, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function3<? super Long, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
