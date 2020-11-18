package ru.akalinkina.genericlearning;

import ru.akalinkina.common.model.Person;
import ru.akalinkina.genericlearning.model.FullPerson;
import ru.akalinkina.genericlearning.model.FullishPerson;
import ru.akalinkina.genericlearning.model.Single;

import java.time.LocalDate;

public class GenericPecs {
    public static void main(String[] args) {
        FullPerson fullPerson = new FullPerson();
        fullPerson.setName("Antonina");
        fullPerson.setDateOfBirth(LocalDate.now());

        Person person = new Person();
        fullPerson.setName("Kate");
        //1. не компилируется
        //GenericSimple<Person> personGenericSimple = new GenericSimple<FullPerson>(fullPerson);

        //2. Компилируется
        Single<?> personSingle = new Single<>(fullPerson);
        //далее ошибка компиляции
        //Person personValue = personGenericSimple.getValue();

        //3. Правильно
        Single<? extends Person> personExtends = new Single<>(fullPerson);
        Single<? super FullPerson> fullPersonSuper = new Single<>(person);

        FullishPerson fullishPerson = new FullishPerson();
        fullishPerson.setDateOfBirth(LocalDate.now());
        fullishPerson.setName("Vasya");

        //new GenericPecs().print(new GenericSimple<Person>(person));
        new GenericPecs().print(new Single<FullPerson>(fullPerson));
        new GenericPecs().print(new Single<FullishPerson>(fullishPerson));

        new GenericPecs().printSuper(new Single<Person>(person));
        new GenericPecs().printSuper(new Single<FullPerson>(fullPerson));
        // new GenericPecs().getSuper(new GenericSimple<FullishPerson>(fullishPerson));

        //4. Применение super и extends
        new GenericPecs().buildExtends(fullPerson);
        new GenericPecs().buildSuper(person);
    }

    public void print(Single<? extends FullPerson> personExtends ) {
        System.out.println(personExtends.getValue().getDateOfBirth());
    }

    public void printSuper(Single<? super FullPerson> personExtends ) {
        System.out.println(personExtends.getValue());
    }

    public void buildExtends(FullPerson fullPerson) {
        Single<? extends Person> personExtends = new Single<>(fullPerson);

        Person personExtendsValue = personExtends.getValue();

        //compile error
        //personExtends.setValue(new Person());
        //personExtends.setValue(new FullPerson());
    }

    public void buildSuper(Person person) {
        Single<? super FullPerson> personSuper = new Single<>(person);

        //compile error
        //Person person1 = personSuper.getValue();

        personSuper.setValue(new FullPerson());

    }
}
