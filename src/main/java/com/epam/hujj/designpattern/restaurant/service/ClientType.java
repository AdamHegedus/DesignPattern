package com.epam.hujj.designpattern.restaurant.service;

import com.epam.hujj.designpattern.restaurant.menu.Menu;

public interface ClientType {

    /**
     * Client consumes the foods on the menu which is being ordered. It sets the
     * happiness of a client based on the menu items.
     */
    public void consume();

    /**
     * The client orders a menu.
     * @param menu, the list of Products the client ordered
     */
    public void orderMenu(Menu menu);
}
