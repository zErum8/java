package lt.vu.mif.jate.tasks.task02.search;

import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;
import lt.vu.mif.jate.tasks.task02.search.operation.Operation;

/**
 * Search Manager to be extended by domain class.
 * @author valdo
 * @param <T> collection element type.
 */
public abstract class SearchManager<T extends Comparable<T>> {
    
    /**
     * Get collection of elements to search in.
     * @return collection.
     */
    protected abstract Collection<T> getSearchItems();
    
    /**
     * Search for items in collection.
     * @param operation operation for the search.
     * @return found elements.
     */
    public final SortedSet<T> findItems(final Operation operation) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    /**
     * Return the list of unique values indicated by the keywords.
     * @param field field to search.
     * @return set of values.
     */
    public final Set<String> getValueList(final String field) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}