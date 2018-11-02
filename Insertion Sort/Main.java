public class Main {
    public static void main(String[] args){
        int[] intArray = {12,15,-12,5,34,2,-26};

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++){

            int newElement = intArray[firstUnsortedIndex];

            int i;

            for (i=firstUnsortedIndex; i>0 && intArray[i-1] > newElement; i--){
                intArray[i] = intArray[i-1];
                 //Iterations
                for (int j=0;j<intArray.length;j++){
                    System.out.println(intArray[j]); 
                }

                System.out.println("\n");
            }
            intArray[i] = newElement;

        }
        System.out.println("\n");
        for (int i=0;i<intArray.length;i++){
            System.out.println(intArray[i]);
        }
    }

}