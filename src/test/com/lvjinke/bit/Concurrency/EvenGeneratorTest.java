package test.com.lvjinke.bit.Concurrency; 

import com.lvjinke.bit.Concurrency.EvenChecker;
import com.lvjinke.bit.Concurrency.EvenGenerator;
import com.lvjinke.bit.Concurrency.MutexEvenGenerator;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* EvenGenerator Tester. 
* 
* @author <Authors name> 
* @since <pre>四月 18, 2018</pre> 
* @version 1.0 
*/ 
public class EvenGeneratorTest { 

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
* Method: execute() 
* 
*/ 
@Test
public void testExecute() throws Exception { 
//TODO: Test goes here...
    EvenChecker.test(new MutexEvenGenerator());
}


} 
