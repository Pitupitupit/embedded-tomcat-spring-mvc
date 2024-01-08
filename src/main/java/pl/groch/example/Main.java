package pl.groch.example;

import java.io.File;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;


class Main {

	public static void main(String[] args) throws LifecycleException {

		Tomcat tomcat = new TomcatWithoutJsp();

		tomcat.setPort(8080);
		tomcat.getConnector();
		tomcat.addWebapp("", new File("src/main/webapp/").getAbsolutePath());

		tomcat.start();
		tomcat.getServer().await();
	}
}
