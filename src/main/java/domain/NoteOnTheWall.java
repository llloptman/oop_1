package main.java.domain;

import main.java.domain.attachment.AttachmentsInfo;

public class NoteOnTheWall {
    private int id; // id записи
    private int idWhoPost; // id того, кто постит
    private int idWherePost; // id стены на которой запись
    private String noteBody; // описание
    private AttachmentsInfo attachmentsInfoents; // класc разных вложений
    private LikesInfo likesInfo; //класс описывает лайки
    private RepostsInfo repostsInfoposts; // класс описывает репосты
    private int countOfViews; // количество просмотров записи
    private CommentsInfo commentsInfoments;//клас описывает комментарии к записи
    private int data; // дата записи
    private boolean isFavorite;// добавлена в закладки да\нет

    private int replyOwnerId;// идентификатор владельца записи, в ответ на которую была оставлена текущая.
    private int replyPostId;// идентификатор записи, в ответ на которую была оставлена текущая.

    private String postType; // тип записи, может принимать следующие значения: post, copy, reply, postpone, suggest.
    private GeoInfo geoInfo; // класс описывает геолокацию
    private int signerId; // идентификатор автора, если запись была опубликована от имени сообщества и подписана пользователем;
    private int postponedId; // идентификатор отложенной записи. Это поле возвращается тогда, когда запись стояла на таймере.

    // + get/set на все поля

}
