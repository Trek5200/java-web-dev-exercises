package exercises.lsn6inheritance.technology;

public abstract class Computer {

    private String cpu;
    private int memoryGb;
    private double screenSize;
    private String sound = "beep";

    public void displayCpu(){
        System.out.println("CPU: " + cpu);
    }

    public void displayMemory(){
        System.out.println("Memory: " + memoryGb);
    }

    public Computer(String cpu, int memoryGb, double screenSize){
        this.cpu = cpu;
        this.memoryGb = memoryGb;
        this.screenSize = screenSize;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getMemoryGb() {
        return memoryGb;
    }

    public void setMemoryGb(int memoryGb) {
        this.memoryGb = memoryGb;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }
}
