package test.com.lvjinke.bit; 

import com.lvjinke.bit.BufferedInputFile;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.io.StringReader;

/** 
* BufferedInputFile Tester. 
* 
* @author <Authors name> 
* @since <pre>四月 6, 2018</pre> 
* @version 1.0 
*/ 
public class BufferedInputFileTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: read(String fileName) 
* 
*/ 
@Test
public void testRead() throws Exception {
//TODO: Test goes here...
    BufferedInputFile bif = new BufferedInputFile();
    StringReader sr = new StringReader(bif.read("./src/IO.md"));
    int c;
    while((c = sr.read())!= -1){
        System.out.println((char)c);
    }
    System.out.println(bif.read("./src/IO.md"));
} 


} 
