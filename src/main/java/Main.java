public class Main {
    public static void main(String[] args) {

        Person mom = new PersonBuilder()
                .setName("Анна")
                .setSurname("Вольф")
                .setAge(31)
                .setAddress("Сидней")
                .build();

        Person son = mom.newChildBuilder()
                        .setName("Антошка")
                        .setAge(10)
                        .build();

        System.out.println("У " + mom + " есть сын, " + son);

        Person dad = new PersonBuilder()
                //.setName("Шерлок") // Для
                .setSurname("Холмс")
                .setAge(150)
                .setAddress("Лондон")
                .build();
    }
}
