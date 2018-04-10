package test.com.lvjinke.bit; 

import com.lvjinke.bit.IO.FormatedMemoryInput;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* FormatedMemoryInput Tester. 
* 
* @author <Authors name> 
* @since <pre>四月 7, 2018</pre> 
* @version 1.0 
*/ 
public class FormatedMemoryInputTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: read() 
* 
*/ 
@Test
public void testRead() throws Exception { 
//TODO: Test goes here...
    FormatedMemoryInput fmi = new FormatedMemoryInput("./src/IO.md");
    fmi.read();

} 


} 
