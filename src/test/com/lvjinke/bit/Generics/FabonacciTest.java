package test.com.lvjinke.bit.Generics; 

import com.lvjinke.bit.Generics.Fabonacci;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* Fabonacci Tester. 
* 
* @author <Authors name> 
* @since <pre>四月 15, 2018</pre> 
* @version 1.0 
*/ 
public class FabonacciTest { 

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
    Fabonacci fabonacci = new Fabonacci();
    for(int i=0;i < 5;i++){

        System.out.println(fabonacci.next());
    }
}

/** 
* 
* Method: f(int n) 
* 
*/ 
@Test
public void testF() throws Exception { 
//TODO: Test goes here... 
} 


} 
