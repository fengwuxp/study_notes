package test.com.wuxp.study.array;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * SimpleArrayList Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>二月 6, 2019</pre>
 */
public class SimpleArrayListTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }


    @Test
    public void testA() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);

        Integer[] a = new Integer[]{11, 12, 14, 15};
        Integer[] n = list.toArray(a);
        System.out.println(n[2]);

        Map<Integer,String> map=new ConcurrentHashMap<Integer, String>();
        map.put(1,"1");
        map.put(100,"1");
        map.put(1234567890,"1--");
        AtomicLong atomicLong=new AtomicLong();
        long l = atomicLong.incrementAndGet();
        System.out.println(l);

    }

    /**
     * Method: size()
     */
    @Test
    public void testSize() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: isEmpty()
     */
    @Test
    public void testIsEmpty() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: contains(Object o)
     */
    @Test
    public void testContains() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: iterator()
     */
    @Test
    public void testIterator() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: toArray()
     */
    @Test
    public void testToArray() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: toArray(T[] a)
     */
    @Test
    public void testToArrayA() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: add(E e)
     */
    @Test
    public void testAddE() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: remove(Object o)
     */
    @Test
    public void testRemoveO() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: containsAll(Collection<?> c)
     */
    @Test
    public void testContainsAll() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: addAll(Collection<? extends E> c)
     */
    @Test
    public void testAddAllC() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: addAll(int index, Collection<? extends E> c)
     */
    @Test
    public void testAddAllForIndexC() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: removeAll(Collection<?> c)
     */
    @Test
    public void testRemoveAll() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: retainAll(Collection<?> c)
     */
    @Test
    public void testRetainAll() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: clear()
     */
    @Test
    public void testClear() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: get(int index)
     */
    @Test
    public void testGet() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: set(int index, E element)
     */
    @Test
    public void testSet() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: add(int index, E element)
     */
    @Test
    public void testAddForIndexElement() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: remove(int index)
     */
    @Test
    public void testRemoveIndex() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: indexOf(Object o)
     */
    @Test
    public void testIndexOf() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: lastIndexOf(Object o)
     */
    @Test
    public void testLastIndexOf() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: listIterator()
     */
    @Test
    public void testListIterator() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: listIterator(int index)
     */
    @Test
    public void testListIteratorIndex() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: subList(int fromIndex, int toIndex)
     */
    @Test
    public void testSubList() throws Exception {
//TODO: Test goes here... 
    }


} 
