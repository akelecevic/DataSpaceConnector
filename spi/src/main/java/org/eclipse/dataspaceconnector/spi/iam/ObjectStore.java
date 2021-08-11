package org.eclipse.dataspaceconnector.spi.iam;

import java.util.List;

public interface ObjectStore<T> {
    List<T> getAll(int limit);

    List<T> getAfter(String continuationToken);

    boolean save(T didDocument);

    T getLatest();
}
