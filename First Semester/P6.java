package lab3;

public class P6 {
	public static <T> int count(T[] array, T item)
    {
            int counter=0;
            for(int i=0;i<=array.length;i++)
                    if(array[i].equals(item))
                            counter++;
            return counter;
    }
    public static void main(String[] args) {
            Integer[] intArray = { 2, 2, 3, 2, 5 };
            int counter=count(intArray,2);
            System.out.println("count of the occurrence of 2 :  "+counter);
            
            Double[] doubleArray = { 2.2, 2.2, 3.3, 2.3, 5.5 };
            counter=count(doubleArray,2.2);
            System.out.println("count of the occurrence of 2.2:  "+counter);
            
            Character[] charArray = { 'H','E','L','L' };
            counter=count(charArray,'L');
            System.out.println("count of the occurrence of L:  "+counter);
    }
}

