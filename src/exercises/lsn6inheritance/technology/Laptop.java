package exercises.lsn6inheritance.technology;

public class Laptop extends Computer {
    private String name;
    private int numberUsbPorts;
    private String diskDriveType;

    public Laptop(String aName, int aNumberUsbPorts, String aDiskDriveType, String aCpu, int aMemoryGb, double aScreenSize) {
        super(aCpu, aMemoryGb, aScreenSize);
        name = aName;
        numberUsbPorts = aNumberUsbPorts;
        diskDriveType = aDiskDriveType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberUsbPorts() {
        return numberUsbPorts;
    }

    public void setNumberUsbPorts(int numberUsbPorts) {
        this.numberUsbPorts = numberUsbPorts;
    }

    public String getDiskDriveType() {
        return diskDriveType;
    }

    public void setDiskDriveType(String diskDriveType) {
        this.diskDriveType = diskDriveType;
    }
}

