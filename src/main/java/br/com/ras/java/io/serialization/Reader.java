package br.com.ras.java.io.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.nio.file.Paths;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Reader {

    private final String path;

    public Reader() {
        this("");
    }

    public Reader(String relativePath) {
        this.path = buildPath(relativePath);
    }

    public Person read() {
        return read("person.data");
    }

    public Person read(String file) {
        log.info("read");

        final var filePath = new File(path + File.separator + file);

        try (final var input = new ObjectInputStream(new FileInputStream(filePath))) {
            final var obj = (Person) input.readObject();

            log.info("Person [{}]", obj);

            return obj;
        } catch (Exception e) {
            throw new RuntimeException("Falha ao escrever arquivo", e);
        }
    }
    
    private static String buildPath(String relativePath) {
        final var rootPath = Paths.get("").toAbsolutePath() + File.separator + "tmp";
        return (relativePath != null && relativePath.length() > 0) ? rootPath +  File.separator + relativePath : rootPath;
    }
}
