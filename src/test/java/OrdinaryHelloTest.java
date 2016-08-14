
import org.junit.Assert;
import org.junit.Test;

public class OrdinaryHelloTest{
  
  @Test
  public void shouldSayHello(){
      OrdinaryHello oh = new OrdinaryHello();
      Assert.assertEquals("Hello World, ordinária!",oh.sayHello());
  }
  
}
