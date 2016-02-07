package sml;



/**
 * BNZ Instruction
 * @author snewnham
 *
 */

public class BnzInstruction extends Instruction{

    private int op1;
    private String newLabel;
	
    public BnzInstruction(String label, String op) {
        super(label, op);
    }
    
    public BnzInstruction(String label, int op1, String newLabel) {
        this(label, "bnz");
 
        this.op1 = op1;
        this.newLabel = newLabel; 
    }
      
    @Override
    public void execute(Machine m) {
        int value1 = m.getRegisters().getRegister(op1);
        if(value1 != 0){
        	Labels machineLabels = m.getLabels();
        	int index = machineLabels.indexOf(this.newLabel);
        	m.setPc(index);
        }
    }
    
    @Override
    public String toString() {
        return super.toString() + " return to line " + this.newLabel;
    }
}
