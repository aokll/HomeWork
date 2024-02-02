package less4;

import java.io.FileWriter;

public class Buy {
    private int toyBear = 5;
    private int toyHorse = 5;
    private int toCar = 5;
    private int totalPurchasesMade = 0;

    private String[] customers = new String[]{
            "Viktor",
            "Elena",
            "Pavel",
            "Iren",
            "Olya",
            "Mirra"
    };

    private String[] products = new String[]{
            "Bear",
            "Horse",
            "Car"
    };

    public String toBuy(Customer customer, Product product, Order order) throws Exception {
        if (busting(customers, customer.name)){
            throw new ToyException("Такого покупателя нет в базе данных " + "\n" + "[Покупатель - " + customer.name
                    + "] Игрушка - " + " " + product.title
                    + " Номер заказа - " + order.number + ")" + "\n" +
                    "Количество совершенных покупок - " + totalPurchasesMade);
        } else if (busting(products, product.title)) {
            throw new ToyException("Таких игрушек нет в базе данных " + "\n" + "(Покупатель - " + customer.name
                    + " [Игрушка - " + " " + product.title
                    + "] Номер заказа - " + order.number + ") " + "\n" +
                    "Количество совершенных покупок - " + totalPurchasesMade);
        } else if (!counter(product)) {
            throw new ToyException("Игрушек " + product.title + " больше нет на складе");
        }

        String str = "Покупатель - " + customer.name
                + " Игрушка - " + " " + product.title
                + " Номер заказа - " + " " + order.number;
        totalPurchasesMade++;
        write(str);
        return str;
    }
    public void write(String s) throws Exception {
        try (FileWriter fileWriter = new FileWriter("src//less4//BD.txt", true)) {
            fileWriter.write(s);
            fileWriter.write("\n");
        }
    }
    public boolean busting(String[] list, String name){
        boolean b = true;
        for (int i = 0; i < list.length; i++) {
            if (list[i].equals(name)){
                return false;
            }
        }
        return true;
    }
    public Boolean counter(Product product){
                if (product.title.equals("Car")) {
                    toCar--;
                    if(toCar == -1) return false;
                } else if (product.title.equals("Bear")) {
                    toyBear--;
                    if(toyBear == -1) return false;
                } else if (product.title.equals("Horse")) {
                    toyHorse--;
                    if(toyHorse == -1) return false;
        }
        return true;
    }

    public int getTotalPurchasesMade() {
        return totalPurchasesMade;
    }
}
