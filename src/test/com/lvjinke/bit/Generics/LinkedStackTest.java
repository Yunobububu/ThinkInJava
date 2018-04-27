package test.com.lvjinke.bit.Generics; 

import com.lvjinke.bit.Generics.LinkedStack;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* LinkedStack Tester. 
* 
* @author <Authors name> 
* @since <pre>四月 15, 2018</pre> 
* @version 1.0 
*/ 
public class LinkedStackTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: push(T item) 
* 
*/ 
@Test
public void testPush() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: peek() 
* 
*/ 
@Test
public void testPeek() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: pop() 
* 
*/ 
@Test
public void testPop() throws Exception { 
//TODO: Test goes here...
    LinkedStack<String> ls = new LinkedStack<>();
    for(String s: "tell me why".split(" ")){
        ls.push(s);
    }
    String s;
    while((s = ls.pop())!= null){
        System.out.println(s);
    }
} 

/** 
* 
* Method: clear() 
* 
*/ 
@Test
public void testClear() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: end() 
* 
*/ 
@Test
public void testEnd() throws Exception { 
//TODO: Test goes here... 
} 


} 
