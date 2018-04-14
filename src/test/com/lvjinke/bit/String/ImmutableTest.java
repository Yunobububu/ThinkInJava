package test.com.lvjinke.bit.String; 

import com.lvjinke.bit.String.Immutable;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* Immutable Tester. 
* 
* @author <Authors name> 
* @since <pre>四月 13, 2018</pre> 
* @version 1.0 
*/ 
public class ImmutableTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: toUp(String s) 
* 
*/ 
@Test
public void testToUp() throws Exception { 
//TODO: Test goes here...
    String s = "I'll watch until my death ,from the day until my last day";
    String spp = Immutable.toUp(s);
    System.out.println(spp);
    System.out.println(s);

} 


} 
