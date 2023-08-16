/*
 * This file is generated by jOOQ.
 */
package ru.team38.common.jooq;


import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Sequence;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;

import ru.team38.common.jooq.tables.Account;
import ru.team38.common.jooq.tables.Cities;
import ru.team38.common.jooq.tables.Comment;
import ru.team38.common.jooq.tables.Countries;
import ru.team38.common.jooq.tables.FileStorage;
import ru.team38.common.jooq.tables.Friends;
import ru.team38.common.jooq.tables.Like;
import ru.team38.common.jooq.tables.Message;
import ru.team38.common.jooq.tables.Notification;
import ru.team38.common.jooq.tables.Post;
import ru.team38.common.jooq.tables.Tag;
import ru.team38.common.jooq.tables.Tokens;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Socialnet extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>socialnet</code>
     */
    public static final Socialnet SOCIALNET = new Socialnet();

    /**
     * Таблица для сущности аккаунта пользователя
     */
    public final Account ACCOUNT = Account.ACCOUNT;

    /**
     * Таблица для хранения городов
     */
    public final Cities CITIES = Cities.CITIES;

    /**
     * Таблица сущностей комментариев
     */
    public final Comment COMMENT = Comment.COMMENT;

    /**
     * Таблица для хранения стран
     */
    public final Countries COUNTRIES = Countries.COUNTRIES;

    /**
     * Таблица ссылок на файлы
     */
    public final FileStorage FILE_STORAGE = FileStorage.FILE_STORAGE;

    /**
     * Таблица сущности отношения аккаунта к аккаунту
     */
    public final Friends FRIENDS = Friends.FRIENDS;

    /**
     * Таблица для хранения лайков
     */
    public final Like LIKE = Like.LIKE;

    /**
     * Таблица для сущности сообщения
     */
    public final Message MESSAGE = Message.MESSAGE;

    /**
     * Таблица уведомлений
     */
    public final Notification NOTIFICATION = Notification.NOTIFICATION;

    /**
     * Таблица для хранения информации о журнале изменений
     */
    public final Post POST = Post.POST;

    /**
     * Таблица для хранения тегов
     */
    public final Tag TAG = Tag.TAG;

    /**
     * Таблица для хранения токенов
     */
    public final Tokens TOKENS = Tokens.TOKENS;

    /**
     * No further instances allowed
     */
    private Socialnet() {
        super("socialnet", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Sequence<?>> getSequences() {
        return Arrays.asList(
            Sequences.FILE_STORAGE_ID_SEQ,
            Sequences.FRIENDS_ID_SEQ,
            Sequences.NOTIFICATION_ID_SEQ,
            Sequences.TAG_ID_SEQ,
            Sequences.TOKENS_ID_SEQ
        );
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            Account.ACCOUNT,
            Cities.CITIES,
            Comment.COMMENT,
            Countries.COUNTRIES,
            FileStorage.FILE_STORAGE,
            Friends.FRIENDS,
            Like.LIKE,
            Message.MESSAGE,
            Notification.NOTIFICATION,
            Post.POST,
            Tag.TAG,
            Tokens.TOKENS
        );
    }
}