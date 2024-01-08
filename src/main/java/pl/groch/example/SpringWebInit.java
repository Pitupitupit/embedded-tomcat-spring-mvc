package pl.groch.example;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import jakarta.servlet.ServletContext;


class SpringWebInit implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext container) {

		var applicationContext = new AnnotationConfigWebApplicationContext();
		applicationContext.register(SpringConfig.class);
		var contextLoaderListener = new ContextLoaderListener(applicationContext);
		container.addListener(contextLoaderListener);

		var dispatcherServlet = new DispatcherServlet(applicationContext);
		var dispatcher = container.addServlet("dispatcher-servlet", dispatcherServlet);
		dispatcher.setLoadOnStartup(1);
		dispatcher.addMapping("/");
	}
}
