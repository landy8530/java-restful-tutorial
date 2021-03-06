package com.mindflow.restful.jersey;

import com.mindflow.restful.jersey.resource.OrderResource;
import com.mindflow.restful.jersey.resource.UserResource;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;

/**
 * ${DESCRIPTION}
 *
 * @author Ricky Fung
 * @create 2016-07-20 14:15
 */
public class RestJaxRsApplication extends ResourceConfig {

    /**
     * Register JAX-RS application components.
     */
    public RestJaxRsApplication() {

        // register application resources
        this.register(UserResource.class);
        this.register(OrderResource.class);

        // register filters
        register(RequestContextFilter.class);
        //register(LoggingResponseFilter.class);
        //register(CORSResponseFilter.class);

        // register exception mappers
        //register(GenericExceptionMapper.class);
        //register(AppExceptionMapper.class);
        //register(NotFoundExceptionMapper.class);

        // register features
        register(JacksonFeature.class);
        //register(MultiPartFeature.class);
    }
}
