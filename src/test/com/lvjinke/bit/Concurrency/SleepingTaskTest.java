package test.com.lvjinke.bit.Concurrency; 

import com.lvjinke.bit.Concurrency.SimpleDaemons;
import com.lvjinke.bit.Concurrency.SimplePriorities;
import com.lvjinke.bit.Concurrency.SleepingTask;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/** 
* SleepingTask Tester. 
* 
* @author <Authors name> 
* @since <pre>四月 18, 2018</pre> 
* @version 1.0 
*/ 
public class SleepingTaskTest { 

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
//    ExecutorService exec = Executors.newCachedThreadPool();
//    for(int i = 0;i < 5;i++){
//        exec.execute(new SimplePriorities(Thread.MIN_PRIORITY));
//    }
//    exec.execute(new SimplePriorities(Thread.MAX_PRIORITY));
//    exec.shutdown();
    for(int i = 0; i < 10;i++){
        Thread daemon = new Thread(new SimpleDaemons());
        daemon.setDaemon(true);
        daemon.start();
    }
    TimeUnit.MILLISECONDS.sleep(3);
} 


} 
