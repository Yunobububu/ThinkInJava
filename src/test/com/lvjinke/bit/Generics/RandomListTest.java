package test.com.lvjinke.bit.Generics; 

import com.lvjinke.bit.Generics.RandomList;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/** 
* RandomList Tester. 
* 
* @author <Authors name> 
* @since <pre>四月 15, 2018</pre> 
* @version 1.0 
*/ 
public class RandomListTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: select() 
* 
*/ 
@Test
public void testSelect() throws Exception { 
//TODO: Test goes here...
    Collection<String> collection = new ArrayList<>(
            Arrays.asList("We dont talk any more, like we used to do".split(" ")));
    RandomList<String> randomList = new RandomList<>(collection);
    for(int i = 0;i < 10;i++){

        System.out.println(randomList.select());
    }
}


} 
