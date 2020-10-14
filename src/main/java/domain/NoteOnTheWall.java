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
    // + get/set на все поля

}
