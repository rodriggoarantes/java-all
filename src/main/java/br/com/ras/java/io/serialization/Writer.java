package br.com.ras.java.io.serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Paths;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Writer {

    private final String path;

    public Writer() {
        this("");
    }

    public Writer(String relativePath) {
        this.path = buildPath(relativePath);
        this.createDir();
    }

    public void write(Person person) {
        log.info("write");

        final var file = new File(this.pathFile());

        try (final var output = new ObjectOutputStream(new FileOutputStream(file))) {
            output.writeObject(person);
        } catch (Exception e) {
            throw new RuntimeException("Falha ao escrever arquivo", e);
        }
    }

    public boolean isFileExist() {
        return Paths.get(this.pathFile()).toFile().exists();
    }

    private String pathFile() {
        return path + File.separator + "person.data";
    }

    private void createDir() {
        final var file = new File(path);

        if (!file.exists()) file.mkdirs();
    }

    private static String buildPath(String relativePath) {
        final var rootPath = Paths.get("").toAbsolutePath() + File.separator + "tmp";
        return (relativePath != null && relativePath.length() > 0) ? rootPath +  File.separator + relativePath : rootPath;
    }
}
