package ru.netology.domain;

public class Post {

    private int postId; //идентиф. номер поста
    private int ownerId; //идентиф. номер собственника страницы
    private int signerId; //идентификатор автора, если запись была опубликована от имени сообщества и подписана пользователем
    private AuthorInfo authorInfo; //данные автора
    private double data; //время создания поста
    private String device; //устройство, с которого сделан пост
    private String text; //текст поста
    private String attachmentsPost; //вложения (ссылки, изображения, музыка и пр.)
    private LocationInfo locationInfo; //данные о местоположении
    private String postType; //тип поста (пост, репост, голосование и пр.
    private double postTimer; //когда необходимо опубликовать пост
    private double friendsOnly; //запись могут видеть только друзья
    private String thematicsPost; //тематика записи
    private boolean fixPost; //запись закреплена
    private boolean canPin; //информация о том, может ли текущий пользователь закрепить запись
    private boolean canDelete; //информация о том, может ли текущий пользователь удалить запись
    private boolean canEdit; //информация о том, может ли текущий пользователь редактировать запись
    private boolean notComment; //комментарии записи отключены
    private boolean noNotificationsPost; //не отправлять уведомления по активности на данном посте
    private int copyrightId; //источник публикации
    private LikesInfo likesInfo; //информация о лайках
    private CommentsInfo commentsInfo; //информация о комментариях
    private RepostInfo repostInfo; //информация о репостах
    private int viewCount; //количество просмотров
    private PostSource postSource; //информация об источнике поста
    private boolean markedAsAds; //информация о том, содержит ли запись отметку "реклама"
    private boolean isFavorite; //true, если объект добавлен в закладки у текущего пользователя
    private VkDonut vkDonut; //информация о записи VK Donut

    public int getPostId() { return postId; }

    public void setPostId(int postId) { this.postId = postId; }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public AuthorInfo getAuthorInfo() {
        return authorInfo;
    }

    public void setAuthorInfo(AuthorInfo authorInfo) {
        this.authorInfo = authorInfo;
    }

    public int getSignerId() {
        return signerId;
    }

    public void setSignerId(int signerId) {
        this.signerId = signerId;
    }

    public double getData() {
        return data;
    }

    public void setData(double data) {
        this.data = data;
    }

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAttachmentsPost() {
        return attachmentsPost;
    }

    public void setAttachmentsPost(String attachmentsPost) {
        this.attachmentsPost = attachmentsPost;
    }

    public LocationInfo getLocationInfo() {
        return locationInfo;
    }

    public void setLocationInfo(LocationInfo locationInfo) {
        this.locationInfo = locationInfo;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) { this.postType = postType; }

    public double getPostTimer() {
        return postTimer;
    }

    public void setPostTimer(double postTimer) {
        this.postTimer = postTimer;
    }

    public double getFriendsOnly() {
        return friendsOnly;
    }

    public void setFriendsOnly(double friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    public String getThematicsPost() {
        return thematicsPost;
    }

    public void setThematicsPost(String thematicsPost) {
        this.thematicsPost = thematicsPost;
    }

    public boolean isFixPost() { return fixPost; }

    public void setFixPost(boolean fixPost) {
        this.fixPost = fixPost;
    }

    public boolean isCanPin() {
        return canPin;
    }

    public void setCanPin(boolean canPin) {
        this.canPin = canPin;
    }

    public boolean isCanDelete() {
        return canDelete;
    }

    public void setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    public boolean isNotComment() {
        return notComment;
    }

    public void setNotComment(boolean notComment) {
        this.notComment = notComment;
    }

    public boolean isNoNotificationsPost() {
        return noNotificationsPost;
    }

    public void setNoNotificationsPost(boolean noNotificationsPost) {
        this.noNotificationsPost = noNotificationsPost;
    }

    public int getCopyrightId() {
        return copyrightId;
    }

    public void setCopyrightId(int copyrightId) {
        this.copyrightId = copyrightId;
    }

    public LikesInfo getLikesInfo() {
        return likesInfo;
    }

    public void setLikesInfo(LikesInfo likesInfo) {
        this.likesInfo = likesInfo;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public RepostInfo getRepostInfo() {
        return repostInfo;
    }

    public void setRepostInfo(RepostInfo repostInfo) {
        this.repostInfo = repostInfo;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }

    public PostSource getPostSource() {
        return postSource;
    }

    public void setPostSource(PostSource postSource) {
        this.postSource = postSource;
    }

    public boolean isMarkedAsAds() {
        return markedAsAds;
    }

    public void setMarkedAsAds(boolean markedAsAds) {
        this.markedAsAds = markedAsAds;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public VkDonut getVkDonut() { return vkDonut; }

    public void setVkDonut(VkDonut vkDonut) { this.vkDonut = vkDonut; }
}
