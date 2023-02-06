package de.jena.sensinact.sthbnd.rest.tlc.control.filter;

import java.io.IOException;
import java.util.Optional;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.propertytypes.ServiceRanking;
import org.osgi.service.jakartars.whiteboard.propertytypes.JakartarsApplicationSelect;
import org.osgi.service.jakartars.whiteboard.propertytypes.JakartarsExtension;
import org.osgi.service.jakartars.whiteboard.propertytypes.JakartarsName;
import org.osgi.service.jakartars.whiteboard.propertytypes.JakartarsWhiteboardTarget;

import jakarta.servlet.http.HttpServletResponse;
import jakarta.ws.rs.container.ContainerRequestContext;
import jakarta.ws.rs.container.ContainerResponseContext;
import jakarta.ws.rs.container.ContainerResponseFilter;

/**
 * Handles responses that contain an Optional. It returns a 204 if the Optional. If not it will resolve the entity and set it as the response entity.
 * 
 * @author Juergen Albert
 * @since 21 Sep 2022
 */
@Component
@JakartarsExtension
@JakartarsName("OptionalResponse Handler")
@ServiceRanking(Integer.MIN_VALUE)
@JakartarsWhiteboardTarget("(!(optional.handler = false))")
@JakartarsApplicationSelect("(!(optional.handler = false))")
public class OptionalResponseFilter implements ContainerResponseFilter {

	
    /* 
     * (non-Javadoc)
     * @see javax.ws.rs.container.ContainerResponseFilter#filter(javax.ws.rs.container.ContainerRequestContext, javax.ws.rs.container.ContainerResponseContext)
     */
    @Override
    public void filter(ContainerRequestContext requestContext, ContainerResponseContext response) throws IOException {
        Object entity = response.getEntity();
        if(entity instanceof Optional<?> && ((Optional<?>) entity).isPresent()) {
        	response.setEntity(((Optional<?>) entity).get());
        	return;
        }
        if(entity == null || isNonPresentOptionalValue(entity)) {
            response.setStatus(HttpServletResponse.SC_NO_CONTENT);
            response.setEntity(null);
        }
    }

    @SuppressWarnings("rawtypes")
	private boolean isNonPresentOptionalValue(Object entity) {
        return entity instanceof Optional<?> && !((Optional)entity).isPresent();
    }
}