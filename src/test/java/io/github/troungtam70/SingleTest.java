package io.github.troungtam70;

import static org.junit.jupiter.api.Assertions.*;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

import org.junit.jupiter.api.Test;

public class SingleTest {
  @Test
  void test1() {
    assertEquals(2, 1 + 1);
  }

  @Test
  void modifyPomXml() throws Exception {
    String a = System.getenv("A");
    String b = System.getenv("B");
    if (a == null || b == null) {
      System.err.println("Need env vars A and B");
      return;
    }
    var bytes = Files.readAllBytes(Path.of("pom.xml"));
    var content = new String(bytes, StandardCharsets.UTF_8).replace(a, b);
    Files.writeString(Path.of("pom.xml"), content, StandardOpenOption.TRUNCATE_EXISTING);
  }
}
