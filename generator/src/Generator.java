import java.util.*;
import java.io.*;
public class Generator {
    public static void main(String[] args) throws IOException{
        String txtSource = "C:\\Users\\khani\\IdeaProjects\\generator\\src\\solution.txt";
        String source = "C:\\Users\\khani\\IdeaProjects\\generator\\src\\problems.md";
        List<String> solution = IOUtils.read(txtSource);
        List<String> oldContent = IOUtils.read(source);
        IOUtils.write(source, generator(source, oldContent, solution, FileType.MARKDOWN));
        

    }

    private static String generator(String source, List<String> oldContent, List<String> solution, FileType fileType) {
        String[] parts = source.split("//");
        String fileName = parts[parts.length-1];
        SolutionFile old = SolutionFile.parse(fileName, oldContent, fileType);
        return old.add(MDEntity.parseEntity(solution)).toString();

    }
}
