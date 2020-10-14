package main.java.domain;

import javax.xml.stream.events.Comment;

public class NoteOnTheWall {
    int id; // id записи
    int idWhoPost; // id того, кто постит
    int idWherePost; // id стены на которой запись
    String noteBody; // описание
    AttachmentsInfo attachmentsInfoents; // класc разных вложений
    LikesInfo likesInfo; //класс описывает лайки
    RepostsInfo repostsInfoposts; // класс описывает репосты
    int countOfViews; // количество просмотров записи
    CommentsInfo commentsInfoments;//клас описывает комментарии к записи
    int data; // дата записи
    boolean isFavorite;// добавлена в закладки да\нет

    int replyOwnerId;// идентификатор владельца записи, в ответ на которую была оставлена текущая.
    int replyPostId;// идентификатор записи, в ответ на которую была оставлена текущая.

    String postType; // тип записи, может принимать следующие значения: post, copy, reply, postpone, suggest.
    GeoInfo geoInfo; // класс описывает геолокацию
    int signerId; // идентификатор автора, если запись была опубликована от имени сообщества и подписана пользователем;
    int postponedId; // идентификатор отложенной записи. Это поле возвращается тогда, когда запись стояла на таймере.

    // + get/set на все поля

}
