package net.imwork.zhanlong.spring_hibernate.dao.impl;

import net.imwork.zhanlong.spring_hibernate.dao.PersonDao;
import net.imwork.zhanlong.spring_hibernate.model.Person;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import java.util.List;

/**
 * @author Administrator
 */
@SuppressWarnings("all")
public class PersonDaoImpl extends HibernateDaoSupport implements PersonDao
{
    @Override
    public void save(Person person)
    {
        this.getHibernateTemplate().save(person);
    }

    @Override
    public Person getPersonById(int id)
    {
        return this.getHibernateTemplate().get(Person.class, id);
    }

    @Override
    @Deprecated
    public List<Person> getPersonsByName(String name)
    {
        //意思就是说：?号占位参数在考虑作废，请使用命名参数或者Jpa样式的占位参数代替。
        //方法一：改成命名参数的方式：String hql = "select t from t_usert where t.name=:name";
        //方法二：改成JPA占位符的方式（?号后面有带数字）：String hql = "select t from t_user t where t.name=?0";
        // 其中"?"后面的"0"代表索引位置，在HQL语句中可重复出现，并不一定要从0开始，可以是任何数字，只是参数要与其对应上。

        List<Person> list = (List<Person>) this.getHibernateTemplate().find(
                "from Person p where p.name like ?0", "%" + name + "%");
        return list;
    }

    @Override
    public void delete(int id)
    {
        Person person = this.getHibernateTemplate().get(Person.class, id);
        this.getHibernateTemplate().delete(person);
    }

    @Override
    public void update(Person person)
    {
        this.getHibernateTemplate().update(person);
    }
}
