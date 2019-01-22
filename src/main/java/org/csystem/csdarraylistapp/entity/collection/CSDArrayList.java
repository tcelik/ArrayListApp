package org.csystem.csdarraylistapp.entity.collection;

//Object [] dizisi tutan bir veri yapısı.
public class CSDArrayList {
    private Object [] m_elems; //elemanlarımın tutululduğu object dizisi.
    private static final int DEFAULT_CAPACITY = 10;
    private int m_index;

    private void allocateCapacity(int capacity)
    {
        Object [] temp = new Object[capacity];

        for (int i = 0; i < m_elems.length; ++i) {
            temp[i] = m_elems[i];
        }

        m_elems = temp;
    }

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

    public boolean add(Object elem)
    {
        //kontrol elem null ise gibi
        if (m_index == m_elems.length)
            this.allocateCapacity(m_elems.length * 2);

        //gelen elemanı diziye ekle
        m_elems[m_index++] = elem;
        return true;
    }

    public int capacity()
    {
        return m_elems.length;
    }

    public void clear()
    {
        //m_elems = new Object[m_elems.length];
        for (int i = 0; i < m_index; ++i)
            m_elems[i] = null;
        m_index = 0;
    }
}
