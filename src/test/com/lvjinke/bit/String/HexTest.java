package test.com.lvjinke.bit.String; 

import com.lvjinke.bit.String.Hex;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* Hex Tester. 
* 
* @author <Authors name> 
* @since <pre>四月 13, 2018</pre> 
* @version 1.0 
*/ 
public class HexTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: format(List<Byte> data) 
* 
*/ 
@Test
public void testFormat() throws Exception { 
//TODO: Test goes here...
    Hex hex = new Hex("./src/com/lvjinke/bit/String/Concatenation.class");
    System.out.println(hex.format());

} 

/** 
* 
* Method: getFile(String filepath) 
* 
*/ 
@Test
public void testGetFile() throws Exception { 
//TODO: Test goes here... 
} 


} 
