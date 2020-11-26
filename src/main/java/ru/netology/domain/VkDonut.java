package ru.netology.domain;

public class VkDonut {
    private boolean isDonut; //запись доступна только платным подписчикам VK Donut
    private int paidDuration; // время, в течение которого запись будет доступна только платным подписчикам VK Donut
    private Object placeholder; //заглушка для пользователей, которые не оформили подписку VK Donut
    private boolean canPublishFreeCopy; //можно ли открыть запись для всех пользователей
    private String editMode; //информация о том, какие значения VK Donut можно изменить в записи

    public boolean isDonut() {
        return isDonut;
    }

    public void setDonut(boolean donut) {
        isDonut = donut;
    }

    public int getPaidDuration() {
        return paidDuration;
    }

    public void setPaidDuration(int paidDuration) {
        this.paidDuration = paidDuration;
    }

    public Object getPlaceholder() {
        return placeholder;
    }

    public void setPlaceholder(Object placeholder) {
        this.placeholder = placeholder;
    }

    public boolean isCanPublishFreeCopy() {
        return canPublishFreeCopy;
    }

    public void setCanPublishFreeCopy(boolean canPublishFreeCopy) {
        this.canPublishFreeCopy = canPublishFreeCopy;
    }

    public String getEditMode() {
        return editMode;
    }

    public void setEditMode(String editMode) {
        this.editMode = editMode;
    }
}
