package test.test.com.lvjinke.bit.Generics; 

import com.lvjinke.bit.Generics.Coffee;
import com.lvjinke.bit.Generics.CoffeeGenerator;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import com.lvjinke.bit.Generics.Generators;

import java.util.ArrayList;
import java.util.Collection;

/** 
* Generators Tester. 
* 
* @author <Authors name> 
* @since <pre>四月 15, 2018</pre> 
* @version 1.0 
*/ 
public class GeneratorsTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: fill(Collection<T> collection, Generator<T> gen, int n) 
* 
*/ 
@Test
public void testFill() throws Exception { 
//TODO: Test goes here...
    Collection<Coffee> coffees = new ArrayList<>();
    CoffeeGenerator coffeeGenerator = new CoffeeGenerator(4);
    Generators.fill(coffees,coffeeGenerator,2);
    System.out.println(coffees);
} 


} 
