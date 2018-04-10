package test.com.lvjinke.bit.innerclasses; 

import com.lvjinke.bit.innerclasses.Parcel6;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* Parcel6 Tester. 
* 
* @author <Authors name> 
* @since <pre>四月 10, 2018</pre> 
* @version 1.0 
*/ 
public class Parcel6Test { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: track() 
* 
*/ 
@Test
public void testTrack() throws Exception { 
//TODO: Test goes here...
    Parcel6 p6 = new Parcel6();
    p6.track();
} 


/** 
* 
* Method: internalTracking(boolean b) 
* 
*/ 
@Test
public void testInternalTracking() throws Exception { 
//TODO: Test goes here... 
/* 
try { 
   Method method = Parcel6.getClass().getMethod("internalTracking", boolean.class); 
   method.setAccessible(true); 
   method.invoke(<Object>, <Parameters>); 
} catch(NoSuchMethodException e) { 
} catch(IllegalAccessException e) { 
} catch(InvocationTargetException e) { 
} 
*/ 
} 

} 
