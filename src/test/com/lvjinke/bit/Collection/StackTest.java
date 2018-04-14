package test.com.lvjinke.bit.Collection; 

import com.lvjinke.bit.Collection.Stack;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* Stack Tester. 
* 
* @author <Authors name> 
* @since <pre>四月 12, 2018</pre> 
* @version 1.0 
*/ 
public class StackTest {
    Stack<String> stringStack = new Stack<>();

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: pop() 
* 
*/ 
@Test
public void testPop() throws Exception { 
//TODO: Test goes here...
    for(String s : "hold the door".split(" ")){
        stringStack.push(s);
    }
    System.out.println(stringStack.isEmpty());
    System.out.println(stringStack.peek());
    stringStack.pop();
    //System.out.println(stringStack.peek());
    while(!stringStack.isEmpty()){
        System.out.println(stringStack.pop());

    }

} 

/** 
* 
* Method: isEmpty() 
* 
*/ 
@Test
public void testIsEmpty() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: push(T e) 
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


} 
