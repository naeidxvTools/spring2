package net.imwork.zhanlong.spring_hibernate.service;

import net.imwork.zhanlong.spring_hibernate.model.Person;

import java.util.List;

/**
 * @author Administrator
 */
@SuppressWarnings("all")
public interface PersonService
{
    public void save(Person person);

    public Person getPersonById(int id);

    public List<Person> getPersonsByName(String name);

    public void delete(int id);

    public void update(Person person);
}
