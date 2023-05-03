package testscript;

import org.testng.annotations.Test;

import genric.Fetch_data;
import genric.Genric_class;
import pom.Pom;

public class Login_script extends Genric_class
{
@Test
public void test()
{
	String un=Fetch_data.get_data("sheet", 0, 0);
	String pwd=Fetch_data.get_data("sheet", 0, 1);
	Pom p = new Pom(driver);
	p.username(un);
	p.password(pwd);
	p.login_btn();
}
}
  