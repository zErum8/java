package lt.vu.mif.jate.tasks.task02.search.operation;

import lombok.Getter;
import lt.vu.mif.jate.tasks.task02.search.operation.operand.Operand;
import lt.vu.mif.jate.tasks.task02.search.operation.operator.BinaryOperator;

/**
 * Binary operation, i.e. x = y.
 * Takes 2 operands and Operation.
 * @author valdo
 */
@Getter
public class BinaryOperation extends FinalOperation<BinaryOperator> {
    
    /**
     * First operand.
     */
    private final Operand operand1;
    
    /**
     * Second operand.
     */
    private final Operand operand2;
    
    /**
     * Constructor.
     * @param operator operator.
     * @param opd1 first operand.
     * @param opd2 second operand.
     */
    public BinaryOperation(final BinaryOperator operator, final Operand opd1, final Operand opd2) {
        super(operator);
        this.operand1 = opd1;
        this.operand2 = opd2;
    }
    
}
