import java.util.List;
import java.util.stream.Collectors;

public class SolutionFile {
    private String fileName;
    private FileType fileType;
    private List<ItemEntity> content;

    public SolutionFile(String fileName, List<ItemEntity> content, FileType fileType) {
        this.fileName = fileName;
        this.fileType = fileType;
        this.content = content;
    }
    public static SolutionFile parse(String fileName, List<String> oldContent, FileType fileType) {
    }

    private String mdToString(){
        String title = this.content.stream().map(ItemEntity::getTitle).collect(Collectors.joining("\n"));
        String solutions = this.content.stream().map(ItemEntity::getForm).collect(Collectors.joining("\n\n"));
        return "# " + this.fileName + "\n\n" + title + "\n\n" + solutions;
    }

    public Object add(Object parseEntity) {
    }
}
