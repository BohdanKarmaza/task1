package ua.kh.karmaza.bohdan;

public interface PhoneConnection {
    public void call(String addressee);

    public void sendMessage(String text, String addressee);
}

