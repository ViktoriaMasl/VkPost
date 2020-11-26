package ru.netology.attachment;

public class PostedPhoto {
    private int postedPhotoId;
    private int ownerId;
    private String photo130;
    private String photo604;

    public int getPostedPhotoId() {
        return postedPhotoId;
    }

    public void setPostedPhotoId(int postedPhotoId) {
        this.postedPhotoId = postedPhotoId;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getPhoto130() {
        return photo130;
    }

    public void setPhoto130(String photo130) {
        this.photo130 = photo130;
    }

    public String getPhoto604() {
        return photo604;
    }

    public void setPhoto604(String photo604) {
        this.photo604 = photo604;
    }
}
