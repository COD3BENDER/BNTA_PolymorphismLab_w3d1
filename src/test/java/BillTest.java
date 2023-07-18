import models.Bill;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BillTest {

    Bill bill;
    Bill billLow;

    @BeforeEach
    public void setUp(){
        bill = new Bill(50,"BMW",50,50,100);
        billLow = new Bill(30,"BMW",50,50,100);
    }

    @Test
    public void testCalculateInsurance(){
        assertThat(bill.calculateInsurance()).isEqualTo(1000);
    }

    @Test
    public void testCalculateInsuranceAlternate(){
        assertThat(billLow.calculateInsurance()).isEqualTo(200);
    }

    @Test
    public void testOverloadedCalculateInsurance(){
        assertThat(bill.calculateInsurance(100)).isEqualTo(1100);
    }

    @Test
    public void testTotalCost(){
        bill.calculateInsurance(100);
        assertThat(bill.totalCost()).isEqualTo(1300);
    }


}
