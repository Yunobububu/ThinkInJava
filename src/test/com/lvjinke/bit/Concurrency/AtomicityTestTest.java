package test.com.lvjinke.bit.Concurrency; 

import com.lvjinke.bit.Concurrency.AtomicityTest;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/** 
* AtomicityTest Tester. 
* 
* @author <Authors name> 
* @since <pre>四月 18, 2018</pre> 
* @version 1.0 
*/ 
public class AtomicityTestTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: run() 
* 
*/ 
@Test
public void testRun() throws Exception { 
//TODO: Test goes here... 
} 


/** 
* 
* Method: getValue() 
* 
*/ 
@Test
public void testGetValue() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = AtomicityTest.getClass().getMethod("getValue"); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

/** 
* 
* Method: enevIncrement() 
* 
*/ 
@Test
public void testEnevIncrement() throws Exception { 
//TODO: Test goes here...
    AtomicityTest.execute();
/* 
try { 
   Method method = AtomicityTest.getClass().getMethod("enevIncrement"); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

} 
