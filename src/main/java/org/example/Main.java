package org.example;

public class Main {
    public static void main(String[] args) {
        WalletTugas myWallet = new WalletTugas("Mark Lee");
        myWallet.addMoney(20000);
        myWallet.addMoney(50000);
        myWallet.addMoney(1000);
        myWallet.addMoney(1000);
        myWallet.addMoney(2000);
        myWallet.addCoin(500);
        myWallet.addCoin(500);
        myWallet.addCoin(500);
        myWallet.addCard("Credit Card");
        myWallet.addCard("SIM");
        myWallet.addCard("KTP");
        myWallet.takeCard("SIM");
        myWallet.takeCoins(500);
        myWallet.takeCoins(500);
        myWallet.takeMoneys(20000);
        System.out.println("Jumlah uang di dompet " + myWallet.getOwner() + " sejumlah " + myWallet.getMoney());
        System.out.println("Jumlah koin tersisa di dompet " + myWallet.getOwner() + " sejumlah " + myWallet.getCoins());
        System.out.println("Kartu yang terdapat di dompet " + myWallet.getOwner() + " adalah " + myWallet.getCards());
        System.out.println("Sisa uang di dalam dompet " + myWallet.getOwner() + " sebanyak " + myWallet.getMoneyAvailable());
    }
}