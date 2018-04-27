package test.com.lvjinke.bit.Reviews; 

import com.lvjinke.bit.Reviews.RevCallable;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/** 
* RevCallable Tester. 
* 
* @author <Authors name> 
* @since <pre>四月 22, 2018</pre> 
* @version 1.0 
*/ 
public class RevCallableTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: call() 
* 
*/ 
@Test
public void testCall() throws Exception { 
//TODO: Test goes here...
    ExecutorService exec = Executors.newCachedThreadPool();
    for(int i = 0;i < 5;i++){
        Future<Integer> f = exec.submit(new RevCallable());
        System.out.println(f.get());
    }
} 


} 
