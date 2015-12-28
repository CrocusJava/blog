package blog.data;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PostData {
    private String postId;
    private String title;
    private String content;
    private String shortContent;
    private String chapterId;
    private String blogId;
    private LinkData links;
    private UserData user;
    private Date created;
}
