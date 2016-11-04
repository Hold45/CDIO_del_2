package Player;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;


public class AccountTest {
	public Account account;

	@Before
	public void setup() throws Exception{
		this.account = new Account(1000);
	}

	@After
	public void after() throws Exception{
		this.account = null;
	}


	@Test
	public void testGetMoney() throws Exception {
		assertThat(this.account.getMoney()).isEqualTo(1000);
	}

	@Test
	public void testSetMoney() throws Exception {
		assertThat(this.account.setMoney(200).getMoney()).isEqualTo(200);
	}

	@Test
	public void testAddMoney() throws Exception {
		assertThat(this.account.addMoney(200).getMoney()).isEqualTo(1200);
	}

	@Test
	public void testTakeMoney() throws Exception {
		assertThat(this.account.takeMoney(200)).isTrue();
		assertThat(this.account.getMoney()).isEqualTo(800);
	}

	@Test
	public void testTakeMoneyToManyMoney() throws Exception {
		assertThat(this.account.takeMoney(1001)).isFalse();
		assertThat(this.account.getMoney()).isEqualTo(0);
	}


}