package blog.data;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class BlogData {
    private String id;
    private String title;
    private String description;
    private List<LinkData> links;
}
