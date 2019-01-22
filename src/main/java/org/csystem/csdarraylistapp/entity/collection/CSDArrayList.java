package org.csystem.csdarraylistapp.entity.collection;

public class CSDArrayList {
    private int m_index;
    private int m_capacity;
    private Object [] m_elems;

    public CSDArrayList(int capacity)
    {
        m_capacity = capacity;
        m_elems = new Object[capacity];
    }

    public boolean add(Object elem)
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
    }
}
