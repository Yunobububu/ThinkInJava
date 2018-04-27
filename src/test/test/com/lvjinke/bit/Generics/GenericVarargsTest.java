package test.test.com.lvjinke.bit.Generics; 

import com.lvjinke.bit.Generics.RandomList;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.List;

/** 
* GenericVarargs Tester. 
* 
* @author <Authors name> 
* @since <pre>四月 15, 2018</pre> 
* @version 1.0 
*/ 
public class GenericVarargsTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: makeList(T... args) 
* 
*/ 
@Test
public void testMakeList() throws Exception { 
//TODO: Test goes here...
    List<String> ls = RandomList.GenericVarargs.makeList("a");
    ls = RandomList.GenericVarargs.makeList("abbcddsfe".split(""));
    System.out.println(ls);
} 


} 
