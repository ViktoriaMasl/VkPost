package ru.netology.domain;

public class RepostInfo {
    private int count; //количество репостов
    private boolean canRepost; //может ли пользователь репостнуть запись
    private int realizedRepost; //сделал ли репост текущий пользователь (1 - да, 0 - нет)

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isCanRepost() {
        return canRepost;
    }

    public void setCanRepost(boolean canRepost) {
        this.canRepost = canRepost;
    }

    public int getRealizedRepost() {
        return realizedRepost;
    }

    public void setRealizedRepost(int realizedRepost) {
        this.realizedRepost = realizedRepost;
    }
}
