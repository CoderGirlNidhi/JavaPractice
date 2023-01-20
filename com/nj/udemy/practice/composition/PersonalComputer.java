package com.nj.udemy.practice.composition;

public class PersonalComputer extends Product {

    private Monitor monitor;
    private Motherboard motherboard;
    private ComputerCase computerCase;

    public PersonalComputer(String model, String manufacturer, ComputerCase computerCase,Monitor monitor, Motherboard motherboard) {
        super(model, manufacturer);
        this.monitor = monitor;
        this.motherboard = motherboard;
        this.computerCase = computerCase;
    }
    private void drawLogo() {
        monitor.drawPixel(1200,1200, "blue");
    }

    public void powerUp() {
        computerCase.pressPowerButton();
        drawLogo();
    }



//
//    public Monitor getMonitor() {
//        return monitor;
//    }
//
//    public Motherboard getMotherboard() {
//        return motherboard;
//    }
//
//    public ComputerCase getComputerCase() {
//        return computerCase;
}
