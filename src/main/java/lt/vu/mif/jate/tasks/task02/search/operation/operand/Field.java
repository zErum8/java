package lt.vu.mif.jate.tasks.task02.search.operation.operand;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Field operand to indicate searchable field.
 * @author valdo
 */
@Getter
@RequiredArgsConstructor
public class Field implements Operand {

    /**
     * Field name.
     * @return name.
     */
    private final String name;
    
}
