import Resource.HealthResource;
import com.google.inject.Inject;
import com.google.inject.Injector;
import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.configuration.UrlConfigurationSourceProvider;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by dheeraj.khatri on 14/06/17.
 */
public class ServiceApplication extends Application<Configuration> {

    private Injector injector;
    private String temp;

    @Inject
    public ServiceApplication(Injector injector) {this.injector = injector; this.temp = "ok";}

    @Override
    public void run(Configuration configuration, Environment environment) {
        environment.jersey().register(injector.getInstance(HealthResource.class));
    }

    @Override
    public void initialize(Bootstrap<Configuration> bootstrap) {
        bootstrap.setConfigurationSourceProvider(new UrlConfigurationSourceProvider() {
            @Override
            public InputStream open(String path) throws IOException {
                return ClassLoader.getSystemResourceAsStream(path);
            }
        });
        super.initialize(bootstrap);
    }
}
