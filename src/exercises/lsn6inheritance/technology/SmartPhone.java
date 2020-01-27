package exercises.lsn6inheritance.technology;

public class SmartPhone extends Computer{
    private String networkProvider;

    public SmartPhone(String aNetworkProvider, String aCpu, int aMemoryGb, double aScreenSize) {
        super(aCpu, aMemoryGb, aScreenSize);
        networkProvider = aNetworkProvider;
    }

    public String getNetworkProvider() {
        return networkProvider;
    }

    public void setNetworkProvider(String networkProvider) {
        this.networkProvider = networkProvider;
    }
}
