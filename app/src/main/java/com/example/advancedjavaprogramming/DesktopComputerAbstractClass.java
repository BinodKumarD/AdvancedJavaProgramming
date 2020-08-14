package com.example.advancedjavaprogramming;

public class DesktopComputerAbstractClass  extends  ComputerAbstractClass{

    private String mouse;
    private double cpuPower;
    private double ram;

    public DesktopComputerAbstractClass(String name, String screen, String keyboard,
                                        String mouse,double cpuPower,double ram) {
        super(name, screen, keyboard);
        this.mouse=mouse;
        this.cpuPower=cpuPower;
        this.ram=ram;
    }

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public double getCpuPower() {
        return cpuPower;
    }

    public void setCpuPower(double cpuPower) {
        if(cpuPower<=0){
            throw new IllegalArgumentException("cpuPower must be greater than 0");
        }
        this.cpuPower = cpuPower;
    }

    public double getRam() {
        return ram;
    }

    public void setRam(double ram) {
        if(ram<=0){
            throw  new IllegalArgumentException("Ram must be greater than 0");
        }
        this.ram = ram;
    }

    @Override
    public double evaluatePerformance() {
        return getCpuPower()*getRam();
    }

    @Override
    public String toString() {
        return String.format("%s%n%s: %f%n%s: %f",super.toString(),"CPU Power",getCpuPower(),"RAM",getRam());
    }
}
