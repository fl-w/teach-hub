package com.itsfolarin.teachhub.app;

import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.component.page.Viewport;
import com.vaadin.flow.router.RouterLayout;
import com.vaadin.flow.server.InitialPageSettings;
import com.vaadin.flow.server.PageConfigurator;

@HtmlImport("frontend:/")
@Viewport("width=device-width, minimum-scale=1.0, initial-scale=1.0, user-scalable=no")
public class ApplicationLayout extends FlexLayout implements RouterLayout, PageConfigurator {

    public ApplicationLayout() {
    }

    private void init() {
        add(new Label("This is HomeView layout"));
    }

    @Override
    public void configurePage(InitialPageSettings initialPageSettings) {
        initialPageSettings.addMetaTag("apple-mobile-web-app-capable", "yes");
        initialPageSettings.addMetaTag("apple-mobile-web-app-status-bar-style", "black");
    }
}
