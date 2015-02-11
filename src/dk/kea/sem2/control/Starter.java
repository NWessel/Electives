package dk.kea.sem2.control;

import dk.kea.sem2.view.ValgFagsJFrame;


public class Starter {

    public static void main(String[] args) {
        
        Controller control = new Controller();
        ValgFagsJFrame mainframe = new ValgFagsJFrame(control);
    }   
}
