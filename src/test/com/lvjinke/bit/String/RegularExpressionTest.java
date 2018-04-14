package test.com.lvjinke.bit.String; 

import com.lvjinke.bit.String.RegularExpression;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* RegularExpression Tester. 
* 
* @author <Authors name> 
* @since <pre>四月 14, 2018</pre> 
* @version 1.0 
*/ 
public class RegularExpressionTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: execute() 
* 
*/ 
@Test
public void testExecute() throws Exception { 
//TODO: Test goes here...
    String poem = "hold no land,father no children";
    String regex = "\\w*o\\w*";
    RegularExpression regularExpression = new RegularExpression(poem,regex);
    regularExpression.execute();
} 


} 
