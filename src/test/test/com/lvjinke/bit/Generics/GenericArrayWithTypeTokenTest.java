package test.test.com.lvjinke.bit.Generics; 

import com.lvjinke.bit.Generics.Sets;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

/** 
* GenericArrayWithTypeToken Tester. 
* 
* @author <Authors name> 
* @since <pre>四月 16, 2018</pre> 
* @version 1.0 
*/ 
public class GenericArrayWithTypeTokenTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: put(T item, int index) 
* 
*/ 
@Test
public void testPut() throws Exception { 
//TODO: Test goes here...
    Sets.GenericArrayWithTypeToken<Integer> gat = new Sets.GenericArrayWithTypeToken(Integer.class,10);
    gat.put(4,5);
    Integer[] ints =  gat.rep();
    System.out.println(ints[5]);
} 

/** 
* 
* Method: rep() 
* 
*/ 
@Test
public void testRep() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: get(int index) 
* 
*/ 
@Test
public void testGet() throws Exception { 
//TODO: Test goes here... 
} 


} 
