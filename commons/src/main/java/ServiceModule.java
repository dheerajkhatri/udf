import com.flipkart.kloud.config.ConfigClient;
import com.flipkart.kloud.config.DynamicBucket;
import com.flipkart.kloud.config.error.ConfigServiceException;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;

import java.io.IOException;

/**
 * Created by dheeraj.khatri on 12/06/17.
 */
public class ServiceModule extends AbstractModule {

    @Override
    protected void configure() {

    }

    @Provides
    @Singleton
    DynamicBucket makeDynamicBucket() throws IOException, ConfigServiceException {
        final String bucketName = "khatri-test";
        final ConfigClient client = new ConfigClient("10.47.0.101", 80, 1);
        return client.getDynamicBucket(bucketName);
    }


}
