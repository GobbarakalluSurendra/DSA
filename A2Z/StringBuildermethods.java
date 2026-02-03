class Solution {
    public static void main(String[] args) {

        // 1. Create StringBuilder object
        StringBuilder sb = new StringBuilder("Hello");

        // 2. append()
        sb.append(" World");
        System.out.println("After append(): " + sb);

        // 3. insert()
        sb.insert(5, " Java");
        System.out.println("After insert(): " + sb);

        // 4. replace()
        sb.replace(6, 10, "Python");
        System.out.println("After replace(): " + sb);

        // 5. delete()
        sb.delete(6, 12);
        System.out.println("After delete(): " + sb);

        // 6. deleteCharAt()
        sb.deleteCharAt(5);
        System.out.println("After deleteCharAt(): " + sb);

        // 7. charAt()
        char ch = sb.charAt(1);
        System.out.println("Character at index 1: " + ch);

        // 8. setCharAt()
        sb.setCharAt(0, 'Y');
        System.out.println("After setCharAt(): " + sb);

        // 9. reverse()
        sb.reverse();
        System.out.println("After reverse(): " + sb);

        // 10. length()
        System.out.println("Length: " + sb.length());

        // 11. capacity()
        System.out.println("Capacity: " + sb.capacity());

        // 12. ensureCapacity()
        sb.ensureCapacity(50);
        System.out.println("Capacity after ensureCapacity(50): " + sb.capacity());

        // 13. substring()
        String sub = sb.substring(0, 5);
        System.out.println("Substring (0,5): " + sub);

        // 14. toString()
        String str = sb.toString();
        System.out.println("Converted to String: " + str);
    }
}
