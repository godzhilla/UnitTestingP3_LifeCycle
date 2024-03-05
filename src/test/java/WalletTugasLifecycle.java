import org.example.WalletTugas;
import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class WalletTugasLifecycle {

    WalletTugas wallet;

    @BeforeAll
    public void initClass() {
        wallet = new WalletTugas("Mark Lee");
    }

    @AfterAll
    public void clearClass() {
        wallet = null;
    }

    @BeforeEach
    public void initMethod() {
        wallet.addMoney(2000);
        wallet.addMoney(100000);
        wallet.addMoney(50000);
        wallet.addMoney(50000);
        wallet.addCoin(500);
        wallet.addCoin(1000);
        wallet.addCoin(100);
        wallet.addCoin(100);
        wallet.addCard("KTM");
        wallet.addCard("SIM");
        wallet.addCard("PC Mark Lee");
    }

    @AfterEach
    public void clearMethod() {
        wallet.getMoney().clear();
        wallet.getCoins().clear();
        wallet.getCards().clear();
        wallet.resetMoney();
    }

    @Test
    void testGetOwner() {
        Assertions.assertEquals("Mark Lee", wallet.getOwner());
        System.out.println(wallet.getOwner());
    }

    @Test
    void testAddMoney() {
        Assertions.assertEquals("{2000=1, 10000=0, 20000=0, 50000=2, 100000=1, 1000=0, 5000=0}", wallet.getMoney().toString());
        System.out.println(wallet.getMoney().toString());
    }

    @Test
    void testAddCoin() {
        Assertions.assertEquals("{100=2, 500=1, 1000=1}", wallet.getCoins().toString());
        System.out.println(wallet.getCoins().toString());
    }

    @Test
    void testCalculateMoney(){
        Assertions.assertEquals(202000, wallet.calculateMoneys());
        System.out.println(wallet.calculateMoneys());
    }

    @Test
    void testCalculateCoins() {
        wallet.takeCoins(100);
        wallet.takeCoins(100);
        wallet.takeCoins(100);
        Assertions.assertEquals(1400, wallet.calculateCoins());
    }

    @Test
    void testGetMoneyAvailable() {
        wallet.takeMoneys(100000);
        wallet.takeMoneys(100000);
        wallet.takeCoins(100);
        wallet.takeCoins(100);

        Assertions.assertEquals(3500, wallet.getMoneyAvailable());
        System.out.println("Sisa uang di dompet " + wallet.getOwner() + " sejumlah " + wallet.getMoneyAvailable());
    }

    @Test
    void testGetCard() {
        Assertions.assertFalse(wallet.getCards().isEmpty());
        System.out.println(wallet.getCards());
    }
}
