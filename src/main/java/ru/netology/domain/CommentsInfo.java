package ru.netology.domain;

public class CommentsInfo {
    private int count; //количество комментариев
    private boolean canComment; //может ли пользователь откомментировать запись
    private boolean canOpenComments; //может ли пользователь открыть все комментарии
    private boolean canCloseComments; //может ли пользователь закрыть комментарии к записи
    private boolean likeComment; //может ли пользователь лайкнуть комментарий
    private boolean canGroupsComment; //могут ли сообщества комментировать запись

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isCanComment() {
        return canComment;
    }

    public void setCanComment(boolean canComment) {
        this.canComment = canComment;
    }

    public boolean isCanOpenComments() {
        return canOpenComments;
    }

    public void setCanOpenComments(boolean canOpenComments) {
        this.canOpenComments = canOpenComments;
    }

    public boolean isCanCloseComments() {
        return canCloseComments;
    }

    public void setCanCloseComments(boolean canCloseComments) {
        this.canCloseComments = canCloseComments;
    }

    public boolean isLikeComment() {
        return likeComment;
    }

    public void setLikeComment(boolean likeComment) {
        this.likeComment = likeComment;
    }

    public boolean isCanGroupsComment() {
        return canGroupsComment;
    }

    public void setCanGroupsComment(boolean canGroupsComment) {
        this.canGroupsComment = canGroupsComment;
    }
}
