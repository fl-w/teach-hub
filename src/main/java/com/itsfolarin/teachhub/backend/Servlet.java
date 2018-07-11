package com.itsfolarin.teachhub.backend;

import com.vaadin.flow.server.VaadinServlet;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;

@Component
public class Servlet extends VaadinServlet {

    @Override
    protected void servletInitialized() throws ServletException {
        super.servletInitialized();

        getService().setSystemMessagesProvider(messageInfo -> globalSystemMessageHandler());
    }

    @Bean
    public GlobalSystemMessageHandler globalSystemMessageHandler() {
        return new GlobalSystemMessageHandler();
    }
}
