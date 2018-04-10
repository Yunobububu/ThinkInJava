package test.com.lvjinke.bit; 

import com.lvjinke.bit.IO.AddLineNumber;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* AddLineNumber Tester. 
* 
* @author <Authors name> 
* @since <pre>四月 9, 2018</pre> 
* @version 1.0 
*/ 
public class AddLineNumberTest {


@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: addLineNumber() 
* 
*/ 
@Test
public void testAddLineNumber() throws Exception { 
//TODO: Test goes here...
    AddLineNumber aln = new AddLineNumber("./SRC/Dots/HelloDots.dot");
    aln.addLineNumber();
} 


} 
