package ua.kh.karmaza.bohdan;

public class SamsungPhone extends Phone implements PhoneConnection, PhoneMedia {

    public SamsungPhone(String name, String model, String ROM, String RAM, String cameraResolution) {
        super(name, model, ROM, RAM);
        this.cameraResolution = cameraResolution;
    }
    private String cameraResolution;
    public String getCameraResolution() {
        return cameraResolution;
    }
    public void setCameraResolution(String cameraResolution) {
        this.cameraResolution = cameraResolution;
    }
    @Override
    public void makePhoto() {
        System.out.println("Photo saved");
    }

    @Override
    public void record() {
        System.out.println("Video is recorded");
    }

    @Override
    public void call(String addressee) {
        System.out.println("Calling to " + addressee);
    }

    @Override
    public void sendMessage(String text, String addressee) {
        System.out.println("Message:'" + text + "' sent to " + addressee);
    }

}
