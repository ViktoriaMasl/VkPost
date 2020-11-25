package ru.netology.domain;

public class LikesInfo {
    private int count; //количество лайков
    private boolean canLike; //может ли пользователь лайкнуть запись
    private int realizedLike; //поставил ли лайк текущий пользователь (1 - да, 0 - нет)

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isCanLike() {
        return canLike;
    }

    public void setCanLike(boolean canLike) {
        this.canLike = canLike;
    }

    public int getRealizedLike() {
        return realizedLike;
    }

    public void setRealizedLike(int realizedLike) {
        this.realizedLike = realizedLike;
    }
}
