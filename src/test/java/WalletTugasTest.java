import org.example.WalletTugas;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

public class WalletTugasTest {

    @Test
    void testGetOwner() {
        WalletTugas wallet = new WalletTugas("Mark Lee");
        Assertions.assertEquals("Mark Lee", wallet.getOwner());
    }

    @Test
    void testAddMoney() {
        WalletTugas wallet = new WalletTugas("Mark Lee");
        wallet.addMoney(2000);
        wallet.addMoney(100000);
        wallet.addMoney(50000);
        wallet.addMoney(50000);
        Assertions.assertEquals("{2000=1, 10000=0, 20000=0, 50000=2, 100000=1, 1000=0, 5000=0}", wallet.getMoney().toString());

//      menguji penambahan uang kertas yang tidak termasuk dalam list jenis-jenis uang kertas
        wallet.addMoney(7000);
        Assertions.assertEquals("{2000=1, 7000=0, 10000=0, 20000=0, 50000=1, 100000=1, 1000=0, 5000=0}", wallet.getMoney().toString());
    }

    @Test
    void testAddCoin() {
        WalletTugas wallet = new WalletTugas("Na Jaemin");
        wallet.addCoin(500);
        wallet.addCoin(1000);
        wallet.addCoin(100);
        wallet.addCoin(100);
        Assertions.assertEquals("{100=2, 500=1, 1000=1}", wallet.getCoins().toString());

        wallet.addCoin(200);
        Assertions.assertEquals("{100=2, 200=1, 500=1, 1000=1}", wallet.getCoins().toString());
    }

    @Test
    void testCalculateMoney(){
        WalletTugas wallet = new WalletTugas("Mark");
        wallet.addMoney(100000);
        wallet.addMoney(50000);
        wallet.takeMoneys(5000);
        wallet.takeMoneys(2000);
        Assertions.assertEquals(143000, wallet.calculateMoneys());
    }

    @Test
    void testCalculateCoins() {
        WalletTugas wallet = new WalletTugas("Shila");
        wallet.addCoin(500);
        wallet.addCoin(500);
        wallet.addCoin(1000);
        wallet.takeCoins(100);
        wallet.takeCoins(100);
        wallet.takeCoins(100);
        Assertions.assertEquals(1700, wallet.calculateCoins());
    }

    @Test
    void testGetMoneyAvailable() {
        WalletTugas wallet = new WalletTugas("Shila");
        wallet.addCoin(500);
        wallet.addMoney(50000);
        wallet.addCoin(100);
        wallet.addCoin(100);
        wallet.addMoney(2000);
        wallet.addMoney(5000);

        Assertions.assertEquals(57000, wallet.calculateMoneys());
        Assertions.assertEquals(700, wallet.calculateCoins());
        Assertions.assertEquals(57700, wallet.getMoneyAvailable());
    }
}
