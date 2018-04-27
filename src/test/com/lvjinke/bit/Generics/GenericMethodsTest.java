package test.com.lvjinke.bit.Generics; 

import com.lvjinke.bit.Generics.GenericMethods;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* GenericMethods Tester. 
* 
* @author <Authors name> 
* @since <pre>四月 15, 2018</pre> 
* @version 1.0 
*/ 
public class GenericMethodsTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: execute(T cl) 
* 
*/ 
@Test
public void testExecute() throws Exception { 
//TODO: Test goes here...
    GenericMethods.execute("");
    GenericMethods.execute(1);
    GenericMethods.execute(1.f);
    GenericMethods.execute("hello");
}


} 
