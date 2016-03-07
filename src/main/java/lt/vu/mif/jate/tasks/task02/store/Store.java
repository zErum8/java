package lt.vu.mif.jate.tasks.task02.store;

import java.io.InputStream;
import java.util.Collection;
import lombok.Getter;
import lt.vu.mif.jate.tasks.task02.search.SearchManager;
import lt.vu.mif.jate.tasks.task02.store.model.Item;

/**
 * Top level domain store class.
 * @author valdo
 */
@Getter
public class Store extends SearchManager<Item> {

    /**
     * List of fields used in store
     */
    public static final String TITLE_FIELD = "TITLE";
    public static final String SUBTITLE_FIELD = "SUBTITLE";
    public static final String DESCRIPTION_FIELD = "DESCRIPTION";
    public static final String CATEGORY_FIELD = "CATEGORY";
    public static final String AUTHOR_FIELD = "AUTHOR";
    public static final String PUBLISHER_FIELD = "PUBLISHER";

    /**
     * Load objects from the input stream.
     * @param is input stream.
     */
    public final void load(final InputStream is) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    protected Collection<Item> getSearchItems() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
}
