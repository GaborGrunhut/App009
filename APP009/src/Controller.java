/*
* File: Controller.java
* Author: Grünhut Gábor
* Copyright: 2023, Grünhut Gábor
* Group: Szoft II 1/E
* Date: 2023-11-30
* Github: https://github.com/GaborGrunhut/App009
* Licenc: GNU GPL
*/

public class Controller implements Controllable {

    @Override
    public void start() {
        System.out.println("A funkció elindult.");
    }

    @Override
    public void stop() {
        System.out.println("A funkció leállt.");
    }

    @Override
    public void restart() {
        System.out.println("A funkció újraindult.");
    }
}