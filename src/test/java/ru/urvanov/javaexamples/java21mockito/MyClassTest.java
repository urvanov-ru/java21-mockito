package ru.urvanov.javaexamples.java21mockito;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class MyClassTest {

    @InjectMocks
    MyClass myClass;
    
    @Spy
    MyDependencyClass myDependencyClass;
    
    @Test
    void testSum() {
        assertEquals(5, myClass.sum(3, 2));
    }
    
    @Test
    void testName() {
        String actual = myClass.name("Vasya");
        assertEquals("Name: Vasya1", actual);
        verify(myDependencyClass).dependencyMethod(eq("Name: Vasya"));
    }

}
