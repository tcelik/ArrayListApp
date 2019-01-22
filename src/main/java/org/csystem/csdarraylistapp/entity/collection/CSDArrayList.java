package org.csystem.csdarraylistapp.entity.collection;

public class CSDArrayList {
    private Object [] m_elems; //elemanlarımın tutululduğu object dizisi.
    private static final int DEFAULT_CAPACITY = 10;

    public CSDArrayList()
    {
        this(DEFAULT_CAPACITY);
    }

    public CSDArrayList(int initialCapacity) throws IllegalArgumentException
    {
        //control point -> exception
        if (initialCapacity < 0)
            throw new IllegalArgumentException("initialCapacity must be higher or equal zero");

        //eğer exception fırlatılmaz ise buradayım.
        m_elems = new Object[initialCapacity == 0 ? DEFAULT_CAPACITY : initialCapacity];
    }

    /*public boolean add(Object elem)
    {
        if (m_index == m_capacity)
            allocate();

        m_elems[m_index++] = elem;
        return true;
    }

    private void allocate()
    {

        m_capacity = m_capacity * 2;
        Object [] result = new Object[m_capacity];

        for (int i = 0; i < m_elems.length; ++i) {
            result[i] = m_elems[i];
        }
        m_elems = result;
    }*/
}
