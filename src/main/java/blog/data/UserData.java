package blog.data;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserData {
    private String firstName;
    private String lastName;
    private String position;
    private String description;
    private LocaleData locale;
    private List<LinkData> links;
}
