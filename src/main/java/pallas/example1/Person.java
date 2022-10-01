package pallas.example1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Person {
    private String name;
    private int age;
    private String address;
}
