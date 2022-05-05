import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import org.junit.*;
public class MarkdownParseTest {

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testMarkdownParse() throws IOException {
        Path fileName = Path.of("test-file8.md");
        String content = Files.readString(fileName);
        assertEquals("Should be the same.",List.of("a link on the first line"),MarkdownParse.getLinks(content));
    }


}
