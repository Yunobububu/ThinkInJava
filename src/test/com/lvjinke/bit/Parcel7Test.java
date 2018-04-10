package test.com.lvjinke.bit; 

import com.lvjinke.bit.Parcel7;
import com.lvjinke.bit.innerclasses.Parcel1;
import com.lvjinke.bit.innerclasses.Parcel2;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* Parcel7 Tester. 
* 
* @author <Authors name> 
* @since <pre>四月 10, 2018</pre> 
* @version 1.0 
*/ 
public class Parcel7Test { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: destination() 
* 
*/ 
@Test
public void testDestination() throws Exception { 
//TODO: Test goes here...
    Parcel7 p7 = new Parcel7();
    Parcel2 p2 = new Parcel2();
    String s = p7.destination(p2).readLable();
    System.out.println(s);
} 


} 
