public class VendingMachineTest {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

  
        vendingMachine.insertCoin(10);
        vendingMachine.dispenseItem();
        vendingMachine.selectItem("Coffee");
        vendingMachine.selectItem("Milk");


        vendingMachine.selectItem("Coffee");
        vendingMachine.dispenseItem();
        vendingMachine.setOutOfOrder();
        
        vendingMachine.selectItem("Coffee");
        vendingMachine.insertCoin(10);
        vendingMachine.dispenseItem();

        vendingMachine.selectItem("Coffee");
         vendingMachine.insertCoin(10);
         vendingMachine.dispenseItem();
    }
}
