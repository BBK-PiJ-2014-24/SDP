package tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestInstruction_Add.class,
				TestInstruction_Subtract.class,
				TestInstruction_Multiply.class,
				TestInstruction_Divide.class,
				TestInstruction_Lin.class,
				TestInstruction_Bnz.class,
				TestReflections.class,
				TestInstruction_Out.class
				
				
				
})
public class SmlTestSuite {

}
