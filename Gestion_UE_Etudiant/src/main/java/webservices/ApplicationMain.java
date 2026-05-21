package webservices;

import io.swagger.v3.jaxrs2.integration.resources.OpenApiResource;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.Set;

@ApplicationPath("api")
public class ApplicationMain extends Application {
    @Override
    public Set<Class<?>> getClasses() {
        return Set.of(
                webservices.UeWs.class,
                OpenApiResource.class
        );
    }
}
