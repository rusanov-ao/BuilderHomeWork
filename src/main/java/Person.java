import java.util.Objects;

public class Person {

    protected final String name;
    protected final String surname;
    protected  int age;
    protected  String address;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        age = 0;
        address = null;
    }

    public Person(String name, String surnamem, int age) {
        this.name = name;
        this.surname = surnamem;
        this.age = age;
        address = null;
    }

    public Person(String name, String surnamem, int age, String address) {
        this.name = name;
        this.surname = surnamem;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void happyBirthday() {
        age = age + 1;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Person)) return false;
//        Person person = (Person) o;
//        return age == person.age && name.equals(person.name) && surname.equals(person.surname) && address.equals(person.address);
//    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, address);
    }
}
