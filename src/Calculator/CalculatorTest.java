package Calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {
private Calculator temp1;
	
	
	@Test
	void test() {
	int a = 4;
	int b = 5;
		Calculator temp1 = new Calculator();
        int finalTemp = temp1.add(a, b);
		
        assertEquals(9, finalTemp, "error in add()");
        assertNotEquals(-2147483647, finalTemp, "error in add()");
        assertNotEquals(2147483647, finalTemp,"error in add()");
	}

}
