package model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public class Prototype {
    public Prototype() {
        System.out.println("Prototype bean was created");
    }
}
