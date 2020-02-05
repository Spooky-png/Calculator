
public class CalculatorTest {

	public static void main(String[] args) {
		Calculator g = new Calculator();
		g.setOperandOne(4);
		g.setOperandTwo(4);
		g.setOperation("3");
		g.performOperation();
		g.getResults();

	}

}
