package test.com.lvjinke.bit.Reviews; 

import com.lvjinke.bit.Reviews.RocketOff;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

/** 
* RocketOff Tester. 
* 
* @author <Authors name> 
* @since <pre>四月 22, 2018</pre> 
* @version 1.0 
*/ 
public class RocketOffTest { 

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
* Method: execute() 
* 
*/ 
@Test
public void testExecute() throws Exception { 
//TODO: Test goes here...
    RocketOff rocketOff = new RocketOff();
    rocketOff.run();
    System.out.println(Thread.currentThread());
    ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
    ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false,false);
    for(ThreadInfo threadInfo:threadInfos){
        System.out.println("threadInfo: "+threadInfo.getThreadName());
    }
} 


} 
