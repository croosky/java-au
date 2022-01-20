import java.util.*;

public class MDEntity implements ItemEntity{
    private String title;
    private String url;
    private String solution;
    public static MDEntity parseEntity(List<String> solutionFile) {
        String[] parts = solutionFile.split(System.lineSeparator());
        String title = parts[0];

    }
}
