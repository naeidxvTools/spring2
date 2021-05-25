package net.imwork.zhanlong.spring_hibernate.service.impl;

import net.imwork.zhanlong.spring_hibernate.dao.PersonDao;
import net.imwork.zhanlong.spring_hibernate.model.Person;
import net.imwork.zhanlong.spring_hibernate.service.PersonService;

import java.util.List;

/**
 * @author Administrator
 */
public class PersonServiceImpl implements PersonService
{
    private PersonDao personDao;

    public void setPersonDao(PersonDao personDao)
    {
        this.personDao = personDao;
    }

    @Override
    public void save(Person person)
    {
        this.personDao.save(person);
    }

    @Override
    public Person getPersonById(int id)
    {
        return this.personDao.getPersonById(id);
    }

    @Override
    public List<Person> getPersonsByName(String name)
    {
        return this.personDao.getPersonsByName(name);
    }

    @Override
    public void delete(int id)
    {
        this.personDao.delete(id);
    }

    @Override
    public void update(Person person)
    {
        this.personDao.update(person);
    }
}
