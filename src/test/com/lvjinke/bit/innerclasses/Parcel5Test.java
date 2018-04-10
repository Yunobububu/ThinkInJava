package test.com.lvjinke.bit.innerclasses; 

import com.lvjinke.bit.innerclasses.Destination;
import com.lvjinke.bit.innerclasses.Parcel5;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* Parcel5 Tester. 
* 
* @author <Authors name> 
* @since <pre>四月 10, 2018</pre> 
* @version 1.0 
*/ 
public class Parcel5Test { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: destination(String s) 
* 
*/ 
@Test
public void testDestination() throws Exception { 
//TODO: Test goes here...
    Parcel5 p5 = new Parcel5();
    Destination d = p5.destination("shanghai");
    System.out.println(d.readLable());
}


} 
