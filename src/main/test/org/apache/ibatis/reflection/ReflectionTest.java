package org.apache.ibatis.reflection;


import org.apache.ibatis.reflection.factory.DefaultObjectFactory;
import org.apache.ibatis.reflection.property.PropertyTokenizer;
import org.junit.jupiter.api.Test;

public class ReflectionTest {

    @Test
    public void testDefaultObjectFactory() {
        DefaultObjectFactory defaultObjectFactory = new DefaultObjectFactory();
        TestInterface testInterface = defaultObjectFactory.create(TestInterface.class);
    }

    @Test
    public void testPropertyTokenizer() {
        String name = "users[0].department.name";

        PropertyTokenizer propertyTokenizer = new PropertyTokenizer(name);


    }
}
