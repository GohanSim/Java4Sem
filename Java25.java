// практика 25 equals

class Person25 {

    String name;
    int age;

    Person25(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        // проверка ссылки
        if (this == obj)
            return true;
        // проверка null и типа
        if (obj == null || getClass() != obj.getClass())
            return false;
        // приведение типа
        Person25 person = (Person25) obj;
        // сравнение полей
        return age == person.age &&
                name.equals(person.name);
    }
}

public class Java25 {

    public static void main(String[] args) {

        Person25 p1 = new Person25("vova", 20);
        Person25 p2 = new Person25("roma", 20);
        Person25 p3 = new Person25("Anastasiya", 25);
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        /*equals должен соблюдать правила:
        reflexive:
        объект равен самому себе
        symmetric:
        a.equals(b) == b.equals(a)
        transitive:
        если a=b и b=c, то a=c
        consistent:
        результат должен быть стабильным
        null:
        объект не равен null*/
    }
}