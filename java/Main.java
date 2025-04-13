public class Main {
    public static void main(String[] args) {
        System.out.println("=== Testing MyArrayList ===");
        testMyArrayList();

        System.out.println("\n=== Testing MyLinkedList ===");
        testMyLinkedList();

        System.out.println("\n=== Testing MyStack ===");
        testMyStack();

        System.out.println("\n=== Testing MyQueue ===");
        testMyQueue();

        System.out.println("\n=== Testing MyMinHeap ===");
        testMyMinHeap();
    }

    public static void testMyArrayList() {
        MyList<Integer> list = new MyArrayList<>();

        list.add(10);
        list.addFirst(5);
        list.addLast(15);
        list.add(1, 7);

        System.out.println("List after adding: " + arrayToString(list.toArray()));

        int removed = list.remove(1);
        System.out.println("Deleted element: " + removed);
        System.out.println("List after deleting: " + arrayToString(list.toArray()));

        list.sort();
        System.out.println("Sorted List: " + arrayToString(list.toArray()));
    }

    public static void testMyLinkedList() {
        MyList<String> list = new MyLinkedList<>();

        list.add("Apple");
        list.addFirst("Banana");
        list.addLast("Cherry");

        System.out.println("List: " + arrayToString(list.toArray()));
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());

        String removed = list.removeLast();
        System.out.println("Last removed: " + removed);
    }

    public static void testMyStack() {
        MyStack<Character> stack = new MyStack<>();

        stack.push('A');
        stack.push('B');
        stack.push('C');

        System.out.println("Top of Stack: " + stack.peek());
        System.out.println("Size of Stack: " + stack.size());

        while (!stack.isEmpty()) {
            System.out.println("Pulled: " + stack.pop());
        }
    }

    public static void testMyQueue() {
        MyQueue<String> queue = new MyQueue<>();

        queue.enqueue("First");
        queue.enqueue("Second");
        queue.enqueue("Third");

        System.out.println("First in the queue: " + queue.peek());
        System.out.println("Size of queue: " + queue.size());

        while (!queue.isEmpty()) {
            System.out.println(": " + queue.dequeue());
        }
    }

    public static void testMyMinHeap() {
        MyMinHeap<Integer> heap = new MyMinHeap<>();

        heap.insert(5);
        heap.insert(3);
        heap.insert(8);
        heap.insert(1);

        System.out.println("Min element: " + heap.getMin());
        System.out.println("Size of heap: " + heap.size());

        System.out.println("element extraction:");
        while (!heap.isEmpty()) {
            System.out.println(heap.extractMin());
        }
    }

    private static String arrayToString(Object[] array) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}