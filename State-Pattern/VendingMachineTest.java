public class VendingMachineTest {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

  
        vendingMachine.insertCoin(1);
        vendingMachine.dispenseItem();
        vendingMachine.selectItem("Milk");
        vendingMachine.selectItem("Coffee");


        vendingMachine.selectItem("Coffee");
        vendingMachine.dispenseItem();

       
        vendingMachine.selectItem("Coffee");
        vendingMachine.insertCoin(30);
        vendingMachine.dispenseItem();

        vendingMachine.setOutOfOrder();
        vendingMachine.selectItem("Coffee");
        vendingMachine.insertCoin(25);
        vendingMachine.dispenseItem();
    }
}