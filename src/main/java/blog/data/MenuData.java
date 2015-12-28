package blog.data;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MenuData {
    private String blogIg;
    private String chapterId;
    private List<PostData> posts;
    private List<MenuData> childMenus;
}
