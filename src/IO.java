import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public final class IO {

    public static List<Integer> readFile() throws IOException {
        String fileName = "data";
        Path path = Paths.get(fileName);
        byte[] bytes = Files.readAllBytes(path);
        List<String> allLines = Files.readAllLines(path, StandardCharsets.UTF_8);
        List<Integer> allLinesInInt = allLines.stream().map(Integer::parseInt).collect(java.util.stream.Collectors.toList());
        System.out.println(allLinesInInt);
        return allLinesInInt;
    }

    public static Mod getMod(String mod) {
        switch (mod) {
            case "+":
                return Mod.ADDITION;
            case "-":
                return Mod.SUBSTRACTION;
            case "*":
                return Mod.MULTIPLICATION;
            default:
                return null;
        }
    }

}
