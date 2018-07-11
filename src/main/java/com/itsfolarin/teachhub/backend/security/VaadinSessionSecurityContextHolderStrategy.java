package com.itsfolarin.teachhub.backend.security;

import com.vaadin.flow.server.VaadinSession;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolderStrategy;
import org.springframework.security.core.context.SecurityContextImpl;

public class VaadinSessionSecurityContextHolderStrategy implements SecurityContextHolderStrategy {


    public VaadinSessionSecurityContextHolderStrategy() {

    }

    @Override
    public void clearContext() {
        setContext(null);
    }

    private VaadinSession getSession() {
        VaadinSession session = VaadinSession.getCurrent();

        if (session == null)
            throw new IllegalStateException("No session found in current thread.");

        return session;
    }

    @Override
    public SecurityContext getContext() {
        VaadinSession session = getSession();
        SecurityContext context = session.getAttribute(SecurityContext.class);

        if (context == null) {
            context = createEmptyContext();
            setContext(context);
        }

        return context;
    }

    @Override
    public void setContext(SecurityContext securityContext) {
        VaadinSession session = getSession();
        if (session != null)
            session.setAttribute(SecurityContext.class, securityContext);
    }

    @Override
    public SecurityContext createEmptyContext() {
        return new SecurityContextImpl();
    }
}
