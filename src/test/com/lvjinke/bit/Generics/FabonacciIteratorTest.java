package test.com.lvjinke.bit.Generics; 

import com.lvjinke.bit.Generics.FabonacciIterator;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* FabonacciIterator Tester. 
* 
* @author <Authors name> 
* @since <pre>四月 15, 2018</pre> 
* @version 1.0 
*/ 
public class FabonacciIteratorTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: iterator() 
* 
*/ 
@Test
public void testIterator() throws Exception { 
//TODO: Test goes here...
//    for(int i: new FabonacciIterator(18)){
//        System.out.print(i+" ");
//    }
    FabonacciIterator ff = new FabonacciIterator(5);
    System.out.println(ff.next());

} 


} 
