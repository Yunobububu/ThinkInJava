package test.com.lvjinke.bit.Generics; 

import com.lvjinke.bit.Generics.Coffee;
import com.lvjinke.bit.Generics.CoffeeGenerator;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* CoffeeGenerator Tester. 
* 
* @author <Authors name> 
* @since <pre>四月 15, 2018</pre> 
* @version 1.0 
*/ 
public class CoffeeGeneratorTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: next() 
* 
*/ 
@Test
public void testNext() throws Exception { 
//TODO: Test goes here...
    CoffeeGenerator coffeeGenerator = new CoffeeGenerator();
    for(int i = 0;i < 5;i++){
        System.out.println(coffeeGenerator.next());
    }
    for(Coffee coffee: new CoffeeGenerator<Coffee>(5)){
        System.out.println(coffee);
    }
} 

/** 
* 
* Method: iterator() 
* 
*/ 
@Test
public void testIterator() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: hasNext() 
* 
*/ 
@Test
public void testHasNext() throws Exception { 
//TODO: Test goes here... 
} 


} 
