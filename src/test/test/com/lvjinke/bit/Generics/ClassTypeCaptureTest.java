package test.test.com.lvjinke.bit.Generics; 

import com.lvjinke.bit.Generics.Breve;
import com.lvjinke.bit.Generics.Coffee;
import com.lvjinke.bit.Generics.Latte;
import com.lvjinke.bit.Generics.WatercolorsSet;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

/** 
* ClassTypeCapture Tester. 
* 
* @author <Authors name> 
* @since <pre>四月 15, 2018</pre> 
* @version 1.0 
*/ 
public class ClassTypeCaptureTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: execute(Class<?> cl) 
* 
*/ 
@Test
public void testExecute() throws Exception { 
//TODO: Test goes here...
    WatercolorsSet.ClassTypeCapture<Coffee> cl = new WatercolorsSet.ClassTypeCapture<>(Coffee.class);
    cl.execute(Breve.class);
    cl.execute(Latte.class);
    WatercolorsSet.ClassTypeCapture<Breve> cll = new WatercolorsSet.ClassTypeCapture<>(Breve.class);
    cll.execute(Coffee.class);
    cll.execute(Breve.class);
} 


} 
