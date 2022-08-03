package dependencyinjection.injector;

import dependencyinjection.consumer.Consumer;
import dependencyinjection.consumer.MyDIApplication;
import dependencyinjection.service.EmailServiceImpl;

public class EmailServiceInjector implements MessageServiceInjector {

	@Override
	public Consumer getConsumer() {
		MyDIApplication app = new MyDIApplication();
		app.setService(new EmailServiceImpl());
		return app;
	}

}
