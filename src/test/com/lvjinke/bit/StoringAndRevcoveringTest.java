package test.com.lvjinke.bit; 

import com.lvjinke.bit.IO.StoringAndRevcovering;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.io.File;

/** 
* StoringAndRevcovering Tester. 
* 
* @author <Authors name> 
* @since <pre>四月 9, 2018</pre> 
* @version 1.0 
*/ 
public class StoringAndRevcoveringTest { 

@Before
public void before() throws Exception {
    File file = new File(".");
    System.out.println(file.getAbsoluteFile());
    System.out.println(file.getPath());
}

@After
public void after() throws Exception {
}

/** 
* 
* Method: out() 
* 
*/ 
@Test
public void testOut() throws Exception { 
//TODO: Test goes here...
    StoringAndRevcovering sar = new StoringAndRevcovering("./src/com/lvjinke/bit/out.txt");
    sar.out();
} 


} 
