package com.itsfolarin.teachhub.app.views;

import com.itsfolarin.teachhub.app.ApplicationLayout;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.router.Route;

@Route(value = "login", layout = ApplicationLayout.class)
public class LoginView extends Div {

    public LoginView() {
        add(new Label("this is the login"));
    }
}
