package com.kelly.loginTest;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value = "")
public class Test extends VerticalLayout {


    public Test() {
        add(
                new H1("HEJ")
        );
    }
}
