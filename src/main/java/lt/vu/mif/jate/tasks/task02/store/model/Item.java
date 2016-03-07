package lt.vu.mif.jate.tasks.task02.store.model;

import java.math.BigInteger;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lt.vu.mif.jate.tasks.task02.search.Searchable;
import lt.vu.mif.jate.tasks.task02.store.Store;

/**
 * Item class.
 * @author valdo
 */
@Getter
@RequiredArgsConstructor
public abstract class Item implements Comparable<Item> {
    
    private final BigInteger id;
    
    @Searchable(field = Store.TITLE_FIELD)
    private final String title;
    
    @Override
    public final int compareTo(final Item o) {
        int c = o.title.compareTo(title);
        if (c == 0) {
            c = o.id.compareTo(id);
        }
        return c;
    }
    
}
