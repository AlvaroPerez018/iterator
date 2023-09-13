package devices;

public class Radio implements ElectronicDevice {

    private int volume = 0;
    private String name;

    public Radio(String name) {
        this.name = name;
    }

    @Override
    public void off() {
        System.out.println(name+ "RADIO is off");
    }

    @Override
    public void on() {
        System.out.println(name+ "RADIO is on");

    }

    @Override
    public void volumeDown() {
        volume--;
System.out.println(name + "RADIO volume at:" + volume);

    }

    @Override
    public void volumeUp() {

        volume++;
System.out.println(name + "RADIO volume at:" + volume);

    }
    }

