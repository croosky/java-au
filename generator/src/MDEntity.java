import java.util.*;

public class MDEntity implements ItemEntity{
    private String title;
    private String url;
    private String solution;

    MDEntity(String title, String url, String solution){
        this.title = title;
        this.url = url;
        this.solution = solution;
    }

    public static MDEntity parseEntity(List<String> s) {
        if(s.size() < 4) {
            return new MDEntity(null,null,null);
        }
        String joined = String.join("\n", s);
        return new MDEntity(s.get(0), s.get(1), "```java" + "\n" + joined + "```");
    }
}
