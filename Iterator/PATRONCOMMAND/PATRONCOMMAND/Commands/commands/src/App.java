
import java.util.ArrayList;

import commands.TurnOffRadio;
import commands.TurnOffTelevision;
import commands.TurnOnRadio;
import commands.TurnOnTelevision;
import commands.VolumeDownRadio;
import commands.VolumeDownTelevision;
import commands.VolumeUpRadio;
import commands.VolumeUpTelevision;
import devices.ElectronicDevice;
import devices.Radio;
import devices.Television;

public class App {

public static void main(String[]args) throws Exception{
    ElectronicDevice televisionOne =
    new Television("SAMSUNG");

    TurnOnTelevision onCommand = new TurnOnTelevision(televisionOne);

    DeviceButton onPressed;
    onPressed = new DeviceButton(onCommand);
    onPressed.press();

    TurnOffTelevision offCommand = new TurnOffTelevision(televisionOne);
    onPressed = new DeviceButton(offCommand);
    onPressed.press();

    VolumeUpTelevision volUpCommandTV = new VolumeUpTelevision(televisionOne);
    onPressed = new DeviceButton(volUpCommandTV);
    onPressed.press();
    onPressed.press();
    onPressed.press();

    VolumeDownTelevision volDownCommandTV = new VolumeDownTelevision(televisionOne);
    onPressed = new DeviceButton(volDownCommandTV);
    onPressed.press();




ElectronicDevice radioTwo = new Radio("HUAWEI");

    TurnOnRadio onCommandTwo = new TurnOnRadio(radioTwo);

    DeviceButton onPressedTwo;
    onPressed = new DeviceButton(onCommand);
    onPressed.press();

    ElectronicDevice televisionTwo = new Television("SONY");
    ElectronicDevice radioFour = new Radio("CUATRO");
    list<ElectronicDevice> allDevices = new ArrayList<>();


    TurnOffRadio offCommandR = new TurnOffRadio(radioTwo);
    onPressed = new DeviceButton(offCommandR);
    onPressed.press();

    VolumeUpRadio volUpCommand = new VolumeUpRadio(radioTwo);
    onPressed = new DeviceButton(volUpCommand);
    onPressed.press();
    onPressed.press();
    onPressed.press();

    VolumeDownRadio volDownCommand = new VolumeDownRadio(radioTwo);
    onPressed = new DeviceButton(volDownCommand);
    onPressed.press();

}

}


