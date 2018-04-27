package test.com.lvjinke.bit.Generics; 

import com.lvjinke.bit.Generics.GenericArray;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* GenericArray Tester. 
* 
* @author <Authors name> 
* @since <pre>四月 16, 2018</pre> 
* @version 1.0 
*/ 
public class GenericArrayTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
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

/** 
* 
* Method: set(int index, T t) 
* 
*/ 
@Test
public void testSet() throws Exception { 
//TODO: Test goes here...
    GenericArray<Integer> gai = new GenericArray<>(10);
//    Integer[] a = gai.rep();
    Object[] oa = gai.rep();

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


} 
