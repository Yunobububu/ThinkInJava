package test.com.lvjinke.bit.Generics; 

import com.lvjinke.bit.Generics.ContainerDifferenceMethod;
import com.lvjinke.bit.Generics.Sets;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

/** 
* ContainerDifferenceMethod Tester. 
* 
* @author <Authors name> 
* @since <pre>四月 15, 2018</pre> 
* @version 1.0 
*/ 
public class ContainerDifferenceMethodTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: methodsSet(Class<?> type) 
* 
*/ 
@Test
public void testMethodsSet() throws Exception { 
//TODO: Test goes here...
    Set<String> collset = ContainerDifferenceMethod.methodsSet(Collection.class);
    Set<String> listset = ContainerDifferenceMethod.methodsSet(List.class);
    System.out.println(collset);
    System.out.println(listset);
    System.out.println(Sets.difference(listset,collset));
    ContainerDifferenceMethod.interfaces(Collection.class);
    ContainerDifferenceMethod.interfaces(HashMap.class);
}

/** 
* 
* Method: interfaces(Class<?> type) 
* 
*/ 
@Test
public void testInterfaces() throws Exception { 
//TODO: Test goes here... 
} 


} 
