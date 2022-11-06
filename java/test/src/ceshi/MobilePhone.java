package ceshi;

public class MobilePhone extends Phone{
	private String band;
    private String number;

    public MobilePhone(String band, String number) {
        this.band = band;
        this.number = number;
    }

    public static void main(String[] args) {

        MobilePhone phone = new MobilePhone("SAMSUNG", "13811111111");

        phone.display();

    }

    void display() {
        System.out.println("Phone Number="+number);
    }
}

abstract class Phone {
    abstract void display();
}

