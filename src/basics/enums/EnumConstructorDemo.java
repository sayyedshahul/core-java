package basics.enums;

enum Phones{
    GALAXY_Z_FLIP7(95999), GOGGLE_PIXEL_9A, ONEPLUS_15R(52999), GALAXY_A56(44999);

    private int price;

    private Phones(){
        this.price = 10000;
    }

    private Phones(int price){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class EnumConstructorDemo {
    public static void main(String[] args){
        Phones newPhone = Phones.ONEPLUS_15R;
        System.out.println(newPhone.name() + " price is " + newPhone.getPrice());

        newPhone.setPrice(100000);
        System.out.println(newPhone.name() + " price is " + newPhone.getPrice());

        System.out.println("-------------------------------------------------------");
        for(Phones phone: Phones.values()){
            System.out.println(phone.name() + " price is " + phone.getPrice());
        }
    }
}
