package test.test.com.lvjinke.bit.Generics; 

import com.lvjinke.bit.Generics.Coffee;
import com.lvjinke.bit.Generics.Generator;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import com.lvjinke.bit.Generics.BasicGenerator;

/** 
* BasicGenerator Tester. 
* 
* @author <Authors name> 
* @since <pre>四月 15, 2018</pre> 
* @version 1.0 
*/ 
public class BasicGeneratorTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: next() 
* 
*/ 
@Test
public void testNext() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: creat(Class<T> type) 
* 
*/ 
@Test
public void testCreat() throws Exception { 
//TODO: Test goes here...
    Generator<Coffee> coffeeGenerator = BasicGenerator.creat(Coffee.class);
    for(int i = 0;i < 5;i++){
        System.out.println(coffeeGenerator.next());
    }
} 


} 
