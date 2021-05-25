package net.imwork.zhanlong.spring_hibernate.client;

import net.imwork.zhanlong.spring_hibernate.model.Person;
import net.imwork.zhanlong.spring_hibernate.service.PersonService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author Administrator
 */
public class Test
{
    public static void main(String[] args)
    {
        //        BeanFactory factory = new XmlBeanFactory(new ClassPathResource("spring_hibernate-config.xml"));
        BeanFactory factory = new ClassPathXmlApplicationContext("spring_hibernate-config.xml");

        PersonService service = (PersonService)factory.getBean("personService");

//        Person p = service.getPersonById(1);
//        System.out.println(p);
//
//        Person person = new Person();
//        person.setName("zhanlong");
//        person.setAge(26);
//        service.save(person);

////        service.delete(1);
//
        List<Person> list = service.getPersonsByName("zhanlong");
        System.out.println(list.get(0).getName());

    }

}
