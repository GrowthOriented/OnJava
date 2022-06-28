package com.growth.onjava.generics.stack;

/**
 * 用内部链式结构实现的栈
 *
 * @author Growth
 * @email GrowthOriented@163.com
 * @date 2022/6/28 8:23 AM
 *
 * 示例利用了末端哨兵来检查栈何时为空。
 * 末端哨兵在LinkedStack完成构造后被创建，每次调用push() 都会创建一个新的Node<T>，并被链接到前一个Node<T>。
 * 调用pop()时总会返回top.item，然后丢弃当前的Node<T>，并移动到下一个Node<T>，直到命中末端哨兵，这时便会停止移动。
 * 如果调用者继续调用pop()，便会一直返回null，这表明栈已为空。
 */
public class LinkedStack<T> {
    private static class Node<U> {
        U item;
        Node<U> next;

        Node() {
            this.item = null;
            this.next = null;
        }

        Node(U item, Node<U> next) {
            this.item = item;
            this.next = next;
        }

        boolean end() {
            return item == null && next == null;
        }
    }

    private Node<T> top = new Node<>(); //末端哨兵

    public void push(T item) {
        top = new Node<>(item, top);
    }

    public T pop() {
        T result = top.item;
        if (!top.end()) {
            top = top.next;
        }
        return result;
    }

    public static void main(String[] args) {
        LinkedStack<String> lss = new LinkedStack<>();
        for (String s : "Phasers on Stun".split(" ")) {
            lss.push(s);
        }
        String s;
        while ((s = lss.pop()) != null) {
            System.out.println(s);
        }
    }
}
