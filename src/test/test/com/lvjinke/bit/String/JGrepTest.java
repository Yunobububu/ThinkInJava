package test.test.com.lvjinke.bit.String; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;
import com.lvjinke.bit.String.JGrep;

/** 
* JGrep Tester. 
* 
* @author <Authors name> 
* @since <pre>四月 14, 2018</pre> 
* @version 1.0 
*/ 
public class JGrepTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: getText() 
* 
*/ 
@Test
public void testGetText() throws Exception { 
//TODO: Test goes here...
    JGrep jGrep = new JGrep("./src/com/lvjinke/bit/String/JGrep.java");
    jGrep.execute();
} 

/** 
* 
* Method: execute() 
* 
*/ 
@Test
public void testExecute() throws Exception { 
//TODO: Test goes here... 
} 


} 
