public class MyStringBuffer implements IStringBuffer {
    int capacity = 16;
    int length = 0;
    char[] value;

    public MyStringBuffer() {
        value = new char[capacity];
    }

    public MyStringBuffer(String str) {
        if (str != null)
            value = str.toCharArray();
        length = value.length;
        if (capacity < value.length)
            capacity = value.length * 2;
    }

    public void append(String str) {
        insert(length, str);
    };

    public void append(char c) {
        insert(length, c);
    };

    public void insert(int pos, char b) {
        insert(pos, ((Character) b).toString());
    };

    public void insert(int pos, String b) {
        if (pos < 0)
            return;
        if (b == null)
            return;
        if (pos > length)
            return;
        do {
            capacity *= 1.5;
            char[] newValue = new char[capacity];
            System.arraycopy(value, 0, newValue, 0, length);
            value = newValue;
        } while (length + b.length() > capacity);
        char[] cs = b.toCharArray();
        System.arraycopy(value, pos, value, pos + cs.length, length - pos);
        System.arraycopy(cs, 0, value, pos, cs.length);
        length = length + cs.length;
    };

    public void delete(int start) {
        delete(start, length-1);
    };

    public void delete(int start, int end) {
        //  边界条件判断；
        if(start<0||end>length-1||start>end)return;
        char[] cs = new char[length - end + start - 1];
        System.arraycopy(value, 0, cs, 0, start);
        System.arraycopy(value, end + 1, cs, start, length - end - 1);
        value = cs;
    };

    public void reverse() {
        for (int i = 0; i < value.length / 2; i++) {
            char temp = value[i];
            value[i] = value[value.length - 1 - i];
            value[value.length - 1 - i] = temp;
        }
    };

    public int length() {
        return length;
    };

    @Override
    public String toString() {
        return new String(value);
    }

    public static void main(String[] args) {
        MyStringBuffer myStrBuff = new MyStringBuffer("dfdff");
        myStrBuff.delete(1);
        System.out.println(myStrBuff);
    }
}