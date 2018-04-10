package test.com.lvjinke.bit; 

import com.lvjinke.bit.IO.BufferedInputFile;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.io.File;
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
    //test FileNameFilter
    File file = new File("./src/com/lvjinke/bit");
    //FilenameFilter filenameFilter = new DirFilter();

} 

@After
public void after() throws Exception {
    //get a list of files under the filepath;
    File files= new File(".");
    String[] f = files.list();
    for(String s: f){
        System.out.println(s);
    }
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
