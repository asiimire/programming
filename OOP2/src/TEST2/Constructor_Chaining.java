package TEST2;

public class Constructor_Chaining {
    private int value1;
    private int value2;

    // First constructor with two parameters
    public Constructor_Chaining(int value1, int value2){
        this.value1 = value1;
        this.value2 = value2;
    }
    
    // Second constructor with one parameter,
    //chaining to the first constructor
    public Constructor_Chaining(int value1){
        this(value1,0);//keep value2 constant
        // Calls the first constructor with default value for value2
    }

    // Default constructor, chaining to the second constructor
    public Constructor_Chaining(){
        this(0);
        // Calls the second constructor with default value for value1
    }

    public void displayValues(){
        System.out.println("Value1: " + value1);
        System.out.println("Value2: " + value2);
    }

    public static void main(String[] args) {
        Constructor_Chaining cc1 = new Constructor_Chaining(10, 20);
        cc1.displayValues();

        Constructor_Chaining cc2 = new Constructor_Chaining(5);
        cc2.displayValues();

        Constructor_Chaining cc3 = new Constructor_Chaining();
        cc3.displayValues();
    }
}
