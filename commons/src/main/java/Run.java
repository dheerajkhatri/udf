import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Created by dheeraj.khatri on 14/06/17.
 */
public class Run {

    public static void main(String args[]) throws Exception {
        System.out.println("Starting Project...");
        final Injector injector = Guice.createInjector(new ServiceModule());
        final ServiceApplication application = injector.getInstance(ServiceApplication.class);

        application.run(new String[] {"server", "configuration.yaml"});
    }
}
