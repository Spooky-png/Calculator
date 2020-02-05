class Calculator implements java.io.Serializable {
    private double operandOne;
    private double operandTwo;
    private String operation;
    private double results;
    public Calculator(){
    }
    public Calculator(String operation){
        this.operation = operation;
    }
    public void setOperandOne(int c) {
    	operandOne = c;
    }
    public void setOperandTwo(int b) {
    	operandTwo = b;
    }
    public void setOperation(String n){
        operation = n;
    }
    public double getResults(){
    	System.out.println(results);
        return results;
    }
    public void performOperation() {
    	if(operation == "+") {
    	results = operandOne + operandTwo;
    	}
    	if(operation == "-") {
		results = operandOne - operandTwo;
    	}
    	if(operation != "+" && operation != "-") {
    		System.out.println("wat");
    	}
    }
}