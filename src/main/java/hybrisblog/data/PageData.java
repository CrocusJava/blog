package hybrisblog.data;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PageData {
    private String countRange;
    private String startRange;
    private String endRange;
    private String currentStartRange;
    private String currentEndRange;
    private PostData posts;
}
