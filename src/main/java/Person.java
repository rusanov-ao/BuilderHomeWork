import java.util.Objects;

public class Person {

    protected final String name;
    protected final String surname;
    protected  int age;
    protected  String address;


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

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, address);
    }

    public boolean hasAge() {
        boolean result;
        if (age > 0) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public boolean hasAddress() {
        boolean result;
        if (address != null) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder().setSurname(surname).setAddress(address);

    }
}
