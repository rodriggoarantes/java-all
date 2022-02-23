package br.com.ras.java.io.serialization;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
public class Person implements Serializable {

	private static final long serialVersionUID = -1564978802965107934L;

	private String name;
	private String lastname;
	private int age;
	private String gender;
}

