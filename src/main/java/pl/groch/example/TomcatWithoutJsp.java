package pl.groch.example;

import org.apache.catalina.LifecycleListener;
import org.apache.catalina.startup.Tomcat;


class TomcatWithoutJsp extends Tomcat {

	@Override
	public void initWebappDefaults(String contextPath) {

	}

	@Override
	public LifecycleListener getDefaultWebXmlListener() {

		return event -> {};
	}
}
