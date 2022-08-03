package dependencyinjection.injector;

import dependencyinjection.consumer.Consumer;
import dependencyinjection.consumer.MyDIApplication;
import dependencyinjection.service.SMSServiceImpl;

public class SMSServiceInjector implements MessageServiceInjector {

	@Override
	public Consumer getConsumer() {
		return new MyDIApplication(new SMSServiceImpl());
	}

}
