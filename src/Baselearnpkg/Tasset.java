package Baselearnpkg;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Tasset {

@Test(priority=2)
public void assertfunc()
{

SoftAssert st = new SoftAssert();

System.out.println("Before assert ");
st.assertEquals("st", "String");

System.out.println("After assert ");

st.assertAll();



}
	
@Test(priority=1)
public void Hardassert()
{

System.out.println("Before assert ");
Assert.assertEquals("st", "String");


System.out.println("After assert ");





}



}

