public class PersonBuilder {

    protected  String name;
    protected  String surname;
    protected  int age = 0;
    protected  String address = null;

//    public PersonBuilder(String name, String surname) {
//        this.name = name;
//        this.surname = surname;
//    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        return new Person(name, surname);
    }




}
