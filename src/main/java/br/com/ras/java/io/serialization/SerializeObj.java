package br.com.ras.java.io.serialization;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SerializeObj {
    
    public static void main(String[] args) {
        log.info("MAIN");

        final var person = Person.of("Rodrigo", "Arantes", 36, "M");

        log.info("Person -> {}", person);

        final var writer = new Writer();
        writer.write(person);

        log.warn("fileExist -> {}", writer.isFileExist());

        final var reader = new Reader();

        final var personRead  = reader.read("person_old.data");

        log.info("PersonRead -> {}", personRead);
    }

}
