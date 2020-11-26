package ru.netology.attachment;

public class MarketAlbum {
    private int marketAlbumId;
    private int ownerId;
    private String title;
    private Object photo;
    private int count;
    private int updatedTime;

    public int getMarketAlbumId() {
        return marketAlbumId;
    }

    public void setMarketAlbumId(int marketAlbumId) {
        this.marketAlbumId = marketAlbumId;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Object getPhoto() {
        return photo;
    }

    public void setPhoto(Object photo) {
        this.photo = photo;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(int updatedTime) {
        this.updatedTime = updatedTime;
    }
}
