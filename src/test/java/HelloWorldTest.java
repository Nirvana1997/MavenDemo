import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* HelloWorld Tester. 
* 
* @author <Authors name> 
* @since <pre>ʮһ�� 5, 2016</pre> 
* @version 1.0 
*/ 
public class HelloWorldTest { 

/** 
* 
* Method: sayHello() 
* 
*/ 
@Test
public void testSayHello() throws Exception {
    HelloWorld hw = new HelloWorld();
    Assert.assertEquals("HelloWorld",hw.sayHello());
}


} 
