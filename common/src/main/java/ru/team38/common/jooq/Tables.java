/*
 * This file is generated by jOOQ.
 */
package ru.team38.common.jooq;


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
 * Convenience access to all tables in socialnet.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * Таблица для сущности аккаунта пользователя
     */
    public static final Account ACCOUNT = Account.ACCOUNT;

    /**
     * Таблица для хранения городов
     */
    public static final Cities CITIES = Cities.CITIES;

    /**
     * Таблица сущностей комментариев
     */
    public static final Comment COMMENT = Comment.COMMENT;

    /**
     * Таблица для хранения стран
     */
    public static final Countries COUNTRIES = Countries.COUNTRIES;

    /**
     * Таблица ссылок на файлы
     */
    public static final FileStorage FILE_STORAGE = FileStorage.FILE_STORAGE;

    /**
     * Таблица сущности отношения аккаунта к аккаунту
     */
    public static final Friends FRIENDS = Friends.FRIENDS;

    /**
     * Таблица для хранения лайков
     */
    public static final Like LIKE = Like.LIKE;

    /**
     * Таблица для сущности сообщения
     */
    public static final Message MESSAGE = Message.MESSAGE;

    /**
     * Таблица уведомлений
     */
    public static final Notification NOTIFICATION = Notification.NOTIFICATION;

    /**
     * Таблица для хранения информации о журнале изменений
     */
    public static final Post POST = Post.POST;

    /**
     * Таблица для хранения тегов
     */
    public static final Tag TAG = Tag.TAG;

    /**
     * Таблица для хранения токенов
     */
    public static final Tokens TOKENS = Tokens.TOKENS;
}
