package com.example.demo.repository;

import com.example.demo.domain.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class PersonRepository {

    private List<Person> personList = new ArrayList<>();

    public PersonRepository(){
        initPersonList();
    }

    public Optional<Person> get(Long id){
        return personList.stream().filter(person -> person.getId().equals(id)).findFirst();
    }

    public List<Person> getAll(){
        return personList;
    }

    public Person save(Person request){
        personList.add(request);
        return request;
    }

    public String delete(Long id){
        Optional<Person> personOptional = get(id);

        if(personOptional.isPresent()){
            personList.remove(personOptional.get());
            return "Removed";
        }
        return null;
    }

    public Person update(Person request)
    {
        Optional<Person> personOptional =get(request.getId());
        personOptional.ifPresent(personList::remove);
        personList.add(request);
        return get(request.getId()).get();
    }

    private void initPersonList(){
        personList.add(Person.builder()
                .id(1L)
                .name("Ana")
                .age(25)
                .city("Ploiesti")
                .additionalInfo("student")
                .build());

        personList.add(Person.builder()
                .id(2L)
                .name("Andrei")
                .age(26)
                .city("Pitesti")
                .additionalInfo("student")
                .build());

        personList.add(Person.builder()
                .id(3L)
                .name("Catalin")
                .age(23)
                .city("Bucuresti")
                .additionalInfo("student")
                .build());

        personList.add(Person.builder()
                .id(4L)
                .name("Georgiana")
                .age(23)
                .city("Ploiesti")
                .additionalInfo("student")
                .build());
    }
}
