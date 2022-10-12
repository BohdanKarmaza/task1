package ua.kh.karmaza.bohdan;

public abstract class Phone{
    private String name;
    public String getName(){
        return name;
        }
    public void setName(String name) {
        this.name = name;
    }
    private String model;
    public String getModel() {
        return model;
        }
    public void setModel(String model) {
        this.model = model;
    }
    private String ROM;
    public String getROM() {
        return ROM;
        }
    public void setROM(String ROM) {
        this.ROM = ROM;
    }
    private String RAM;
    public String getRAM() {
        return RAM;
        }
    public void setRAM(String RAM) {
        this.RAM = RAM;
    }
    public Phone(String name, String model, String ROM, String RAM){
        this.name = name;
        this.model = model;
        this.ROM = ROM;
        this.RAM = RAM;
        }
    }



